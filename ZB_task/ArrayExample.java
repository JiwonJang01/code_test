import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {
        // 1. 배열
        // 배열이 없다면
        int score1 = 90;
        int score2 = 85;
        int score3 = 80;
        int score4 = 75;

        // 배열 사용 시
//        int[] scores = {90, 85, 80, 75};

        // 2. 배열의 선언과 생성
        // 배열 선언
        int[] numbers; // 권장
//        int n_scores[]; // 권장x

        // 배열 생성
        numbers = new int[5]; // 5개의 정수를 저장할 수 있는 배열을 생성

        // 선언과 생성을 동시에
        int[] ages = new int[3];

        // 선언과 동시에 초기화
        int[] points = {95, 88 ,76, 92, 85};

        // 3. 배열의 사용
        int[] numbers2 = new int[5];

        // 값 저장
        numbers[0] = 10;
        numbers[1] = 20;

        // 값 읽기
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // 배열의 길이
        System.out.println(numbers.length); // 배열에 할당된 공간인 5를 출력

        // 배열을 반복문을 사용해 순회 가능
        int[] scores = {90, 80, 85,95};
        for(int i = 0; i<scores.length; i++){
            System.out.println(scores[i]);
        }

        // for-each 사용
        for(int score : scores){
            System.out.println(score);
        }

        // 주의 사항
        int[] arr = new int[1];
//        arr[2] = 3; // exception - 배열의 범위를 넘어감

        int[] nullArr;
//        nullArr = 0;    // exception - 배열의 범위를 넘어감


        // 배열과 반복문을 활용한 간단한 로또 번호 생성기 만들어보기
        int[] lotto = new int[6]; // 6개의 숫자를 넣을 배열
        for (int i = 0; i < 6; i++) {
            // 1~45 사이의 랜덤 숫자 형성
            // 0부터 시작. 1더해줘야 함.
            int num = (int) (Math.random() * 45)+1;

            // 중복 검사
            boolean isDuplicated = false;

            // 이미 생성된 번호와 비교
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num){
                    isDuplicated = true;
                    i--;
                    break;
                }

            }

            // 중복이 아님 경우에만 배열에 저장
            if(!isDuplicated){
                lotto[i] = num;
            }
        }

        // 생성된 로또 번호 출력
        System.out.println("로또 번호 : ");
        for (int i : lotto){
            System.out.println(i);
        }

    }
}
