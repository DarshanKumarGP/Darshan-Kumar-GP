import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want in the list: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("List size should be positive");
        }

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] counts = new int[10]; 

        for (int num : numbers) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    counts[divisor]++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int divisor = 1; divisor <= 9; divisor++) {
            sb.append(divisor).append(": ").append(counts[divisor]);
            if (divisor < 9) {
                sb.append(", ");
            }
        }
        sb.append("}");

        System.out.println(sb.toString());

        scanner.close();
    }
}
