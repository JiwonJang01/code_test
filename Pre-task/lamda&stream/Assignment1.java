import java.util.*;

// 특정 수를 입력 받아 해당 수의 제곱과 루트를 구하는 람다 표현식을 작성
// 인터페이스 정의
// 하나의 메서드로 두가지 기능 구현
public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int powNum = scanner.nextInt();
        CarculateInterace<Integer> pow = i -> i*i;
        System.out.println(pow.calculate(powNum));

        double sqrtNum = scanner.nextDouble();
        CarculateInterace<Double> sqrt = i -> Math.sqrt(i);
        System.out.println(sqrt.calculate(sqrtNum));
    }
}
