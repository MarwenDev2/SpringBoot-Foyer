package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @Column(name = "idReservation" )
    private String idReservation;

    @Column(name = "anneeUniversitaire" )
    private Date anneeUniversitaire;

    @Column(name = "estValide" )
    private boolean estValide;

    @ManyToOne
    private Chambre chambre;

    @ManyToMany
    private Set<Etudiant> etudiants;
}
