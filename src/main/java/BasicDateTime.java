import java.time.*;
import java.time.temporal.ChronoUnit;

public class BasicDateTime {
    public static void main(String[] args) {

        Instant start = Instant.now();

        System.out.println("Instant.now(): " + Instant.now());
        System.out.println("LocalDate.now(): " + LocalDate.now());
        System.out.println("LocalTime.now(): " + LocalTime.now());
        System.out.println("LocalDateTime.now(): " + LocalDateTime.now());
        System.out.println("ZonedDateTime.now(): " + ZonedDateTime.now());

        System.out.println("Custom date:");
        LocalDate customLocalDate = LocalDate.of(1986, Month.MAY, 5);
        LocalTime customLocalTime = LocalTime.of(16, 11);
        System.out.println(customLocalDate);
        System.out.println(customLocalTime);

        System.out.println("Custom local date time");
        LocalDateTime customLocalDateTime = LocalDateTime.of(1986,5,5,13,11,15, 150_000_000);
        System.out.println(customLocalDateTime);

        ZonedDateTime zrh = customLocalDateTime.atZone(ZoneId.of("Europe/Zurich"));
        System.out.println("ZRH time: " + zrh);

        ZonedDateTime lon = zrh.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("LON time: " + lon);


        LocalDate myBirth = LocalDate.of(1986,  Month.MAY, 5);
        LocalDate today = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(myBirth, today);
        System.out.printf("I am %d days old%n", daysBetween);

        Period passedTime = myBirth.until(today);
        int years = passedTime.getYears();
        System.out.println(passedTime);
        System.out.println("Years: " + years);

        Instant end = Instant.now();
        System.out.println("Execution duration: " + Duration.between(start, end).toMillis() + " ms");
    }

}
