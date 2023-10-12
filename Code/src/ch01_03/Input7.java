package ch01_03;
import java.util.Scanner;
public class Input7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int num = sc.nextInt();
            if(num == 0){
                continue;
            } else if (num >= 100) {
                System.out.println(num);
                break;
            }
            else{
                System.out.println(num);
            }

        }while(true);
    }
}
