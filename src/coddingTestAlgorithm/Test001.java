package coddingTestAlgorithm;

import java.util.Scanner;

public class Test001 {

    public static int solution(String kb1 , char kb2){
        int result = 0;
        kb1.toUpperCase();
        Character.toUpperCase(kb2);
        System.out.println(kb1 + "  " + kb2);
//        for(int i = 0; i < kb1.length(); i++){
//            if(kb1.charAt(i) == kb2){
//                result++;
//            }
//        }
        for(char x : kb1.toCharArray()){
            if(x == kb2){ result++ ;}
        }
        System.out.println("Test001.solution :" + result);
        return result;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String kb1 = kb.nextLine().toUpperCase();
        char kb2 = kb.nextLine().toUpperCase().charAt(0);

        solution(kb1, kb2);
    }
}
