package April29;


public class Test5 {
    public static void main(String[] args) {
        String answer = "";
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        int ss = overwrite_string.length();
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+ss);
        System.out.println(answer);

    }
}