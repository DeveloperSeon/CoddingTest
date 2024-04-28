package April28;
import java.util.Scanner;



public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        char c;
        for(int i = 0 ; i < a.length(); i++){
            c = a.charAt(i);
            if((65 <= c) && (c <= 90)){
                b += Character.toLowerCase(c);
            }else if ((97<= c) && (c<=122)){
                b += Character.toLowerCase(c);
            }else{
                b += c;
            }
        }
        System.out.println(b);
    }
}