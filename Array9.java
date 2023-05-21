import java.util.Scanner;

class Result {
    public void minMaxSum(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = 0; l < arr.length; l++) {
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if (min < sum) {
                            min = sum;
                        }
                        if (max > sum) {
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

public class Array9 extends Result {
    public static void main(String[] args) {
        Result r = new Result();
        try (Scanner sc = new Scanner(System.in)) {

            int n;
            System.out.println("Enter array size:");
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            r.minMaxSum(arr);

        }
    }

}
