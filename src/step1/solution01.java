package step1;  // package 경로 제시

import java.util.Scanner;

// class : 모든 것을 감싸고 있음
// public : 접근 제어자
// [접근제어자] [구현체 종류] [이름(파일 이름과 동일)] {}
public class solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner라는 클래스를 바탕으로 인스턴스를 생성하여,
        // scanner라는 변수에 주입하기 위해, new 키워드를 통해 생성자를 불러오고,
        // System.in이라는 argument를 통해 터미널에서 텍스트 입력값 받아옴
        System.out.print("본인이 좋아하는 정수를 입력해주세요: ");
        int num = scanner.nextInt(); // 정수 입력을 받겠다
        System.out.println("당신이 좋아하는 숫자는 " + num + "입니다!");

        System.out.print("본인이 좋아하는 야구선수를 입력해주세요: ");
        String str = scanner.next();
        System.out.println("당신이 좋아하는 야구선수는 " + str + "입니다!");

        scanner.close(); // scanner 반환


//        System.out.println("큰따옴표로 묶인 것을 출력한다.");
//        System.out.println(123456);  // System.out.println() : 줄바꿈 존재
//        System.out.print("이거는 그냥");  // System.out.print() : 줄바꿈 없음
//        System.out.print("System.out.print");
    }
}

