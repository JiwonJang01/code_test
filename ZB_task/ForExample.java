import com.sun.security.jgss.GSSUtil;

public class ForExample {
    public static void main(String[] args) {
//        // 1. 구구단의 2단을 출력
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(" 2 X " + i + " = " + (2 * i));
//        }
//
//        // 2. 합계 구하기
//        // 1+2+3+4+5+6+7+8+9+10 = 55
//        int sum = 0;
//        for (int i = 1; i <= 10 ;i ++){
//            sum += i;
//        }
//        System.out.println("합계 : " + sum);
//
//        // 2. while 문
//        int num = 1; // 초기화
//        while ( num <= 5){  // 조건식
//            System.out.println(num);
//            num++;  // 증감식
//        }
//
//        // 2. 카운트 다운
//        int count = 5;
//        while (count>0){
//            System.out.println(count);
//            count--;
//        }
//        System.out.println("발사!");
//
//        // 무한루프
//        int i = 0;
//        while (true){
//            System.out.println("무한반복!!!!위험함. 횟수 : " + i);
//            i++;
//        }

        // 3. break, countinue

        // break
        int break_sum = 0;
        int break_num = 1;

        while (true){
            break_sum += break_num;
            if(break_sum > 100){
                break;
            }
            break_num++;
        }
        System.out.println("마지막에 더한 수 : " + break_num);
        System.out.println("최종 합계 : " + break_sum);

        // countinue
        int number = 0;
        while(number < 10){
            number++;
            if( number % 2 != 0 ){ // 홀수
                continue;
            }
            System.out.println(number); // 짝수
        }

        // 4. 구구단 작성
        // 2단부터 9단까지 반복
        for (int dan = 0; dan <= 9 ; dan++) {   // 2단부터 9단까지 반복
            // 단수 표시
            System.out.println("\n" + dan + "단");

            // 1부터 9까지 곱하기
            for (int j = 0; j <= 9; j++) {
                System.out.println(dan + " x " + j + " = " + (dan * j));
            }

        }

        // 문제 : 1부터 100까지 반복을 사용해서 합을 구하기
        // 1+2+3+4+5+6+...+100 = 5050
        int q_sum = 0;
        for (int j = 1; j <= 100; j++) {
            q_sum += j; // sum = sum + i
        }
        System.out.println("1부터 100까지의 합 : " + q_sum);
    }
}
