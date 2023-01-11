class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int total = 0; //자릿수의 합
        int x2 = x;
        while(x2 != 0){ //각 자리수를 구해서 total에 더하기 
            int temp = x2 % 10; //뒤에서 부터 구하기 
            total += temp;
            x2 /= 10; //x2를 10으로 나누어 몫이 0이 될 때까지 반복
        }
        if(x % total == 0) return true;
        return answer;
    }
}
	public static void main(String args[]){
		int N = 2;
		int M = 5;
		System.out.println(solution(N, M));
	}
}