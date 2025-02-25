// 콘솔로 10개의 입력받은 수들의 합과 평균을 내는 로직을 작성하고
// 수가 입력되지 않을 때 예외 처리하는 로직을 작성하세요

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        // scanner로 숫자 입력은 nextInt()
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        int count = 0, sum = 0;

        do{
            try{
                System.out.print("Enter an Integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                count++;
                sum+=number;
            }
            // InputMismatchException 사용
            catch(InputMismatchException ex){
                System.out.println("try again. (" + "Incorrect input: an Integer is required");
                continueInput = false;
                input.nextLine();
            }
        }
        while(continueInput && count < 10);
        if(count ==10){
            System.out.println("sum is: "+sum+"Average is:"+sum/10);
        }
        
    }
    
}
