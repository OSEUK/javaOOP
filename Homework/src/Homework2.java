import java.util.Scanner;

// 학생 클래스
class Students{
    // 학번, 전화번호, 이름, 전공 변수 선언
    int classnum , phonenum ;
    String name, major;

    // 각 변수별 setter, getter
    void setCn(int cn){
        classnum = cn;
    }
    int getCn(){ return classnum ;}

    void setPn(int pn){
        phonenum = pn;
    }
    int getPn(){ return phonenum;}

    void setName(String n){
        name = n;
    }
    String getName(){ return name; }

    void setMajor(String m){
        major = m;
    }
    String getMajor(){ return major; }



}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        // Students 객체 3개 생성 후 클래스 배열
        Students[] sArr = {s1, s2, s3};

        // 3명의 학생 정보 입력
        for(int i = 0; i < 3; i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            sArr[i].setCn(sc.nextInt());
            sArr[i].setName(sc.next());
            sArr[i].setMajor(sc.next());
            sArr[i].setPn(sc.nextInt());
        }
        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        // 전화번호는 문자열로 변환 후 형식에 맞게 바꿈

        String[] phonenum = new String[3];
        for(int i = 0; i < 3; i++){
            phonenum[i] = Integer.toString(sArr[i].getPn());
            phonenum[i] = "0" + phonenum[i].substring(0,2) + "-" + phonenum[i].substring(2,6) + "-" + phonenum[i].substring(6);
        }

        System.out.printf("첫 번째 학생: %d %s %s %s\n" ,sArr[0].getCn(), sArr[0].getName(), sArr[0].getMajor(), phonenum[0]);
        System.out.printf("두 번째 학생: %d %s %s %s\n" ,sArr[1].getCn(), sArr[1].getName(), sArr[1].getMajor(), phonenum[1]);
        System.out.printf("세 번째 학생: %d %s %s %s\n" ,sArr[2].getCn(), sArr[2].getName(), sArr[2].getMajor(), phonenum[2]);

    }
}
