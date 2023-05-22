//FINDING THE HIGHEST AND SECOND HIGHEST ELEMENT IN ARRAY USING SORTING
import java.util.Scanner;

public class Array4 {
    public static void selectionSort(int arr[], int n) {
        int i, j, minIndex, temp;
        for (i = 0; i < n-1; i++) {
            minIndex = i;
            for (j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            n = sc.nextInt();
            int ar[] = new int[100];
            System.out.println("Enter array elements.");
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            selectionSort( ar, n);
            System.out.println("The second highest number is = " +ar[n-2] );
            System.out.println("The  highest number is = " +ar[n-1] );
            System.out.println("The second smallest number is = " +ar[0] );
            System.out.println("The  smallest number is = " +ar[1] );
        }
    }

}
