package May02;


class Test1 {
    public static String solution(String str1, String str2) {

        String answer = "";
        String [] a = new String[str1.length()+str1.length()];
        for(int i = 0 ; i < str1.length() ; i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        solution("aaaaa", "bbbbb");
    }
}