package May02;

public class Test3  {
    public static String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0 ; i < k ; i++){
            answer += my_string;
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        solution("String" ,3);
    }
}
