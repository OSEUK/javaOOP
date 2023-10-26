import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10크기의 history buffer, 작업 중인 인덱스 i, exit 여부 finished 선언
        String[] arr = new String[10];
        int i = 0;
        boolean finished = false;

        while( !finished ){
            System.out.print("jshell> ");
            arr[i] = sc.nextLine().trim();

            // 공백을 입력받을 경우 다시 입력
            if( arr[i].length() == 0 )
                continue;

            // '/'로 시작하는 명령문 판단
            if(arr[i].charAt(0) == '/'){
                // '/'다음 명령문을 switch로 판단
                switch(arr[i].substring(1)) {
                    case "help":
                        System.out.println("Type a Java language expression, statement, or declaration");
                        System.out.println("Or type one of the following commands");
                        System.out.println("/list: list the source you have typed");
                        System.out.println("/exit: exit the jshell tool");
                        System.out.println("/history: history of what you have typed");
                        System.out.println("/!: rerun last snippet");
                        break;
                    case "exit":
                        System.out.println("Goodbye");
                        finished = true;        // 반복문 종료
                        break;
                    case "history":
                        // 채워진 배열만큼 print
                        for (int j = 0; j < i; j++) {
                            System.out.println(arr[j]);
                        }
                        break;
                    case "list":
                        // 명령문을 제외하고 print
                        int num = 1;
                        for (int j = 0; j < i; j++) {
                            if (arr[j].charAt(0) == '/') continue;
                            System.out.println(num++ + " : " + arr[j]);
                        }
                        break;
                    case "!":
                        // 가장 최근 명령이 아닌 문장 출력 후 break;
                        for(int j = i; j >= 0; j--){
                            if(arr[j].charAt(0) != '/'){
                                System.out.println("Re-running '" + arr[j] + "'.");
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("Invaild command : " + arr[i]);
                        System.out.println("Type /help for help.");
                        break;
                }
            }
            else System.out.println("Running '" + arr[i] + "'.");

            // 다음 칸 배열을 채우기 위함
            i++;

            // 버퍼가 가득 차면 초기화
            if( i == 10){
                System.out.println("The history buffer is cleared.");
                i = 0;
                for(int j = 0; j < 10; j++){
                    arr[j] = null;
                }
            }
        }
    }
}
