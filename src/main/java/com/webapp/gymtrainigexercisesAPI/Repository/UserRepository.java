package com.webapp.gymtrainigexercisesAPI.Repository;

import com.webapp.gymtrainigexercisesAPI.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
