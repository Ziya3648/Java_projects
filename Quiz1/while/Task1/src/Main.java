import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        int i = 2;

        if (num <= 1) {
            isPrime = false;
        } else {
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println("Asal ədəddir");
        } else {
            System.out.println("Asal ədəd deyil");
        }
    }
}