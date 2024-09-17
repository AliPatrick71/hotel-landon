package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentationController {

    private final ReservationService reservationService;

    public PresentationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/presentation-times")
    public String getPresentationTimes() {
        return reservationService.getLivePresentationTimes();
    }
}
