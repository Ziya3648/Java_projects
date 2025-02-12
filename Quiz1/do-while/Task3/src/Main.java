import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;

        do {
            System.out.print("Bir ədəd daxil edin (0 daxil edərək çıxın): ");
            num = scanner.nextInt();
            if (num != 0 && num > max) {
                max = num;
            }
        } while (num != 0);

        if (max != Integer.MIN_VALUE) {
            System.out.println("Ən böyük ədəd: " + max);
        } else {
            System.out.println("Heç bir ədəd daxil edilməyib.");
        }
    }
}