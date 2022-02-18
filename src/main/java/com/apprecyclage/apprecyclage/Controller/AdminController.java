package com.apprecyclage.apprecyclage.Controller;

import com.apprecyclage.apprecyclage.ServiceImp.AdminServiceImp;
import com.apprecyclage.apprecyclage.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    AdminServiceImp adminServiceImpl;

    @PostMapping("/ajout_admin/{idSuperAdmin}")
    String addAdmin(@RequestBody Admin admin, @PathVariable Long idSuperAdmin){
        return adminServiceImpl.ajouterAdmin(admin, idSuperAdmin);
    }

    @GetMapping("/afficher_List_admin")
    List<Admin> afficherListAdmin(){
        return adminServiceImpl.afficherListAdmin();
    }

    @GetMapping("/afficherAdminById/{id}")
    Admin afficherAdminById(@PathVariable("id") Long id){
        return adminServiceImpl.afficherAdminById(id);
    }

    @DeleteMapping("/supprimerAdmin/{id}&{idSuperAdmin}")
    public String supprimerAdmin(@PathVariable("id") Long id, @PathVariable("idSuperAdmin") Long idSuperAdmin){
        return adminServiceImpl.supprimerAdmin(id, idSuperAdmin);
    }

    @PutMapping("/modifierAdmin/{id}&{idSuperAdmin}")
    public Admin modifierAdmin(@RequestBody Admin admin, @PathVariable("id") Long id, @PathVariable("idSuperAdmin") Long idSuperAdmin)
    {
        return adminServiceImpl.modifierAdmin(admin, id, idSuperAdmin);
    }

    @PutMapping("/modifierMotDePassAdmin/{id}")
    public String modifierAdminPassword(@PathVariable("id") Long id, @RequestParam String nouveauPassword)
    {
        return adminServiceImpl.modifierPassword(id, nouveauPassword);
    }

    @GetMapping("/authentificationAdmin")
    public Admin connexion(@RequestParam String login, @RequestParam String password)
    {
        return adminServiceImpl.connexion(login, password);
    }


}


