package coddingTestAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test006 {
    public static String solution(String kb1){
        String result = "";
        for(int i = 0 ; i < kb1.length() ; i++){
            if(kb1.indexOf(i) == i ) result+=kb1.charAt(i);
            System.out.println(kb1.charAt(i) + " " + i + " " + kb1.indexOf(kb1.charAt(i)));
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String next = kb.next();
        solution(next);
    }
}
