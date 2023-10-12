package ch01_03;
import java.util.Scanner;
public class breaktest {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        do {
            ch = sc.next().charAt(0);
            if ( ch != 'n'){
                System.out.println(ch);
            }
            else {
                break;
            }
        }while (true);
    }
}
