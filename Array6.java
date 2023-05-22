import java.util.Scanner;

public class Array6 {

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
            // System.out.println("The min value in array is : " + findmin(arr));
            System.out.println("The max value in the array is : " + findmax(arr));
            System.out.println("The max value in the array is : " + findSecondmax(arr));
            
        }
    }
    static int findmax(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }
    static int findSecondmax(int arr[]){
        int max = findmax(arr);
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int x = findmax(arr);
        return x;
    }

   
    
}
