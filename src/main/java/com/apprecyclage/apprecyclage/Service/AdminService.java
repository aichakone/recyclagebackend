package com.apprecyclage.apprecyclage.Service;

import com.apprecyclage.apprecyclage.Profile;
import com.apprecyclage.apprecyclage.model.Admin;

import java.util.List;

public interface AdminService {
    String ajouterAdmin(Admin administrateur, Long idSuperAdmin);
    List<Admin> afficherListAdmin();
    String supprimerAdmin(Long id, Long idSuperAdmin);
    Admin modifierAdmin(Admin administrateur, Long id, Long idSuperAdmin );
    Admin afficherAdminById(Long id);
    String modifierPassword(Long id, String nouveauPassword);
    Admin connexion(String login, String password);
    List<Profile> listProfile();
    String addProfile(Profile profile, Long idSuperAdmin);
    String deleteProfile(Long id, Long idSuperAdmin);
}

