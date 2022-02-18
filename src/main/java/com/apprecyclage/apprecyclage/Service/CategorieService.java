package com.apprecyclage.apprecyclage.Service;
import com.apprecyclage.apprecyclage.model.Categorie;

import java.util.List;

public interface CategorieService {
    public Categorie ajoutCategorie(Categorie categorie);
    public Categorie modifierCategorie(Categorie categorie, Long idcat);
    public List<Categorie> listerCategorie();
    public String supprimerCategorie(Long idcat);
    public Categorie getCategorieById(Long idcat);
}
