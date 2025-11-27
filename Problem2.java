import java.util.Scanner;

public class Problem2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer a: ");
        int a = scanner.nextInt();

        if (a <= 0) {
            System.out.println("Input should be a positive");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            int value = 2 * i + 1; 
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(value);
        }

        System.out.println(sb.toString());

        scanner.close();
    }
}
