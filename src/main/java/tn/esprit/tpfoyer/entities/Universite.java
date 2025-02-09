package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversitaire" )
    private long idUniversite;

    @Column(name = "nomUniversitaire" )
    private String nomUniversite;

    private String adresse;
}
