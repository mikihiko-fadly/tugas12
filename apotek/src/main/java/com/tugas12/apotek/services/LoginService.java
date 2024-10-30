package com.tugas12.apotek.services;

import com.tugas12.apotek.models.Login;
import com.tugas12.apotek.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public Login authenticate(String username, String password) {
        return loginRepository.findByUsernameAndPassword(username, password);
    }

    public void register(Login login) {
        loginRepository.save(login);
    }
}
