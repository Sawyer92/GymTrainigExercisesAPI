package com.webapp.gymtrainigexercisesAPI.Controller;

import com.webapp.gymtrainigexercisesAPI.Model.Scheda;
import com.webapp.gymtrainigexercisesAPI.Model.User;
import com.webapp.gymtrainigexercisesAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping(path="/api")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(path = "/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/getAllUserById")
    public User getUserById(@RequestParam int id){
        return userService.getUserById(id);
    }

    @GetMapping(path = "/getSchedaByIdUser")
    public List<Scheda> ottieniSchedaByIdUser(@RequestParam int idUser){
        return userService.getAllSchedeByIdUtente(idUser);
    }

}
