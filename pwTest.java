class Main {
   public boolean solution(String password) {
     boolean answer = true;

      int capitalCount = 0, smallCount = 0, digitCount = 0;
      for(int i = 0; i < password.length(); i++) {
      	if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
          capitalCount++;
        else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
          smallCount++;
        else if(password.charAt(i) >= '1' && password.charAt(i) <= '9')
          digitCount++;
      }

      if(capitalCount >= 1 && smallCount >= 2 && digitCount >= 2)
      	answer = true;
      else
      	answer = false;

      return answer;
    }

    public static void main(String[] args) {
    	Main sol = new Main();
    	String password1 = new String("helloworld");
    	boolean ret1 = sol.solution(password1);

    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	String password2 = new String("Hello123");
    	boolean ret2 = sol.solution(password2);

    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}