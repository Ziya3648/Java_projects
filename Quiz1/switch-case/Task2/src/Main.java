import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Məktub daxil edin (A, B, C, D): ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Əla");
                break;
            case 'B':
                System.out.println("Yaxşı");
                break;
            case 'C':
                System.out.println("Kafi");
                break;
            case 'D':
                System.out.println("Zəif");
                break;
            default:
                System.out.println("Yanlış məktub!");
        }
    }
}