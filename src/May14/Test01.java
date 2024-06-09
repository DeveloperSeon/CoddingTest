package May14;

public class Test01 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < queries.length; i++) {
            int second = queries[i][2];
            for (int ii = 0; ii < arr.length; ii++) {
                if (arr[ii] != 0 && arr[ii] % second == 0) { // arr[ii]가 0이 아닌 경우에만 계산
                    answer[ii] = arr[ii] + 1; // 누적값으로 변경
                } else if (arr[ii] == 0) {
                    answer[ii] = arr[ii] + 1; // 누적값으로 변경
                } else {
                    answer[ii] = arr[ii];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(answer[i] + " "); // 결과 출력
        }
        System.out.println(""); // 줄 바꿈

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        solution(arr, queries);
    }
}