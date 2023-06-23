package com.restApi.librarium.controllers;

import com.restApi.librarium.models.BookModel;
import com.restApi.librarium.models.UserModel;
import com.restApi.librarium.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "user/{ID}")
    public UserModel getUser(@PathVariable Long ID) {
        UserModel data = null;
        try {
            data = userService.getUser(ID);
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }

    @GetMapping(value = "users")
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }

    @PostMapping(value = "user")
    public void setUser(@RequestBody UserModel user) {
        userService.setUser(user);
    }
}
