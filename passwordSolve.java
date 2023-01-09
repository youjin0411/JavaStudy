public class passwordSolve {
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i = code-1; i < cipher.length(); i+=4){
            answer = answer + cipher.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher, code));
    }
}
