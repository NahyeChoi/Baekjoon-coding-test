import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] score = new int[N];
        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        int M = 0;
        float sum = 0;

        for(int i = 0; i < N; i++){
            if(score[i] >= 0 && score[i] <= 100){
                if(M < score[i]){ M = score[i]; }
            }
        }

        for(int i = 0; i < N; i++) {
            sum += (score[i]/(float)M*100);
        }


        System.out.println(sum/(float)N);
    }
}