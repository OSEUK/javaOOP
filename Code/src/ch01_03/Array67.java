package ch01_03;

import java.util.Scanner;

public class Array67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr1 = { 1.1, 2.3, 4.7, 7.5 };
        double[] arr2 = new double[4];

        arr2[0] = 1.1;
        arr2[1] = 2.3;
        arr2[2] = 4.7;
        arr2[3] = 7.5;

        System.out.printf("배열 크기: %d %d\n", arr1.length, arr2.length);
    }
}
