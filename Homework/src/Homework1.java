import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("정수를 입력하세요: ");
            number[i] = sc.nextInt();
            sum += number[i];

            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
        }
    }
}
