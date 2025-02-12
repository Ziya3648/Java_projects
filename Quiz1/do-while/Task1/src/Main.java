import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "12345";
        String input;

        do {
            System.out.print("Şifrəni daxil edin: ");
            input = scanner.nextLine();
        } while (!input.equals(password));

        System.out.println("Giriş uğurla tamamlandı");
    }
}