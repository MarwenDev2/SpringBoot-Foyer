package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Reservation;

import java.sql.Date;
import java.util.List;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
