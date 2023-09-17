package com.horizon.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horizon.restapi.database.RepositorieUsers;
import com.horizon.restapi.entities.Users;

@RestController
@RequestMapping("/users")
public class UsersREST {
    @Autowired
    private RepositorieUsers repositorie;

    @GetMapping
    public List<Users> show(){
        return repositorie.findAll();
    }

    @PostMapping
    public void save(@RequestBody Users users){
        repositorie.save(users);
    }

    @PutMapping
    public void change(@RequestBody Users users){
        if(users.getId() > 0)
        repositorie.save(users);
    }

    @DeleteMapping
    public void delete(@RequestBody Users users){
        repositorie.delete(users);
    }
}
