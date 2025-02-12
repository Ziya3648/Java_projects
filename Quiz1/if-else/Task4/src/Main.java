import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil edin: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin: ");
        int num2 = scanner.nextInt();
        System.out.print("Əməliyyat işarəsini daxil edin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Sıfıra bölmək mümkün deyil!");
                    isValid = false;
                }
                break;
            default:
                System.out.println("Yanlış əməliyyat");
                isValid = false;
        }

        if (isValid) {
            System.out.println("Nəticə: " + result);
        }
    }
}