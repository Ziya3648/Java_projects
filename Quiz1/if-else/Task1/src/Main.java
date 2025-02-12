import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil edin: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Ədədlər bərabərdir");
        } else {
            System.out.println("Ədədlər bərabər deyil");
        }
    }
}