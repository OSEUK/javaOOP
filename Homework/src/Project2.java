import java.util.Scanner;

// 계란찜, 라면끓이기, 감자삶기 설정
enum Food{
    egg(200, 700), ramyeon(300, 1000), potato(600, 700);

    int cTime, watt;
    Food(int cTime, int watt) {
        this.cTime = cTime;
        this.watt = watt;
    }
    int getCTime(){ return cTime; }
    int getWatt() { return watt; }
};

// 전자레인지 클래스
class Microwave{

    // 전력, 요리시간, 동작 중 여부 변수
    private int watt;
    private int cTime;
    private String working;

    // 생성자. 변수 초기화 및 프로그램 실행
    public Microwave() {
        watt = 700;
        cTime = 0;
        working = "아니오";
        System.out.println("안녕하세요~ 저는 전자레인지입니다.");
        printStatus();
    }
    // 전력 설정 메소드
    public void setWatt(int watt) {
        if( watt == 200 || watt == 500 || watt == 700 || watt == 1000) {
            this.watt = watt;
            printStatus();
        }
        else System.out.println("소비 전력(W)은 200, 500, 700, 1000만 지원합니다.");
    }
    // 요리 시간 설정 메소드
    public void setcTime(int cTime) {
        if(cTime >= 1 && cTime <= 900) {
            this.cTime = cTime;
            printStatus();
        }
        else System.out.println("유효한 요리 시간(초)이 설정되어야 합니다.");
    }
    // enum Food를 활용한 프로그램 설정
    public void setProgram(Food f){
        this.watt = f.getWatt();
        this.cTime = f.getCTime();
        printStatus();
    }

    // 프로그램을 동작시키는 메소드
    public int startProgram() {
        if (cTime < 1 || cTime > 900) {
            System.out.println("요리시간이 설정되지 않았습니다.");
            return 0;
        }
        else if(watt != 200 && watt != 500 && watt != 700 && watt != 1000){
            System.out.println("적절한 소비 전력을 선택해주세요.");
            return 0;
        }
        else {
            System.out.println("동작을 시작합니다.");
            working = "예";
            printStatus();
            return 1;
        }
    }
    // 동작을 종료하는 메소드
    public void endProgram(){
        System.out.println("동작이 중지되었습니다.");
        watt = 700;
        cTime = 0;
        working = "아니오";
        printStatus();
    }
    // 설정된 전력, 요리시간, 동작 중 여부를 출력하는 메소드
    private void printStatus(){
        System.out.printf("소비 전력: %dW, 요리 시간: %d초, 동작 중: %s\n", watt, cTime, working);
    }

}

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 메뉴 선택할 숫자 n과 반복문을 종료한 변수 cooking
        int n;
        boolean cooking = true;

        Microwave mw = new Microwave();
        while(cooking) {
            System.out.println("\n1. 계란찜, 2. 라면끓이기, 3. 감자삶기, 4. 시간(초) 설정," +
                    " 5. 소비 전력(W) 설정, 6. 조리 시작, 기타. 종료");
            System.out.print("메뉴 선택> ");
            n = sc.nextInt();
            switch(n){
                case 1 :
                    mw.setProgram(Food.egg);
                    break;
                case 2 :
                    mw.setProgram(Food.ramyeon);
                    break;
                case 3 :
                    mw.setProgram(Food.potato);
                    break;
                case 4 :
                    System.out.print("입력값 (1~900)> ");
                    int cTime = sc.nextInt();
                    mw.setcTime(cTime);
                    break;
                case 5 :
                    System.out.print("입력값 (200, 500, 700, 1000 중 하나)> ");
                    int watt = sc.nextInt();
                    mw.setWatt(watt);
                    break;
                case 6:
                    int k = mw.startProgram();
                    // 현실감을 더하기 위한 1초 sleep
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if(k == 1)
                        mw.endProgram();
                    break;
                default :
                    System.out.println("안녕히 계세요~ 전자레인지였습니다.");
                    cooking = false;
                    break;
            }
        }

    }
}
