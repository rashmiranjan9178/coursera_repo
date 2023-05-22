
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        int i, n, rem = 0, num = 0 ,last,fst=0;
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[100];
            System.out.println("Enter the size of array");
            n = sc.nextInt();
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                rem = arr[i] % 10;
                num = num * 10 + rem;
               
            }
            for(i=0;i<n;i++){
                last = arr[i]/10;
                fst = fst*10+last;
            }
            System.out.println("The needed collection of lastdigit number is: "+ num);
            System.out.println("The needed collection of firstdigit number is: "+ fst);
        }

    }

}
