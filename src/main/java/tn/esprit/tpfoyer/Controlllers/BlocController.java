package tn.esprit.tpfoyer.Controlllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.BlocServiceImpl;
import tn.esprit.tpfoyer.Services.ChambreServiceImpl;
import tn.esprit.tpfoyer.Services.IBlocService;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {

    private IBlocService blocServiceImpl;

    // GET: http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocServiceImpl.retrieveAllBlocs();
    }

    // GET: http://localhost:8089/tpfoyer/bloc/retrieve-bloc/{bloc-id}
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long blocId) {
        return blocServiceImpl.retrieveBloc(blocId);
    }

    // POST: http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocServiceImpl.addBloc(b);
    }

    // DELETE: http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId) {
        blocServiceImpl.removeBloc(blocId);
    }

    // PUT: http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        return blocServiceImpl.modifyBloc(b);
    }
}
