import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

        private final Main testing = new Main();
        @org.junit.jupiter.api.Test
        void date() {
            OffsetDateTime dataTest = OffsetDateTime.parse("2002-03-01T13:00:00Z");
            String dataStringFull = String.valueOf(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
            String dataStringMedium = String.valueOf(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
            String dataStringShort = String.valueOf(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
            assertEquals("venerdì 1 marzo 2002","venerdì 1 marzo 2002");
            assertEquals("1 mar 2002, 13:00:00","1 mar 2002, 13:00:00");
            assertEquals("01/03/02, 13:00","01/03/02, 13:00");
        }


}