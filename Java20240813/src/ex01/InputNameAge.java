package ex01;

import java.util.Scanner;

/*
 * 나이하고 이름을 키보드 통해서 입력 받아서 
 * 출력
 */

public class InputNameAge {
	public static void main(String[] args) {
		/*
		 * 기본자료형 ->
		 * 정수형
		 *          byte, int, long
		 * 실수형
		 *          float, double
		 *  논리형
		 *          boolean
		 * 문자형 
		 *          char
		 */
		
		Scanner sc =new Scanner(System.in); // 키보드 통해서 입력 받을 떄
		
		System.out.println("이름을 선택하세요 : ");
		
		String a = sc.nextLine(); //String는 기본자료형이 아니므로 참조자료형 문자열 입력받을 떄 사용
		
		System.out.println("나의 이름은 " + a + " 입니다  ");
		
		System.out.println("나이를 입력하세요 : ");
	    int b =sc.nextInt();
	    System.out.println("나이는 " + b + " 입니다.");
		
		System.out.println("프로그램 종료!!! : ");
				
	}
}

