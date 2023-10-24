package ch_midterm;

import java.sql.SQLOutput;

public class chm1 {
    public static void main(String[] args) {
        String[] arr1 = {"Google Chrome", "Microsoft Edge",
        "Mozilla Firefox", "Naver Whale"};
        String[] arr2 = new String[4];

        for(int i = 0 ; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
        }

    }
}
