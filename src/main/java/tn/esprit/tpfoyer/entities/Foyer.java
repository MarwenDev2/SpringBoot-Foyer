package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer" )
    private long idFoyer;

    @Column(name = "nomFoyer" )
    private String nomFoyer;

    @Column(name = "capaciteFoyer" )
    private long capaciteFoyer;
}
