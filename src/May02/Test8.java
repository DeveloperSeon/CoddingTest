package May02;

public class Test8 {
    public static int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){
            for(int i = 0 ; i <= n ; i+=2){
                answer += i*i;
            }
        }else{
            for(int i = 1 ; i <= n ; i+=2){
                answer += i;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
    }

}
