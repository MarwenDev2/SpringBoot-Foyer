package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre" )
    private long idChambre;

    @Column(name = "numeroChambre" )
    private long numeroChambre;

    @Enumerated
    private TypeChambre typeC;
}
