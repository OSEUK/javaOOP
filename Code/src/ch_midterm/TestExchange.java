package ch_midterm;
import java.util.Scanner;
class ExchangeRate {
    double rate;
    String name, unit;

}
class ExchangeBank{
    ExchangeRate[] rate = new ExchangeRate[5];
    int count;

    ExchangeBank(){
        rate[count] = new ExchangeRate();
    }
    void add(String name, double rate, String monetaryUnit){
        this.rate[count] = new ExchangeRate();
        this.rate[count].rate = rate;
        this.rate[count].name = name;
        this.rate[count].unit = monetaryUnit;
        count++;
    }
    double exchange(String from, String to, double amount){
        return (findExchangeRate(from).rate / findExchangeRate(to).rate)* amount;
    }
    ExchangeRate findExchangeRate(String name){
        for(int i = 0; i < count; i++){
            if( rate[i].name.equals(name))
                return rate[i];
        }
        return null;
    }

}
public class TestExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExchangeBank rate = new ExchangeBank();

        rate.add("미국", 1438.5, "달러");
        rate.add("중국", 197.82, "위안");
        rate.add("영국", 1628.24, "파운드");
        rate.add("유로", 1414.62, "유로");
        rate.add("스위스", 1439.08, "프랑");

        String from, to;
        double amount;
        System.out.print("환전할 통화 국가를 입력하세요: ");
        from = sc.next();
        System.out.print("환전 대상 통화 국가를 입력하세요: " );
        to = sc.next();
        System.out.print("환전 금액을 입력하세요: ");
        amount = sc.nextDouble();

        System.out.printf("%s: %.2f %s --> %s: %.2f %s",
                from, amount, rate.findExchangeRate(from).unit, to, rate.exchange(from, to, amount), rate.findExchangeRate(to).unit);
    }
}
