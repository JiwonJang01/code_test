// 변수에 타입 지정정
let name: string = "Jiwon";
let age: number = 25;
let isStudent: boolean = true;

// 배열
let numbers: number[] = [1, 2, 3];
let names: string[] = ["Alice", "Bob"];

// 객체에 타입 지정정
let user: { name: string; age: number } = { name: "Jiwon", age: 25 };

// 유니온 타입
let value: string | number = "Hello";
value = 42; // 가능

// 인터페이스
interface User {
    name: string;
    age: number;
    isStudent?: boolean; // 선택적 속성
  }
  
const user: User = { name: "Jiwon", age: 25 };

// 기본 함수 타입
function add(a: number, b: number): number {
    return a + b;
  }

// 함수 타입 정의
type Operation = (x: number, y: number) => number;

const multiply: Operation = (x, y) => x * y;

// 타입 별칭 정의
type ID = string | number;

let userId: ID = 123;
userId = "abc";

// 제네릭
function identity<T>(value: T): T {
    return value;
  }
  
console.log(identity<string>("Hello")); // "Hello"
console.log(identity<number>(42));      // 42

// 제네릭 인터페이스스
interface Box<T> {
value: T;
}

const stringBox: Box<string> = { value: "Hello" };
const numberBox: Box<number> = { value: 123 };

// 열거형
enum Color {
    Red,
    Green,
    Blue,
  }
  
let favoriteColor: Color = Color.Green;
console.log(favoriteColor); // 1

// 클래스와 타입스크립트
class Person {
    name: string;
    age: number;
  
    constructor(name: string, age: number) {
      this.name = name;
      this.age = age;
    }
  
    greet(): string {
      return `Hi, my name is ${this.name}`;
    }
  }
  
const person = new Person("Jiwon", 25);
console.log(person.greet());

// 타입 단언
let someValue: any = "Hello TypeScript";
let strLength: number = (someValue as string).length;
