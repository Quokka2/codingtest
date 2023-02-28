package programmers;
import java.util.Random;

public class Lotto {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[6];
    
    // 중복되지 않는 6개의 숫자 추첨
    for (int i = 0; i < 6; i++) {
      int number = random.nextInt(45) + 1;
      for (int j = 0; j < i; j++) {
        if (numbers[j] == number) {
          number = random.nextInt(45) + 1;
          j = -1;
        }
      }
      numbers[i] = number;
    }
    
    // 결과 출력
    System.out.print("추첨된 로또 번호: ");
    for (int i = 0; i < 6; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}



