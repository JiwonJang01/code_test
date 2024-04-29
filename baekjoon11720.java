import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 값 받기
        Scanner sc = new Scanner(System.in);
        
        // 숫자의 개수 N 입력 받기
        int N = sc.nextInt();
        
        // 100개의 숫자를 담을 수 있는 것은 string뿐
        // string -> char -> int
        String sNum = sc.next();
        
        // sNum을 char형으로 변환시켜서 cNum[]에 저장
        char cNum[] = sNum.toCharArray();
        int sum = 0; // 숫자들의 합

        // cNum에 저장되어 있는 숫자들을 int 형으로 변환시켜 sum을 이용해 합구하기
        for(int i = 0; i<cNum.length;i++){
            int a = Character.getNumericValue(cNum[i]);
            sum += a;
        }
        System.out.println(sum);
    }
}

/*
정답 코드 - DO it! 알고리즘 코딩테스트 with JAVA
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char cNum[] = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i<cNum.length;i++){
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
*/