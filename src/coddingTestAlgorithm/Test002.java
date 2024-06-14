package coddingTestAlgorithm;

import java.util.Scanner;

public class Test002 {

    public static String solution(String kb1){
        String result = "";
        for(char x : kb1.toCharArray()){
            if(Character.isLowerCase(x)){
                 result += String.valueOf(Character.toUpperCase(x));
            }else{
                result += String.valueOf(Character.toLowerCase(x));
            }
        }

        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String kb1 = kb.nextLine();
        solution(kb1);
    }

}
