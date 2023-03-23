package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Scheda;
import com.webapp.gymtrainigexercisesAPI.Model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User getUserById(int id);

    public User getUserByEmail(String email);

    public User getUserByUsername(String username);

    public List<Scheda> getAllSchedeByIdUtente(int idUtente);



}
