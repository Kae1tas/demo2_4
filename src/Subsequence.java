import java.lang.reflect.Array;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int value = sc.nextInt();
            if(value==0){
                break;
            }
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
