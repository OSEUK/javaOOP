package ch04;
import java.util.Scanner;
public class PrintNumInRange {

    int n;
    Scanner scanner;

    public PrintNumInRange(Scanner scanner) {
        this.scanner = scanner;
    }

    boolean checkRange(int num1, int num2){
        if(num1 <= n && n <= num2)
            return true;
        else
            return false;
    }
    void printNum() {
        System.out.println(n);
    }
    void readInt(){
        System.out.print("정수를 입력하세요: ");
        n = scanner.nextInt();
    }


    }
