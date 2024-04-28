package April28;

import java.util.Scanner;
//문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //키보드 생성자생성
        String a = sc.next();//입력값을 a에 저장
        System.out.println(a.replaceAll(" ","")); //replaceAll을 사용해서 " " (공백)을 ""(공백제거로 바꾼다.)
    }
}
