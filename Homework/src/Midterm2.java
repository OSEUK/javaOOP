/*
Midterm 2 completed
 */

class Smartphone{
    String brand, model;
    String[] app = new String[5];
    double Battery = 100;
    boolean is_Battery = false;
    int i;
    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void installApp(String appName){
        if(is_Battery == false)
            System.out.println("전원이 꺼진 상태라 앱 설치가 불가능합니다.");
        else {
            if (i == 5) {
                System.out.println("앱을 더 설치할 수 없습니다. 내장 공간이 부족합니다.");
            } else {
                System.out.println(appName + " 앱을 설치했습니다.");
                app[i++] = appName;
                consumeBatter(5);
            }
        }
    }
    public void useApp(String appName, double amount) {
        int A_OK = 0;
        if(is_Battery == false)
            System.out.println("전원이 꺼진 상태라 앱 실행이 불가능합니다.");
        else {
            for (int j = 0; j < i; j++) {
                if (app[j].equals(appName)) {
                    A_OK = 1;
                    System.out.printf("%s 앱을 실행합니다.\n", appName);
                    consumeBatter(amount);
                }
            }
            if(A_OK == 0){
                System.out.println(appName + " 앱은 없습니다.");
            }
        }

    }

    public void consumeBatter(double amount){
        Battery = Battery - amount;
            if (Battery <= 0){
                System.out.println("배터리가 모두 소진되었습니다.");
                System.out.println(brand +  " " + model + "의 전원이 꺼집니다.");
                Battery = 0;
                is_Battery = false;
                powerOff();
            }

    }
    void displayInfo(){
        System.out.println();
        System.out.println("========상태======");
        System.out.printf("스마트폰 이름: %s\n", model);
        if(is_Battery == true) System.out.println("전원 상태: 켜짐");
        else System.out.println("전원 상태: 꺼짐");
        System.out.printf("남은 배터리 %.1f %%\n",Battery);
        System.out.print("설치된 앱: ");
        if( i == 0 ){
            System.out.println("없음");
        }
        else {
            for (int j = 0; j < i; j++) {
                System.out.print(app[j] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
    void powerOn()
    {
        if(is_Battery == false){
            is_Battery = true;
            System.out.println(brand + " " + model + "의 전원을 켰습니다.");
        }
        else System.out.println(brand + " " + model + "의 전원이 이미 켜져있습니다.");
    }
    void powerOff(){
        if(is_Battery == true){
            is_Battery = false;
        }
        else System.out.println(brand + " " + model + "이 이미 꺼져있습니다.");
    }

}
public class Midterm2{
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung", "Galaxy S22");

        myPhone.powerOn();
        myPhone.displayInfo();
        myPhone.powerOn();

        myPhone.installApp("Messaging");
        myPhone.installApp("Camera");
        myPhone.installApp("Instagram");
        myPhone.installApp("Melon");
        myPhone.installApp("Roblox");
        myPhone.installApp("TikTok");

        myPhone.displayInfo();

        myPhone.useApp("Messaging", 10);
        myPhone.useApp("Melon", 20);
        myPhone.useApp("Hit2", 50);
        myPhone.useApp("Roblox", 90);

        myPhone.displayInfo();

        myPhone.powerOff();
        myPhone.useApp("Camera", 10);
        myPhone.installApp("TikTok");
    }
}