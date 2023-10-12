package ch01_03;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String[] strArr1 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};
        String[] strArr2 = new String[4];

        for(int i = 0; i < 4; i++){
            strArr2[i] = strArr1[i];
        }

        for(int i = 0; i < 4; i++){
            System.out.println(strArr1[i] + "," + strArr1[i].length());
            System.out.println(strArr2[i] + "," + strArr2[i].length());
        }
    }
}
