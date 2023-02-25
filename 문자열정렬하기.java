package programmers;

import java.util.Arrays;

public class 문자열정렬하기 {

	public static void main(String[] args) {
        String answer = "";
        String my_string = "Bcad";
        my_string = my_string.toLowerCase();
        
        char[] charArray = my_string.toCharArray();
        
        Arrays.sort(charArray);
        
        answer = new String(charArray);
        
        System.out.println(answer);
	}
}
