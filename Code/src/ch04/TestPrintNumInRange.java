package ch04;
import java.util.Scanner;
public class TestPrintNumInRange {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        PrintNumInRange pn = new PrintNumInRange(scanner);
        pn.readInt();
        if(pn.checkRange(1, 100)){
            pn.printNum();
        }
        else
            System.out.println("1~100범위 밖 정수가 입력되었습니다.");

    }
}
