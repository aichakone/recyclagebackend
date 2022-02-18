package com.apprecyclage.apprecyclage.Repository;

import com.apprecyclage.apprecyclage.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
        Optional<Admin> findByLoginAndMotDePass(String login, String password);
        Optional<Admin> findByTelephone(int telephone);
        Optional<Admin> findByEmail(String email);
        Optional<Admin> findByLogin(String login);
}
