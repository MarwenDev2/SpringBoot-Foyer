package tn.esprit.tpfoyer.Controlllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.ChambreServiceImpl;
import tn.esprit.tpfoyer.Services.FoyerServiceImpl;
import tn.esprit.tpfoyer.Services.IFOyerService;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {

    private IFOyerService
            foyerServiceImpl;

    // GET: http://localhost:8089/tpfoyer/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        return foyerServiceImpl.retrieveAllFoyers();
    }

    // GET: http://localhost:8089/tpfoyer/foyer/retrieve-foyer/{foyer-id}
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId) {
        return foyerServiceImpl.retrieveFoyer(foyerId);
    }

    // POST: http://localhost:8089/tpfoyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerServiceImpl.addFoyer(f);
    }

    // DELETE: http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerServiceImpl.removeFoyer(foyerId);
    }

    // PUT: http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        return foyerServiceImpl.modifyFoyer(f);
    }
}
