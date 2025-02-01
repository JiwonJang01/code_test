// 1. 타입 가드 (Type Guards)
// 런타임에서 타입을 좁혀서 안전하게 사용할 수 있게 도와주는 기능

// typeof 사용
function printValue(value: string | number) {
  if (typeof value === "string") {
    console.log(`문자열: ${value.toUpperCase()}`);
  } else {
    console.log(`숫자: ${value.toFixed(2)}`);
  }
}

// instanceof 사용
class Dog {
  bark() {
    console.log("멍멍");
  }
}

class Cat {
  meow() {
    console.log("야옹");
  }
}

function makeSound(animal: Dog | Cat) {
  if (animal instanceof Dog) {
    animal.bark();
  } else {
    animal.meow();
  }
}

// in 연산자 사용
type User = { name: string; email: string };
type Admin = { name: string; email: string; isAdmin: boolean };

function checkUser(user: User | Admin) {
  if ("isAdmin" in user) {
    console.log("관리자 계정입니다.");
  } else {
    console.log("일반 사용자 계정입니다.");
  }
}

// 2. 타입 단언 (Type Assertions)
// 컴파일러에게 특정 타입임을 강제로 알려줄 때 사용
let someValue: any = "Hello, TypeScript";
let strLength: number = (someValue as string).length;

// 3. 타입 좁히기 (Type Narrowing)
// never 타입을 활용해서 모든 경우를 처리하는 패턴
function process(value: string | number) {
  if (typeof value === "string") {
    console.log(value.toUpperCase());
  } else if (typeof value === "number") {
    console.log(value.toFixed(2));
  } else {
    // 여기에 도달하면 타입 오류 발생
    let neverValue: never = value;
  }
}

// 4. readonly (읽기 전용)
// 객체나 배열의 값을 수정하지 못하게 할 때 사용
interface User {
  readonly id: number;
  name: string;
}
const user: User = { id: 1, name: "Jiwon" };
// user.id = 2;  // ❌ 오류 발생 (읽기 전용)

// 배열에서도 사용 가능
const numbers: readonly number[] = [1, 2, 3];
// numbers.push(4);  // ❌ 오류 발생

// 5. Record<Keys, Type> (키-값 타입 매핑)
type UserRoles = Record<"admin" | "user" | "guest", boolean>;

const roles: UserRoles = {
  admin: true,
  user: false,
  guest: true,
};

// 6. Partial<T> (일부 속성만 선택적으로 사용)
interface User {
    name: string;
    age: number;
  }
  
  const updateUser = (user: Partial<User>) => {
    console.log(user);
  };
  
  updateUser({ name: "Jiwon" }); // age 생략 가능
  