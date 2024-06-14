package coddingTestAlgorithm;

import java.util.Scanner;

public class Test003 {
    public static String solution(String kb1){
        String result = "";
        int l;
        String[]test = kb1.split(" ");
        for(int i = 1; i < test.length ; i++){

            if(test[i-1].length() > test[i].length()){
                result = test[i-1];
            }else if(test[i-1].length() == test[i].length()){
                result = test[i-1];
            }else{
                result = test[i];
            }
        }

        System.out.println("test = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String kb1 = kb.nextLine();
        solution(kb1);
    }
}
