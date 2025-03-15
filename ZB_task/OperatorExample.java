public class OperatorExample {
    public static void main(String[] args) {
        // 1. 산술연산자
        int a = 10 + 5;
        System.out.println(" a =" + a);
        int b = 10 - 5;
        System.out.println(" b =" + b);
        int c = 10 * 50;
        System.out.println(" c =" + c);
        int d = 10 / 5;
        System.out.println(" d =" + d);
        int e = 10 % 5;
        System.out.println(" e =" + e);

        // 2. 대입 연산자
        int number = 10;
        String name = "홍길동";

        // 3. 등감연산자
        int count = 1;
        count++; // count = count + 1
        System.out.println("count++ = " + count);
        count--; // count = count - 1
        System.out.println("count-- = " + count);

        // 4. 비교 연산자
        int x = 10;
        int y = 20;
        // x가 y 보다 큰가?
        boolean aa = x > y;
        System.out.println("x가 y보다 큰가? : " + aa);
        // x가 y 보다 작은가?
        boolean bb = x > y;
        System.out.println("x가 y보다 작은가? : " + bb);
        // x가 y와 같은가?
        boolean cc = x == y;
        System.out.println("x가 y보다 큰가? : " + cc);

        // 5. 논리 연산자
        boolean 비가온다 = true;
        boolean 춥다 = true;
        boolean result = 비가온다 && 춥다;
        System.out.println("result : " + result);

        // 삼항연산자
        // 1. 합격/불합격 판단
        int score = 85;
        String result_3 = score >= 60 ? "합격" : "불합격";
        System.out.println("합격 유무 : " + result_3);

        // 2. 양수/음수 판단
        int num = 6;
        String evenOdd = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println("홀수/짝수 : " + evenOdd);

        // 3. 더 큰 수 찾기
        int biga = 10, bigb = 20;
        int bigger = biga > bigb ? a : b;
        System.out.println("더 큰 수 = " + bigger);

        // 4. 할인 적용
        int price = 10000;
        boolean isMember = true;
        int finalPrice = isMember ? price - 1000 : price;
        System.out.println("회원 할인 가격 : " + finalPrice);

        // 문자열 연결
        // 1. 문자열끼리 합치기
        String 인사 = "안녕하세요" + "반갑습니다";
        System.out.println("인사 = " + 인사);

        // 2. 문자열과 순자 합치기
        String 자기소개 = "제 나이는" + 20 + "살 입니다";
        System.out.println("자기소개 = " + 자기소개);

        // 3. 문자열과 정수 합치기
        int age = 25;
        System.out.println("제 나이는" + age + "살 입니다.");

        // 4. 문자열 + 숫자 계산
        int s_price = 1000;
        int s_count = 3;
        System.out.println("총 가격 : " + s_price * s_count + "원"); // 총 가격 : 3000원

        // 주의사항
        // 숫자 + 숫자 + 문자열
        System.out.println(1+2+"번");
        // 결과 : 3
        // 동작방식 : 먼저 1+2=3 계산 후 "번"과 합쳐짐

        // 문자열 + 숫자 + 숫자
        System.out.println("번호"+1+2);
        // 결과 : 3
        // 동작방식 : "번호"와 1을 먼저 합친 후 2를 합침

        // 괄호 사용
        System.out.println("결과 : " + (1 + 2)); // 결과 : 3
        System.out.println("결과 : " + 1 + 2);

        // 문제 : 10000원으로 3500원짜리 물건을 샀을 때 거스름돈을 계산해서 출력해보기
        // 가진 돈
        int money = 10000;
        // 물건 가격
        int thing_price = 3500;
        // 거스름돈
        int rest = money - thing_price;
        System.out.println("거스름돈 : " + rest);
    }
}
