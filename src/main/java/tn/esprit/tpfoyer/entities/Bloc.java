package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc" )
    private long idBloc;

    @Column(name = "nomBloc" )
    private String nomBloc;

    @Column(name = "prenomEt" )
    private String prenomEt;

    @Column(name = "capaciteBloc" )
    private long capaciteBloc;
}
