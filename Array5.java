
//FINDING MAX AND SECOND MAX ELEMENT USING INT.MAX & INT.MIN
import java.util.*;

public class Array5 {
    static int findmax(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }

    static int findmin(int arr[]) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int n, i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length of array: ");
            n = sc.nextInt();
            int arr[] = new int[100];
            System.out.println("Enter array elements:");
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The min value in array is : " + findmin(arr));
            System.out.println("The max value in the array is : " + findmax(arr));
            
        }
    }

}
