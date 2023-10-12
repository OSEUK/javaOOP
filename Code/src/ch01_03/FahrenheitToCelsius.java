package ch01_03;

import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();
        double c = (5./9.) * (f - 32);

        System.out.printf("화씨 온도 : %.1f는 섭씨 온도 : %.1f입니다.",f, c);

    }
}
