package com.restApi.librarium.services;

import com.restApi.librarium.models.UserModel;
import com.restApi.librarium.repos.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;

    public UserModel getUser(Long ID) throws Exception {
        if (ID < 0) throw new Exception("the given ID must be a positive value");
        return userRepo.getReferenceById(ID);
    }

    public List<UserModel> getUsers() {
        return userRepo.findAll();
    }

    public void setUser(UserModel user) {
        userRepo.save(user);
    }
}
