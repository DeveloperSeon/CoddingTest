package May02;

public class Test5 {
    public static int solution(int a, int b) {
        int answer = 0;
        int aa = Integer.parseInt("" + a+b);
        int bb = 2*a*b;
        answer = aa> bb ? aa : bb ;
        return answer;
    }
    public static void main(String[] args) {
        solution(2 ,3);
    }
}

