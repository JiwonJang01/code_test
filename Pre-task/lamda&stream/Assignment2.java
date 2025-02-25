import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 특정 수를 입력 받고 해당 숫자 안의 모든 소수를 list로 만드는 스트림을 작성
// 반환된 스트림을 print문으로 작성
public class Assignment2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int bound = scanner.nextInt();
        List<Integer> result = calculatePrimeNumber(bound);

    }

    public static List<Integer> calculatePrimeNumber(int n){
        return IntStream.rangeClosed(2,n-1)
            .filter(x -> isPrimeNumber(x)).boxed()
            .collect(Collectors.toList());
    }

    private static boolean isPrimeNumber(int number){
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n !=0);
    }
}