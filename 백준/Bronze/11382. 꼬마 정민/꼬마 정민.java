import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11382
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long sum = 0;
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            sum += Long.parseLong(input[i]);
        }

        System.out.println(sum);
    }
}