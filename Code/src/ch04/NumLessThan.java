package ch04;
import java.util.Scanner;
public class NumLessThan {
    boolean isLessThan100(int num){
        return (num < 100) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumLessThan ns = new NumLessThan();
        if(ns.isLessThan100(n))
            System.out.println("n은 100보다 작습니다.");
        else
            System.out.println("n은 100보다 작지 않습니다.");
    }
}
