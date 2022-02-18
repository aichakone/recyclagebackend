package com.apprecyclage.apprecyclage.Controller;

import com.apprecyclage.apprecyclage.ServiceImp.CategorieServiceImp;
import com.apprecyclage.apprecyclage.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/categorie")
class CategorieController {
    @Autowired
    private CategorieServiceImp categorieServiceImp;

    @PostMapping("/ajoutcategorie")
    public Categorie ajoutercategorie(@RequestBody Categorie categorie){
        return categorieServiceImp.ajoutCategorie(categorie) ;
    }
    @GetMapping("listercategorie")
    public List<Categorie> listerCategorie(){
        return categorieServiceImp.listerCategorie();
    }

    @PutMapping("modifiercategorie/{idcat}")
    public Categorie modifiercategorie(@RequestBody Categorie categorie,@PathVariable("idcat") Long idcat){
        return  categorieServiceImp.modifierCategorie(categorie,idcat);
    }
    @GetMapping("/infoannonce/{idcat}")
    public Categorie getAnnonceById(@PathVariable("idcat") Long idcat){
        return this.categorieServiceImp.getCategorieById(idcat);
    }

    @DeleteMapping("supprimercategorie/{idcat}")
    public  String supprimerCategorie(@PathVariable("idcat") Long idcat){
        categorieServiceImp.supprimerCategorie(idcat);
        return "successssss";
    }
}


