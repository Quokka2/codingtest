package programmers;

public class 문자열밀기 {

	public static void main(String[] args) {
		int answer = 0;
		String[] A = { "hello", "apple", "atat", "abc" };
		String[] B = { "ohell", "eppla", "tata", "abc" };
		for (int i = 0; i < B.length; i++) {
			// indexOf ==> 문자열 내에서 특정한 문자열의 index 값을 리턴한다.
			// 탐색하려는 문자열이 존재하지 않는다면 -1을 반환한다.
			answer = (B[i] + B[i]).indexOf(A[i]);
			System.out.println(answer);
		}
	}
}
