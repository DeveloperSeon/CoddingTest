package coddingTestAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test005 {

    public static String solution(String kb1){
        String result = "";
        char[] c = kb1.toCharArray();
        int lt = 0 , rt = kb1.length()-1;
        if(lt < rt){
            if(!Character.isAlphabetic(c[lt])){
                lt++;
//                System.out.println("c[lt] = " + c[lt]);
            }

            else if(!Character.isAlphabetic(c[rt])){
                rt--;
//                System.out.println("c[lt] = " + c[rt]);
            }
            else{
                char tmp = c[lt];


                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }

            result = String.valueOf(c);
            System.out.println("result = " + result);

        }

        return result;


    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String kb1 = kb.next();
        solution(kb1);

    }


}
