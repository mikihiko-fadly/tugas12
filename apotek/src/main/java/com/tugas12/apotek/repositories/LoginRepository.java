package com.tugas12.apotek.repositories;

import com.tugas12.apotek.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer> {
    Login findByUsernameAndPassword(String username, String password);
}
