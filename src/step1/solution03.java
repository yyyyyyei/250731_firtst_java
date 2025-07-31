package step1;
import java.util.Scanner;

public class solution03 {
    public static void main(String[] args) {
        // 연산자
        // +, -, *, /, % => 산술연산자
        System.out.println(1 + 2);
        System.out.println(7 - 2);
        System.out.println(2 * 8);
        System.out.println(3 / 2); // 1 (몫)
        System.out.println(10 / 3.0); // 3.333333333333333
        System.out.println(3 % 2); // 나머지
        // 숫자 간에는 성립

        // 문자의 경우
        String name = "lion";
        System.out.println(name + 10); // lion10
        // 한 쪽이 문자열이면, 나머지 쪽을 모두 문자열화 시킨 후
        // concatenate(join, 연결) 시킴
        // python과의 차이점: * 는 안됨


        // 대입/할당 연산자
        int a; // 선언. a라는 이름, int라는 타입의 변수 생성
        a = 8; // a라는 자리에 그 타입에 맞는 값을 집어 넣는 것 -> 할당/대입
        int b = 10; // 선언 + 할당 -> '초기화'한다.
        // 이미 선언된 변수는 다시 선언될 수 없음!
        // 하지만 할당/대입을 통해 값 자체는 변할 수 있음
        a = 100; // a에 새로운 값으로 재할당.
        // 최초에 선언된 변수에 할당시키거나, 초기화, 재할당할 때 쓰는 연산자
        // 대입/할당 연산자. -> =
        // 복합 할당/대입 연산자 -> +=,-=, *=, /=
        // -> 앞에 이미 할당, 초기화가 끝난 변수에 한에서 사용 가능
        b += 35;
        System.out.println(a); // 100
        a += 1; // 대입 연산자는 ()안에 넣을 수 없음
        System.out.println(a); // 101
        a++; // 증감연산자는 () 안에 넣기 가능
        System.out.println(a); // 102
        System.out.println(a++); // 102  a++: 호출 후 ++ 반영
        System.out.println(a); // 103
        System.out.println(++a); // 104  ++a: ++ 반영 후 호출
        // 증감연산자는 흐름제어 반복문에서 잘 나와서 중요함

        // 비교연산자, 관계 연산자
        // ==, !=, >, <, >=, <=
        System.out.println(1 == 1); // ture
        System.out.println(1 == 2); // false
        System.out.println(1 != 1); // false
        System.out.println(1 != 2); // true

        // 숫자가 아닌 경우
        System.out.println("1" == "1"); // ture
        System.out.println("1" == new String("1")); // false
        String s1 = "1"; // "1"을 지칭하는 어떤 메모리 상의 위치가 s1에 담김
        String s2 = "1"; // caching 되어서 가져다 씀. 주소가 같음
        String s3 = new String("1");
        // 강제로 new로 만드ㄹ면 새로운 주소가 부여됨

        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true


        // 논리 연산자
        // &&, ||, !
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("n1 > n2 : " + (n1 > n2));
        sc.nextLine();

        // 20: 음주 가능 55: 연금 수령 가능
        System.out.println("당신의 나이는?: ");
        int age = sc.nextInt();
        // 20세 미만
        System.out.println("음주 불가, 연금 불가" + (age < 20));
        // 20세 이상 55세 미만
        System.out.println("음주 가능, 연금 불가" + (age>=20 && age<55));
        // 55세 이상
        System.out.println("음주 가능, 연금 가능" + (age >= 55));
        
        // && ||
        // &&는 앞에 온 boolean이 false면 평가 종료 후 false 리턴
        // ||는 앞에 온 boolean이 true면 평가 종료 후 true 리턴
    }
}
