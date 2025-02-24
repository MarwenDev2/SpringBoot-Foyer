package tn.esprit.tpfoyer.Controlllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.EtudiantServiceImpl;
import tn.esprit.tpfoyer.Services.IEtudiantService;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {

    private IEtudiantService etudiantServiceImpl;

    // GET: http://localhost:8089/tpfoyer/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantServiceImpl.retrieveAllEtudiants();
    }

    // GET: http://localhost:8089/tpfoyer/etudiant/retrieve-etudiant/{etudiant-id}
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantServiceImpl.retrieveEtudiant(etudiantId);
    }

    // POST: http://localhost:8089/tpfoyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantServiceImpl.addEtudiant(e);
    }

    // DELETE: http://localhost:8089/tpfoyer/etudiant/remove-etudiant/{etudiant-id}
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantServiceImpl.removeEtudiant(etudiantId);
    }

    // PUT: http://localhost:8089/tpfoyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        return etudiantServiceImpl.modifyEtudiant(e);
    }
}
