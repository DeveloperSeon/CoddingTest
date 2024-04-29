package April29;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n%2;
        if(m == 0){
            System.out.printf("%d is even", n);
        }else{
            System.out.printf("%d is odd", n);
        }
    }
}