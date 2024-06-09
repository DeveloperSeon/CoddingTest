package May14;



class Test02 {
    public static int[] solution(int l, int r) {
        int[] answer = {};
        for(int i = l ; i < r; i++){
            if(containsZeroOrFiveString(i)){

            }
        }
        return answer;
    }

    public static boolean containsZeroOrFiveString(int number) {
        String numberString = String.valueOf(number);
        return numberString.contains("0") || numberString.contains("5");
    }
}