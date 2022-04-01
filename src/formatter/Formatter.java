package formatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class Formatter {
        public static void main(String[] args) {
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日" );
            System.out.println("Today's date in English: " + LocalDate.now());
            System.out.println("Today's date in Japanese: " + customFormatter.format(LocalDateTime.now()));
        }
    }

