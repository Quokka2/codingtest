package programmers;

public class 숫자의개수 {

	public static void main(String[] args) {
		
		int answer = 0;
		int[] array = {7, 77, 17};
		
		for (int i = 0; i < array.length; i++) {
			String num = Integer.toString(array[i]);
			String[] arr = num.split("");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("7")) {
					answer++;
				}
			}
		}
		System.out.println(answer);

	}

}
