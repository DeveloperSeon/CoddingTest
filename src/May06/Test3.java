package May06;

//"w" : 수에 1을 더한다.
//"s" : 수에 1을 뺀다.
//"d" : 수에 10을 더한다.
//"a" : 수에 10을 뺀다.

import java.util.Arrays;

//[0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]
//"wsdawsdassw"
//"wsdawsdassw"
class Test3 {
    public static void main(String[] args) {

        int[]numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        solution(numLog);
    }
    public static String solution(int[] numLog) {
        String answer = "";
//        int[] newArray = new int[numLog.length + 1]; // 기존 배열보다 길이가 1 큰 새로운 배열 생성
//        newArray[0] = 0;
//        System.arraycopy(numLog, 0, newArray, 1, numLog.length);
        for(int i = 1 ; i < numLog.length ; i++){
            int a = numLog[i] - numLog[i-1] ;
            switch (a){
                case 1 : answer += "w";
                    System.out.println("==================");
                    System.out.println(numLog[i]);
                    System.out.println(numLog[i-1]);
                    System.out.println(answer);
                    System.out.println("==================");
                    break;

                case -1 : answer += "s";
                    System.out.println("==================");
                    System.out.println(numLog[i]);
                    System.out.println(numLog[i-1]);
                    System.out.println(answer);
                    System.out.println("==================");
                    break;
                case 10 : answer += "d";
                    System.out.println("==================");
                    System.out.println(numLog[i]);
                    System.out.println(numLog[i-1]);
                    System.out.println(answer);
                    System.out.println("==================");
                    break;
                case -10 : answer += "a";
                    System.out.println("==================");
                    System.out.println(numLog[i]);
                    System.out.println(numLog[i-1]);
                    System.out.println(answer);
                    System.out.println("==================");
                    break;
            }



        }
        System.out.println(answer);
        return answer;
    }
}
