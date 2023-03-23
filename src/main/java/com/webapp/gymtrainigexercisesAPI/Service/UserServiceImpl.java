package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Scheda;
import com.webapp.gymtrainigexercisesAPI.Model.User;
import com.webapp.gymtrainigexercisesAPI.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    SchedaService schedaService;

    @Override
    public List<User> getAllUsers() {
        List<User> result = (List<User>) userRepository.findAll();
        return result;
    }

    @Override
    public User getUserById(int id) {
        User utenteTrovato = null;
        Optional op = userRepository.findById(id);
        if(op.isPresent()){
            utenteTrovato = (User) op.get();
        }
        return  utenteTrovato;
    }

    @Override
    public User getUserByEmail(String email) {
        List<User> utentiDisponibili = getAllUsers();
        User utente = null;
        for(User u : utentiDisponibili){
            if(u.getEmail().equals(email)){
                utente = u;
                break;
            }
        }
        return utente;
    }

    @Override
    public User getUserByUsername(String username) {
        List<User> utentiDisponibili = getAllUsers();
        User utente = null;
        for(User u : utentiDisponibili){
            if(u.getEmail().equals(username)){
                utente = u;
                break;
            }
        }
        return utente;
    }


    @Override
    public List<Scheda> getAllSchedeByIdUtente(int idUtente) {
        List<Scheda> result = new ArrayList<>();
        List<Scheda> schedeTrovate = schedaService.getAllSchede();

        for(Scheda scheda : schedeTrovate){
            if(scheda.getUtente().getId()==idUtente){
                result.add(scheda);
            }
        }

        return result;
    }
}
