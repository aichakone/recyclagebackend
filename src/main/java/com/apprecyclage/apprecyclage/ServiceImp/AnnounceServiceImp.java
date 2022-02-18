package com.apprecyclage.apprecyclage.ServiceImp;

import com.apprecyclage.apprecyclage.Repository.AnnonceRepository;
import com.apprecyclage.apprecyclage.Service.AnnonceService;
import com.apprecyclage.apprecyclage.model.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.lang.Override;

@Service
public class AnnounceServiceImp implements AnnonceService {

        @Autowired
        AnnonceRepository annonceRepository;

    @Override
    public Annonce ajoutAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }



    @Override
    public List<Annonce> listerAnnonce() {
        return this.annonceRepository.findAll();
    }


    @Override
    @Transactional
    public Annonce modifierAnnonce(Annonce annonce, Long idAnn) {
        Annonce annonceExistant = this.annonceRepository.findById(idAnn).get();
        annonceExistant.setDescription(annonce.getDescription());
        annonceExistant.setGeolocalisation(annonce.getGeolocalisation());
        annonceExistant.setEtat(annonce.getEtat());
        annonceExistant.setDatepublication(annonce.getDatepublication());
        return annonceRepository.save(annonceExistant);
    }
    @Override
    public Annonce getAnnonceById(Long idAnn) {
        return this.annonceRepository.findById(idAnn).get();
    }
    @Override
    public String supprimerAnnonce(Long idAnn) {
        this.annonceRepository.deleteById(idAnn);
        return "Suppression de l'activité";
    }

}


