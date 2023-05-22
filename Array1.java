
//program to find total pairs in the array whose sum is equal to the given value x
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int x, i, j, n, k = 0;
        int arr[] = new int[100];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the target sum: ");
            x = sc.nextInt();

            System.out.println("ENter the size of array:");
            n = sc.nextInt();
            System.out.println("Enter the array:");
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == x) {
                    k++;
                    System.out.println("The " + k + " numbre pair is" + arr[i] + "" + arr[j]);
                    break;
                }
            }

        }
        if (k == 0) {
            System.out.println("Sorry there is no such pairs!!");
        }

    }
}
