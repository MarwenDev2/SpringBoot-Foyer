package tn.esprit.tpfoyer.Controlllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.IReservationService;
import tn.esprit.tpfoyer.Services.ReservationServiceImpl;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private IReservationService reservationServiceImpl;

    // GET: http://localhost:8089/tpfoyer/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationServiceImpl.retrieveAllReservations();
    }

    // GET: http://localhost:8089/tpfoyer/reservation/retrieve-reservation/{reservation-id}
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String reservationId) {
        return reservationServiceImpl.retrieveReservation(reservationId);
    }

    // POST: http://localhost:8089/tpfoyer/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationServiceImpl.addReservation(r);
    }

    // DELETE: http://localhost:8089/tpfoyer/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String reservationId) {
        reservationServiceImpl.removeReservation(reservationId);
    }

    // PUT: http://localhost:8089/tpfoyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        return reservationServiceImpl.modifyReservation(r);
    }
}
