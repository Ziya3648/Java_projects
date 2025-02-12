import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        while (true) {
            System.out.print("Bir ədəd daxil edin (0 daxil edərək çıxın): ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Cəm: " + sum);
    }
}