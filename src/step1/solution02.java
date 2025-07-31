package step1;
import java.util.Scanner;

// 변수

public class solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a + b = c
        int a = 1; // integer 정수 형태의 숫자 -> int -> +-21억 범위
        int b = 1; // 32bit 단위의 signed 정수
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);

        long d = 1; // 64bit 단위의 정수 -> +- 900경 범위
        // 컴퓨터는 저장할 때 '메모리'에 공간을 할당 한다
        // -> 이 메모리에 얼마나 공간을 할당할지 정해주는 게 type(symbol)
        // -> 이 할당된 공간에 식별할 수 있는 이름을 정해준 게 '변수'

        System.out.print("a: ");
        int a2 = sc.nextInt();
        sc.nextLine();
        System.out.print("b: ");
        int b2 = sc.nextInt();
        sc.nextLine();
        int c2 = a2 + b2;
        System.out.println(a2 + "+" + b2 + "=" + c2);

        System.out.print("시력을 입력해 주세요: ");
        // float eye = sc.nextFloat();
        double eye = sc.nextDouble();
        System.out.println("당신의 시력은 " + eye);

        sc.close();
    }
}
