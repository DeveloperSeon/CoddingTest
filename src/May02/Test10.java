package May02;


class Test10 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag == true ? a + b : a -b;
        return answer;
    }
}
