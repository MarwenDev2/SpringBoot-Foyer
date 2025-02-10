package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

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

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;
}
