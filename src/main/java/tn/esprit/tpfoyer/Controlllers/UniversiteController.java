package tn.esprit.tpfoyer.Controlllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.ChambreServiceImpl;
import tn.esprit.tpfoyer.Services.IUniversiteService;
import tn.esprit.tpfoyer.Services.UniversiteServiceImpl;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    private IUniversiteService universiteServiceImpl;

    // GET: http://localhost:8089/tpfoyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        return universiteServiceImpl.retrieveAllUniversites();
    }

    // GET: http://localhost:8089/tpfoyer/universite/retrieve-universite/{universite-id}
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long universiteId) {
        return universiteServiceImpl.retrieveUniversite(universiteId);
    }

    // POST: http://localhost:8089/tpfoyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteServiceImpl.addUniversite(u);
    }

    // DELETE: http://localhost:8089/tpfoyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long universiteId) {
        universiteServiceImpl.removeUniversite(universiteId);
    }

    // PUT: http://localhost:8089/tpfoyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        return universiteServiceImpl.modifyUniversite(u);
    }
}
