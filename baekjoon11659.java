import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기 - 긴 수
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄로 긴 데이터가 들어올 경우 토큰으로 분리하여 받음
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // 숫자 개수
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        // 합배열 선언
        long[]S = new long[suNo + 1];
        // 합 배열 생성
        for(int i=1; i<=suNo; i++){
            S[i] = S[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int q=0;q<quizNo;q++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}