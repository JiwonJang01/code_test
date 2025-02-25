import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(sum(integers));
        List<Float> floats = new ArrayList<>();
        floats.add(1.1f);
        floats.add(2.2f);
        System.out.println(sum(floats));
    }

    // sum에서는 숫자 관련 모든 타입을 수용할 수 있어야 한다.
    // 매개 변수는 list형태, 반환타입은 double
    public static double sum(List<? extends Number> numbers){
        double value = 0;
        for(Number element:numbers){
            value += element.doubleValue();
        }
        return value;
    }
}
