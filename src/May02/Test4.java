package May02;

public class Test4 {
    public static int solution(int a, int b) {
        int answer = 0;int answer1 = 0;
        String aa = "", bb = "" ;
        aa = String.valueOf(a) + String.valueOf(b );
        bb =  String.valueOf(b ) + String.valueOf(a);
//        ""안에 a+b b+a 를 넣을수있다
//        int aLong = Integer.parseInt(""+a+b);
//        int bLong = Integer.parseInt(""+b+a);
        answer = Integer.parseInt(aa);
        answer1 = Integer.parseInt(bb);
        answer = answer > answer1 ? answer : answer1;
        return answer;
    }
    public static void main(String[] args) {
        solution(2 ,3);
    }
}
