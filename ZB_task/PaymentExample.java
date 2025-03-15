class Payment {
    void processPayment(int amount){
        System.out.println("결제 처리: " + amount + "원");
    }
    void refund(int amount){
        System.out.println("환불 처리: " + amount + "원");
    }
}
class TossPayment extends Payment{
    void processPayment(int amount){
        System.out.println("토스결제: " + amount + "원");
    }
    void refund(int amount){
        System.out.println("토스환불: " + amount + "원");
    }
}
class KakaoPayment extends Payment{
    void processPayment(int amount){
        System.out.println("카카오페이 결제: " + amount + "원");
    }

    @Override
    void refund(int amount) {
        System.out.println("카카오페이 환불: " + amount + "원");
    }
}
class NaverPayment extends Payment{
    void processPayment(int amount){
        System.out.println("네이버페이 결제: " + amount + "원");
    }

    @Override
    void refund(int amount) {
        System.out.println("네이버페이 환불: " + amount + "원");
    }
}
class PaymentProcessor{
    void processPayment(Payment payment, int amount){
        System.out.println("==== 결제를 시작합니다 ====");
        payment.processPayment(amount);
        System.out.println("==== 결제가 완료되었습니다. ====");
    }
}

public class PaymentExample {
    public static void main(String[] args) {
        // 결제 프로세서 생성
        PaymentProcessor processor = new PaymentProcessor();

        // 여러가지 결제 방식 생성
        TossPayment tossPayment = new TossPayment();
        KakaoPayment kakaoPayment = new KakaoPayment();
        NaverPayment naverPayment = new NaverPayment();

        // 결제 처리
        processor.processPayment(tossPayment, 50000);
        System.out.println();
        processor.processPayment(kakaoPayment, 30000);
        System.out.println();
        processor.processPayment(naverPayment, 30000);
    }
}
