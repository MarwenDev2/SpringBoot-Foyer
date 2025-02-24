package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.Optional;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}