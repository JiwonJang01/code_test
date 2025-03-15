public class TypeCastingExample {
    public static void main(String[] args) {
        // 1. 정수형 -> 실수형 형변환
        int number = 10;
        double doubleNumber = (double) number;
        System.out.println("1. 정수 -> 실수");
        System.out.println("number = " + number);
        System.out.println("doubleNumber = " + doubleNumber);

        // 2. 실수형 -> 정수형 형변환
        double score = 93.7;
        int scoreInt = (int) score;
        System.out.println();
        System.out.println("2. 실수 -> 정수");
        System.out.println("score = " + score);
        System.out.println("scoreInt = " + score);

        // 3. 논리형
        boolean flag = true;
        System.out.println();
        System.out.println("3. 논리형은 형변환 불가");
        System.out.println("flag = " + flag);

//        int boolToInt = (int) flag; // error

        // 문제 : int -> char로 서로 형변환하면 어떻게 될까요?
        char ch = 'A';
        int chNum = (int) ch;

        // 결과
        System.out.println();
        System.out.println("4. 문자 -> 정수");
        System.out.println("ch = " + ch);
        System.out.println("chNum = " + chNum); // 아스키 코드 A -> 65

        int num = 66;
        char character = (char) num; // '66'으로 출력될까?
        System.out.println();
        System.out.println("5. 정수 -> 문자");
        System.out.println("num = " + num);
        System.out.println("character = " + character);


        // 1. 업캐스팅 (작은 타입 -> 큰 타입)
        System.out.println("=== 업캐스팅 ===");
        int up_number = 10;
        double up_doubleNumber = up_number; // int -> double 자동 형변환
        System.out.println("int 값 : " + up_number); // 10
        System.out.println("double값 : " + up_doubleNumber); // 10.0

        // 2. 다운 캐스팅 (큰 타입 -> 작은 타입)
        System.out.println();
        System.out.println("=== 다운 캐스팅 ===");
        double down_score = 93.7;
        int down_scoreInt = (int) down_score;
        System.out.println("double값 : " + down_score); // 93.7
        System.out.println("int 값 : " + down_scoreInt); // 93

        System.out.println("=== 데이터 손실 ===");
        double pi = 3.14;
        int intPi = (int)pi;
        System.out.println("double값 : " + pi); // 3.14
        System.out.println("int값 " + intPi);

        int a = 333;
        byte b = (byte) a;
        System.out.println("int = " + a);
        System.out.println("b = " + b);
    }
}
