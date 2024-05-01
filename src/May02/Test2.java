package May02;

public  class Test2 {
    public static String solution(String[] arr) {
        String answer = "";
        for(String s : arr){
            answer += s;
        }
        System.out.println(answer);
        return answer;
    }

//    ["a","b","c"]
    public static void main(String[] args) {
        String [] a = {"a","b","c"};
        solution(a);
}
}
