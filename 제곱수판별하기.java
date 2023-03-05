package programmers;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		int n = 144;
		double a = Math.sqrt(n);
		if (a%1 == 0) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}
}
