import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int num;

        do {
            System.out.print("Bir ədəd daxil edin (0 daxil edərək çıxın): ");
            num = scanner.nextInt();
            if (num != 0 && num < min) {
                min = num;
            }
        } while (num != 0);

        if (min != Integer.MAX_VALUE) {
            System.out.println("Ən kiçik ədəd: " + min);
        } else {
            System.out.println("Heç bir ədəd daxil edilməyib.");
        }
    }
}