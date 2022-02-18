package com.apprecyclage.apprecyclage.Repository;

import com.apprecyclage.apprecyclage.model.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
    Optional<Annonce> findByCategorie(String categorie);
    Optional<Annonce> findByDescription(int description);

}
