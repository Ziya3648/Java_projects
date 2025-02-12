import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int num = scanner.nextInt();
        String numStr = Integer.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i) + " ");
        }
    }
}