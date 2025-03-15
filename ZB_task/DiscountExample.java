import java.util.concurrent.ThreadPoolExecutor;

// 할인 정책 인터페이스
interface DiscountPolicy{
    // 할인 금액 계산 메서드
    int calculateDiscount(int price);
}

// 정률 할인 정책 구현 (10% 할인)
class PercentDiscountPolicy implements DiscountPolicy{
    public int calculateDiscount(int price){
        return (int)(price * 0.1); // 10% 할인
    }
}

// 정액 할인 정책 구현 (1000원 할인)
class FixedDiscountPolicy implements DiscountPolicy{
    public int calculateDiscount(int price){
        return 1000;
    }
}

// 할인 적용을 위한 상품 클래스
class Product{
    private String name;    // 상품명
    private int price;  // 가격
    private DiscountPolicy discountPolicy;

    // 다형성을 사용해서 DiscountPolicy 인터페이스를 구현한 클래스를 전달 받는다.
    public Product(String name, int price, DiscountPolicy discountPolicy){
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }

    // 할인된 가격 계산
    public int getDiscountPrice(){
        return price - discountPolicy.calculateDiscount(price);
    }

    // 상품 정보 출력
    public void printInfo(){
        System.out.println("상품명: " + name);
        System.out.println("원가: " + price + "원");
        System.out.println("할인 금액: " + discountPolicy.calculateDiscount(price) + "원");
        System.out.println("할인된 가격: " + getDiscountPrice() + "원");
    }
}

// 상품 할인 정책 구현 예제
public class DiscountExample {
    public static void main(String[] args) {
        // 할인 정책 객체 상성
        DiscountPolicy percentDiscount = new PercentDiscountPolicy();
        DiscountPolicy fixedDiscount = new FixedDiscountPolicy();

        // 상품 생성
        Product prouct1 = new Product("노트북", 20000, percentDiscount); // 10% 할인 적용
        Product prouct2 = new Product("마우스", 5000, fixedDiscount); // 10% 할인 적용

        // 상품 정보 출력
        System.out.println(" === 정률 할인 적용 ===");
        prouct1.printInfo();
        System.out.println();

        System.out.println(" === 정액 할인 적용 ===");
        prouct2.printInfo();
        System.out.println();
    }
}
