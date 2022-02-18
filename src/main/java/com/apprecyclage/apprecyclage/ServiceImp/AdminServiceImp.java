package com.apprecyclage.apprecyclage.ServiceImp;

import com.apprecyclage.apprecyclage.Profile;
import com.apprecyclage.apprecyclage.Repository.AdminRepository;
import com.apprecyclage.apprecyclage.Service.AdminService;
import com.apprecyclage.apprecyclage.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    AdminRepository administrateurRepository;


    @Override
    public String ajouterAdmin(Admin administrateur, Long idSuperAdmin) {
        return null;
    }

    @Override
    public List<Admin> afficherListAdmin() {
        return null;
    }

    @Override
    public String supprimerAdmin(Long id, Long idSuperAdmin) {
        return null;
    }

    @Override
    public Admin modifierAdmin(Admin administrateur, Long id, Long idSuperAdmin) {
        return null;
    }

    @Override
    public Admin afficherAdminById(Long id) {
        return null;
    }

    @Override
    public String modifierPassword(Long id, String nouveauPassword) {
        return null;
    }

    @Override
    public Admin connexion(String login, String password) {
        return null;
    }

    @Override
    public List<Profile> listProfile() {
        return null;
    }

    @Override
    public String addProfile(Profile profile, Long idSuperAdmin) {
        return null;
    }

    @Override
    public String deleteProfile(Long id, Long idSuperAdmin) {
        return null;
    }




}

