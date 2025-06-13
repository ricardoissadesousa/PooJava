package introducaoPoo.javaDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        LocalDate d04 = LocalDate.parse("2025-06-10");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-10T20:59:35");
        Instant d06 = Instant.parse("2025-06-10T01:30:26Z");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formantando
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 = "+ d04.format(fmt1));
        System.out.println("d04 = "+ fmt1.format(d04));
        System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = "+ d05.format(fmt1));
        System.out.println("d05 = "+ d05.format(fmt2));

        System.out.println("d06 = "+ fmt3.format(d06));




    }

}
