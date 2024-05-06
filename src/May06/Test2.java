package May06;


class Test2 {

    public static void main(String[] args) {
        solution(0 ,"wsdawsdassw");
    }

    public static int solution(int n, String control) {
        int answer = n;
        control = control.toLowerCase();
       // control = control.toLowerCase();
        for(int i = 0 ; i < control.length() ; i ++){
            switch(control.charAt(i)){

                case 'w': answer+=1;

                break;
                case 's': answer-=1;

                break;
                case 'd': answer+=10;

                break;
                case 'a': answer-=10;

                break;

            }
        }
        return answer;
    }
}