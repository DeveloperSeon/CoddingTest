package coddingTestAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test004 {
    public static ArrayList<String> solution(String[] kb1){
        ArrayList<String>result = new ArrayList<>();
//        for(String x : kb1){
//            String tmp = new StringBuilder(x).reverse().toString();
//            result.add(tmp);
//        }
        for(String x : kb1){
            char[] chars = x.toCharArray();
            int fir = 0; int sec = x.length()-1;
            while(fir < sec){
                char ch = chars[fir];
                chars[fir] = chars[sec];
                chars[sec] = ch;
                fir++; sec--;
            }
            String tmp = String.valueOf(chars);
            result.add(tmp);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[]arr = new String[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=kb.next();
        }

        for(String x : solution(arr)){
            System.out.println(x);
        }
    }
}
