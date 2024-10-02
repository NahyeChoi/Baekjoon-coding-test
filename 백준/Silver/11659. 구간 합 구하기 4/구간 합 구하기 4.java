import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[] arr = new int[n];
       int[] sum = new int[n+1];
       int[] answer = new int[m];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum[i+1] = sum[i] + arr[i];
        }
        sum[n]=sum[n-1]+arr[n-1];


        for(int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            answer[k] = sum[j] - sum[i-1];
        }

        for(int i = 0; i < m; i++) {
            System.out.println(answer[i]);
        }

    }
}