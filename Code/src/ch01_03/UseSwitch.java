package ch01_03;
import java.util.Scanner;
public class UseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원하는 종류의 극장 좌석을 입력하세요 : ");
        String type = sc.next();

        switch(type){
            case "economy" :
                System.out.println("좌석의 가격은 9000원입니다.");
                break;
            case "standard" :
                System.out.println("좌석의 가격은 10000원입니다.");
                break;
            case "prime" :
                System.out.println("좌석의 가격은 11000원입니다.");
                break;
            default:
                System.out.println("좌석 종류를 잘못 입력했습니다.");
                break;
        }

    }
}
