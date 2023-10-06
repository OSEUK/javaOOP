import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        int[] numArr = new int[n];
        System.out.print("수를 입력하세요: ");
        for(int i = 0; i < n; i++){
            numArr[i] = sc.nextInt();
        }

        int max = numArr[0];
        int min = numArr[0];

        for(int i = 0; i < n; i++){
            if(numArr[i] > max) max = numArr[i];
            if(numArr[i] < min) min = numArr[i];
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
