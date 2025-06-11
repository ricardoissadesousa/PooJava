package introducaoPoo.javaDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();


        LocalDate d04 = LocalDate.parse("2025-06-10");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-10T20:59:35");
        Instant d06 = Instant.parse("2025-06-10T01:30:26Z");
        Instant d07 = Instant.parse("2025-06-10T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2025,6,10);
        LocalDateTime d11 = LocalDateTime.of(2025,6,10,1,30);


        System.out.println("LocalDate: " + d01); // definendo horario de agora
        System.out.println("LocalDateTime: " + d02); // definindo com Hora
        System.out.println("Instant: " + d03); // usa o padrao global GMT z = Londres
        System.out.println("LocalDate: " + d04);
        System.out.println("LocalDateTime: " + d05);
        System.out.println("Instant: " + d06);
        System.out.println("LocalDate: " + d07);
        System.out.println("LocalDateTime: " + d08);
        System.out.println("Instant: " + d09);
        System.out.println("LocalDate: " + d10);
        System.out.println("LocalDateTime: " + d11);
    }
}
