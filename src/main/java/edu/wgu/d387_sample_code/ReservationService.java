package edu.wgu.d387_sample_code;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import org.springframework.stereotype.Service;


@Service
public class ReservationService { 

    private final TimeConversionService timeConversionService;

    public ReservationService(TimeConversionService timeConversionService) {
        this.timeConversionService = timeConversionService;
    }

    public String getLivePresentationTimes() {
        // Assuming the presentation is scheduled at a specific UTC time
        ZonedDateTime presentationTime = ZonedDateTime.of(2024, 9, 17, 14, 0, 0, 0, ZoneId.of("UTC"));

        // Call the method to get the time in ET, MT, and UTC as a message
        return timeConversionService.getPresentationTimesMessage(presentationTime);
    }
}
