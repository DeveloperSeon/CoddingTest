package May02;

public class Test9 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">")&& eq.equals("=")) {
            answer = n >= m ? 1 : 0;
        } else if (ineq.equals("<")&& eq.equals("=")) {
            answer = n <= m ? 1 : 0;
        }else if (ineq.equals(">")&& eq.equals("!")) {
            answer = n > m ? 0 : 1;
        }else if (ineq.equals("<")&& eq.equals("!")) {
            answer = n <= m ? 0 : 1;
        }

        return answer;
    }

}
