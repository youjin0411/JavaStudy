class Main {
    public int solution(int[] papers, int K) {
        
			int length = papers.length;
			for(int i = 0; i < papers.length; i++){
				K -= papers[i];
				if(K <= 0)
					return i;
			}
        return length;
    }


    public static void main(String[] args) {
    	Main sol = new Main();
    	int[] papers1 = {2, 4, 3, 2, 1};
    	int K1 = 10;
    	int ret1 = sol.solution(papers1, K1);

    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] papers2 = {2, 4, 3, 2, 1};
    	int K2 = 14;
    	int ret2 = sol.solution(papers2, K2);

    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}