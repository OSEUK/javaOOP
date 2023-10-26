/*
Midterm 1 completed
 */
import java.util.Scanner;

public class Midterm1 {
    public int n = 1;
    double calc_weight(double kg, double weight, double change ){
        if(kg < weight) {
            System.out.println("최종 목표 몸무게에 도달하였습니다.");
            return kg;
        }
        else {
            System.out.printf("%d주차: %.1fkg 감량 (목표 몸무게: %.1f kg)\n", n++, kg - kg * ((100 - change)/(double)100), kg * ((100 - change)/100));

        }
        return calc_weight((double)(kg * ((100 - change)/100)),   weight, change);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_kg = true , is_weight = true, is_change = true;

        System.out.print("kg단위로 현재 몸무게를 입력하세요 (30.0 ~ 200.0): ");
        double kg = sc.nextDouble();
        while(is_kg) {
            if (kg < 30 || kg > 200) {
                System.out.println("올바르지 않은 입력값입니다. 몸무게는 30kg 이상 200kg 이하이어야 합니다. 다시 입력하세요.");
                System.out.print("kg단위로 현재 몸무게를 입력하세요 (30.0 ~ 200.0): ");
                kg = sc.nextDouble();
            }
            else is_kg = false;
        }

        System.out.print("kg단위로 목표 몸무게를 입력하세요(30.0 ~ 90.0): ");
        double weight = sc.nextDouble();
        while(is_weight) {

            if (weight < 30 || weight > 90) {
                System.out.println("올바르지 않은 입력값입니다. 목표 몸무게는 30kg 이상, 현재 몸무게 이하이어야 합니다. 다시 입력하세요.");
                System.out.print("kg단위로 목표 몸무게를 입력하세요(30.0 ~ 90.0): ");
                weight = sc.nextDouble();
            }
            else is_weight = false;
        }

        System.out.print("% 단위로 주당 변화율을 입력하세요(1.0 ~ 10.0): ");
        double change = sc.nextDouble();
        while(is_change) {
            if (change < 1 || change > 10) {
                System.out.println("올바르지 않은 입력값입니다. 변화율을 1% 이상 10% 이하이어야 합니다. 다시 입력하세요.");
                System.out.print("% 단위로 주당 변화율을 입력하세요(1.0 ~ 10.0): ");
                change = sc.nextDouble();
            } else is_change = false;
        }

        System.out.println("매주 감량 계획:");
        Midterm1 calc = new Midterm1();
        calc.calc_weight(kg, weight, change);

    }
}
