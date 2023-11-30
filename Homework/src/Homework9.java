import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        FileReader fr = null;

        try {
            fr = new FileReader("db.txt");

        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String[] splitline = line.split("\\,");
            map.put(splitline[0].trim(), splitline[1].trim());
        }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            e.printStackTrace();
        }

        while(true){
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id : ");
            String id = sc.nextLine();

            if(!map.containsKey(id.trim())){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
                continue;
            }
            System.out.print("password : ");
            String pwd = sc.nextLine();

            if(map.get(id).equals(pwd)){
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
            else System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요. ");

        }
    }
}
