public class IfElseExample {
    public static void main(String[] args) {
        // 1. if-else
        // 1. 합격/불합격 판단
        int score = 85;

        if (score >= 60){
            System.out.println("합격");
        }else
            System.out.println("불합격");

        // 2. 학점계산
        int grade = 87;

        if(grade >= 90){
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else
            System.out.println("F");

        // 2. 중첩 조건문
        int score2 = 85;
        int attandance = 80;

        if (score2 >= 60) {
            if (attandance >= 75) {
                System.out.println("최종 합격");
            } else {
                System.out.println("출석 미달로 불합격");
            }
        } else {
            System.out.println("성적 미달로 불합격");
        }

        // 3. switch
        // 1. 요일별 일정
        int day = 3;
        switch(day){
            case 1:
                System.out.println("월요일 : 회의");
                break;
            case 2:
                System.out.println("화요일 : 업무");
                break;
            case 3:
                System.out.println("수요일 : 휴식");
            default:
                System.out.println("다른 요일");
        }

        // 2. 계절 판별
        String month = "January";

        switch (month){
            case "December":
            case "January":
            case "Fabuary":
                System.out.println("겨울");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("겨울");
                break;

        }

        // 문제 : if-else문을 삼항연산자로 바꿔보세요.
        int qscore = 85;

        if (qscore >= 60){
            System.out.println("합격!");
        } else {
            System.out.println("불합격");
        }

        String result = qscore >= 60 ? "합격." : "불합격.";
        System.out.println("삼항 연산자 : " + result );
    }
}
