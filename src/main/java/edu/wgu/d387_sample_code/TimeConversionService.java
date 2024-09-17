package edu.wgu.d387_sample_code;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;


@Service
public class TimeConversionService {

    // Method to convert the presentation time to ET, MT, and UTC and return a message
    public String getPresentationTimesMessage(ZonedDateTime presentationTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm z");

        // Convert to Eastern Time (ET)
        ZonedDateTime easternTime = presentationTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        String easternTimeStr = "Presentation Time (ET): " + easternTime.format(formatter);

        // Convert to Mountain Time (MT)
        ZonedDateTime mountainTime = presentationTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        String mountainTimeStr = "Presentation Time (MT): " + mountainTime.format(formatter);

        // Convert to Coordinated Universal Time (UTC)
        ZonedDateTime utcTime = presentationTime.withZoneSameInstant(ZoneId.of("UTC"));
        String utcTimeStr = "Presentation Time (UTC): " + utcTime.format(formatter);

        // Combine all messages
        return easternTimeStr + "\n" + mountainTimeStr + "\n" + utcTimeStr;
    }
}
