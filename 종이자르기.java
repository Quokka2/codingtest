package programmers;

public class 종이자르기 {
	class Solution {
		public int solution(int M, int N) {
			int answer = 0;
			int width = M - 1;
			int height = (N - 1) * M;
			int total = width + height;
			if (total > 0)
				answer = total;
			return answer;
		}
	}
}
