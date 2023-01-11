class Solution {
    public static int solution(int M, int N) {
        int answer = 0;
        //규칙 M * N - 1
        //즉 가로 * 세로의 개수만큼 종이가 나와야 한다. 
        //가로 * 세로의 개수만큼 종이를 자르기 위해서는 가로 * 세로 - 1 만큼 잘라야 한다. 
        answer = M * N - 1;
        return answer;
    }
	public static void main(String args[]){
		int N = 2;
		int M = 5;
		System.out.println(solution(N, M));
	}
}