import java.io.IOException;
import java.util.Scanner;

public class SystemIOException {
    public static void main(String[] args) throws IOException {
        // 1. System out
        // print 없이 출력
        int number = 10;
        String text = "자바";
        System.out.print(number);
        System.out.print(text);

        // println 줄바뀌 포함 립력
        System.out.println();
        System.out.println("첫번째 줄");
        System.out.println("두 번째 줄");

        // printf() 포멧팅된 출력
        System.out.println();
        String name = "홍길동";
        int age = 20;
        double height = 175.5;

        System.out.printf("이름 : %s\n",name);
        System.out.printf("나이 : %d\n",age);
        System.out.printf("키 : %.1f\n",height);

        // 2. System.in
        // 한 바이트 읽기
        System.out.println("문자(char) 입력 : ");
        int input = System.in.read();

        // 읽은 값 출력
        System.out.println("입력한 문자 : " + (char) input);
        System.out.println("아스키 코드 값 : " + input);

        // 3. Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생정보를 입력하세요");
        System.out.println("이름 : ");
        String s_name = scanner.nextLine();

        scanner.nextLine(); // 버퍼 비우기

        System.out.println("학년 : ");
        int grade = scanner.nextInt();

        scanner.nextLine(); // 버퍼 비우기

        System.out.println("반 : ");
        String className = scanner.nextLine();

        // 입력정보 출력
        System.out.println("\n === 학생정보 ===");
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("반 : " + className);

        scanner.close();
    }
}
