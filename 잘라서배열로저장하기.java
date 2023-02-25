package programmers;

import java.util.Arrays;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String answer = "";
		int n = 6;
		String my_str = "abc1Addfggg4556b";

		sb.append(my_str);
		sb.insert(n, "/");
		sb.insert((n * 2 + 1), "/");
		String a = sb.toString();
		String[] result = a.split("/", n);
		answer = Arrays.toString(result);
		System.out.println(answer);
	}

}
