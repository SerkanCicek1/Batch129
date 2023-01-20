package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        // Date Class
        Date myDate = new Date();

        System.out.println(myDate); // Sat Jan 07 23:26:45 EET 2023
        System.out.println(myDate.getTime()); // 1673123381773 ==> 1 Ocak 1970 de su ana kadarki mili saniye miktari

        // Icinde bulundugumuz an nasil alinir ?
        System.out.println(LocalDate.now()); // 2023-01-07

        System.out.println(LocalTime.now()); // 23:34:36.322009500

        System.out.println(LocalDateTime.now()); // 2023-01-07T23:36:09.646090600

        // Dunyanin herhangi bir saat dilimindeki saati nasil aliriz ?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); // 2023-01-08T05:44:15.691966400
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));

        // Ileriki bir tarihe nasil gidilir ?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5)); // 2030-06-07

        // Geriki bir tarihe nasil gidilir ?
        System.out.println(LocalDate.now().minusYears(4).minusDays(6)); // 2019-01-01

        // Ileriki bir zamana nasil gidilir ?
        System.out.println(LocalTime.now().plusHours(3)); // 02:56:05.942617

        // Geriki bir zamana nasil gidilir ?
        System.out.println(LocalTime.now().minusMinutes(43)); // 23:15:05.498540600

        // Zamanda belli bir bölümü nasil aliriz ?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()); // 0:0 ==> gece yarisi :P

        // Tarihde belli bir bölümü nasil aliriz ?
        System.out.println(LocalDate.now().getMonth() + " " + LocalDate.now().getDayOfMonth()); // JANUARY 8
        System.out.println(LocalDate.now().getMonthValue() + "." + LocalDate.now().getDayOfMonth()); // 1.8

        // Iki tarih nasil karsilastirilir ?
        // 02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result); // true

        // Tarihlerin formatlari nasil degistirilir ?
        // M--> Tek arakamla ay nosu yazar - MM--> Ikı rakamla ay nosunu yazar-MMM-->Ay ismini ilk uc ısmını yazar
        //MMMM--> ay ısımının tamamını yazar.

        //d--> Tek rakamla gün nosunu yazar  -- dd--> Iki rakamla gun nosunu yazar
        //yy--> Yilin son iki rakamini yazar-- yyyy Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now())); // 08/01/2023
    }

}
