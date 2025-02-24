import java.util.*;
public class Human{
    // 성별, 키, 몸무게, 나이, 이름 변수
    String gender;
    int height = 0;
    int weight = 0;
    int age = 0;
    String name;
    double BMI = 0;

    public Human(String gender,int height,int weight,int age,String name){
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    // 각 변수를 반환하는 get메서드 작성
    public String getGender(){return gender;}
    public int getHeight(){return height;}
    public int getWeight(){return weight;}
    public int getAge(){return age;}
    public String getName(){return name;}

    // BMI수치를 계산하는 메서드 작성
    public double getBMI(){
        return Math.round(weight/Math.pow(weight, 2)*10000);
    }

    public static void main(String[] args){
        Human human = new Human("male", 170, 70, 25, "test");
        System.out.println(human.getGender());
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
        System.out.println(human.getAge());
        System.out.println(human.getName());
        System.out.println(human.getBMI());
    }
}
