import java.util.Scanner;

/**
 * 틀렸음
 * 내 코드 주석 처리 후 올바른 코드로 작성함.
 * 입력값에 정수만 있는 것이 아닌 부분을 놓침
 */
public class Main {
    public static void main(String[] args) {
        // 변수 N에 과목 수 입력 받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 길이가 N인 1차원 배열 A[] 선언 후 각 점수 저장
        // 각 과목 성적을 공백으로 구분하여 입력 받기
        int A[] = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }

        // 최고점은 max에, 총점은 sum에 저장
        /*int sum = 0;
        int max = A[0];*/

        long sum = 0;
        long max = A[0];
        for (int i=0; i < N; i++){
            if (max<A[i]){
                max = A[i];
            }
            sum += A[i];
        }
        // 100.0 이렇게 표기할 경우 자연스럽게 double로 계산
        System.out.println(sum*100.0 / max /N);
    }
}
/** A 배열을 사용하지 않는 방법
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long sum = 0;
        long max = A[0];

        for (int i=0; i < N; i++){
            int temp = sc.nextInt();
            if(temp>max)max=temp;
            sum+=temp;
        }
        
        System.out.println(sum*100.0 / max /N);
    }
}
**/