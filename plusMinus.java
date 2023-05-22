import java.util.Scanner;

class Result {

    public void plusMinus(int arr[]) {
        int p = 0, m = 0, z = 0;
        double c, n, k;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                m++;
            } else if (arr[i] > 0) {
                p++;
            } else {
                z++;
            }
        }
        c = (p / arr.length);
        n = (m / arr.length);
        k = (z / arr.length);
        System.out.println(c);
        System.out.println(n);
        System.out.println(k);
    }

}

public class plusMinus extends Result {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int arr[] = new int[n];
            Result s = new Result();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            s.plusMinus(arr);
        }
    }
}
