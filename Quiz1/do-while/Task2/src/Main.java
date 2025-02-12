import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Bir ədəd daxil edin (0 daxil edərək çıxın): ");
            num = scanner.nextInt();
            if (num != 0) {
                System.out.println("Kvadrat: " + (num * num));
            }
        } while (num != 0);
    }
}