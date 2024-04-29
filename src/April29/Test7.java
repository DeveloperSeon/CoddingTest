package April29;

class Test7 {
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length < arr2.length) return -1;
        else if (arr1.length > arr2.length) return 1;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < arr1.length ; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];

        }
        answer = sum1 == sum2 ? 0 : (sum1 < sum2 ? -1 : 1);
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};
        int [] b = {3, 3, 3, 3, 3};
        solution(a,b);
    }
}