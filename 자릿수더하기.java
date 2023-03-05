package programmers;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		int sum = 0;
		String a = Integer.toString(n);
		String[] b = a.split("");
		for (int i = 0; i < b.length; i++) {
			int c = Integer.parseInt(b[i]);
			sum = sum + c;
		}
		System.out.println(sum);
	}
}
