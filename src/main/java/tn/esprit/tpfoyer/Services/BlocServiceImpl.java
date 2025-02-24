package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repositories.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    private BlocRepository blocRepository ;
    private ChambreRepository chambreRepository ;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }
    @Override
    public Bloc retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId).orElse(null);
    }
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }
    @Override
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }
    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
