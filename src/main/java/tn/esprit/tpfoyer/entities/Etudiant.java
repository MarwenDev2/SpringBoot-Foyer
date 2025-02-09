package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant" )
    private long idEtudiant;

    @Column(name = "nomE" )
    private String nomEt;

    @Column(name = "prenomE" )
    private String prenomEt;

    private long cin;

    private String ecole;

    @Column(name = "dateNaissance" )
    private Date dateNaissance;
}
