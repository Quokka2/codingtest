package programmers;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		int a = str1.indexOf(str2);
		if (a == -1) {
			System.out.println("2");
		} else {
			System.out.println("1");
		}
	}
}
