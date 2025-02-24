package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFOyerService {

    List<Foyer> retrieveAllFoyers();

    Foyer retrieveFoyer(Long foyerId);

    Foyer addFoyer(Foyer f);

    void removeFoyer(Long foyerId);

    Foyer modifyFoyer(Foyer foyer);
}
