import java.util.Scanner;

public class Array3 {
    public static int unique(int arr[], int n) {
        int i, k = 0;
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }

            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] > 0) {
                k = arr[i];
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int n, i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENter array size: ");
            n = sc.nextInt();
            int arr[] = new int[100];
            System.out.println("Enter array elements:");
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println("The unique number is: " + "" + unique(arr, n));
        }
    }

}
