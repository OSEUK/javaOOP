package ch01_03;// Scanner1.java
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("출력 문자열: " + str);

        int num = sc.nextInt();
        System.out.println("출력 정수: " + num);
    }
}
