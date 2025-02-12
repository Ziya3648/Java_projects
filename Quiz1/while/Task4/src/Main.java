import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num;

        while (true) {
            System.out.print("Bir ədəd daxil edin (0 daxil edərək çıxın): ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("Heç bir ədəd daxil edilməyib.");
        }
    }
}