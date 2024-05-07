package May07;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};

        solution(arr,queries);
    }
    public static int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        for(int i = 0 ; i < queries.length ; i++){
            int fir = queries[i][0];
            int last = queries[i][1];
            int max = queries[i][2];

            int[] doi = Arrays.copyOfRange(arr, fir , last + 1);
            Arrays.sort(doi);

            boolean found = false;
            for(int j = 0 ; j < doi.length; j++){
                if(doi[j] > max){
                    answer[i]=doi[j];
                    found = true;
                    break;
                }
            }
            if(!found) {
                answer[i]= -1;
            }
        }


        System.out.println(Arrays.toString(answer));
        return answer;
    }
}