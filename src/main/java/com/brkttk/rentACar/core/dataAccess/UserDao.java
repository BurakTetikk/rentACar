package com.brkttk.rentACar.core.dataAccess;

import com.brkttk.rentACar.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User getByEmail(String email);
}
