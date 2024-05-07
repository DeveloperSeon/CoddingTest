package May07;

import java.util.Arrays;

class Test1 {
    public static void main(String[] args) {

        int[]arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,3},{1,2},{1,4}};

        solution(arr,queries);
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int f = 0;
        int l = 0;
        int index = 0;

        for(int i = 0 ; i < queries.length ; i++){
            f = queries[i][0];
            l = queries[i][1];
            index = arr[f];
            arr[f] = arr[l];
            arr[l] = index;
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}