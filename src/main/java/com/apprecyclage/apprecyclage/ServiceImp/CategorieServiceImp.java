package com.apprecyclage.apprecyclage.ServiceImp;

import com.apprecyclage.apprecyclage.Repository.CategorieRespository;
import com.apprecyclage.apprecyclage.Service.CategorieService;
import com.apprecyclage.apprecyclage.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategorieServiceImp implements CategorieService {
    @Autowired
    CategorieRespository categorieRespository;
    @Override
    public Categorie ajoutCategorie(Categorie categorie) {
        return categorieRespository.save(categorie);
    }

    @Override
    public Categorie modifierCategorie(Categorie categorie, Long idcat) {
        Categorie categ = categorieRespository.findById(idcat).get();
        categ.setType(categorie.getType());
        return categorieRespository.save(categ);
    }

    @Override
    public List<Categorie> listerCategorie() {
        return categorieRespository.findAll();
    }

    @Override
    public String supprimerCategorie(Long idcat) {
       this. categorieRespository.deleteById(idcat);
        return "suppression succès";
    }

    @Override
    public Categorie getCategorieById(Long idcat) {
        return this.categorieRespository.findById(idcat).get();
    }
}
