package April29;



class Test6 {
    public static int solution(double flo) {
        int answer = 0;
        answer = (int) Math.round(flo);
        int answer2 = 0;
        answer2 = (int) flo;
        System.out.println(answer);
        System.out.println(answer2);
        return 1;
    }
    public static void main(String[] args) {
        solution(69.88288888888888888888888888888888);
    }
}