package 단계별.시간복잡도.Q24313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++){
            int num = i;
            int sum = i;

            while(num != 0){
                sum += num%10;
                num/=10;
            }

            if(sum == n){
                result = i;
                break;
            }
        }

        System.out.println(result);
        br.close();
    }
}