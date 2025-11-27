import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer a: ");
        int a = scanner.nextInt();

        if (a <= 0) {
            System.out.println("Input should be a positive integer");
        }

        int terms;
        if (a % 2 == 0) {
            terms = a - 1; 
        } else {
            terms = a;   
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < terms; i++) {
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
