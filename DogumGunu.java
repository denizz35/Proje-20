import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DogumGunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum tarihinizi (gg.aa.yyyy formatında) giriniz: ");
        String dogumTarihiStr = scanner.nextLine();

        // Kullanıcının girdiği tarihi parse etme
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dogumTarihi = LocalDate.parse(dogumTarihiStr, formatter);

        // Tarihin gününü bulma
        DayOfWeek gun = dogumTarihi.getDayOfWeek();

        // Günü Türkçe olarak ekrana yazdırma
        String gunAdi = "";
        switch (gun) {
            case MONDAY:
                gunAdi = "Pazartesi";
                break;
            case TUESDAY:
                gunAdi = "Salı";
                break;
            case WEDNESDAY:
                gunAdi = "Çarşamba";
                break;
            case THURSDAY:
                gunAdi = "Perşembe";
                break;
            case FRIDAY:
                gunAdi = "Cuma";
                break;
            case SATURDAY:
                gunAdi = "Cumartesi";
                break;
            case SUNDAY:
                gunAdi = "Pazar";
                break;
        }

        System.out.println("Doğduğunuz gün: " + gunAdi);
    }
}
