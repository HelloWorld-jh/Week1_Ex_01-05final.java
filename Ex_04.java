package week01.day4_1;

import java.util.Scanner;


public class Ex_04 {
// 두 숫자가 입력될 때 앞의 숫자를 뒤의 숫자로 나누었을 때
	//몫과 나머지를 구하시오
	public static void main(String[] args) {
	int quotient;
	int remain;
	int num1, num2;
	
	Scanner sc=new Scanner(System.in);
	
	num1=sc.nextInt();
	num2=sc.nextInt();

	quotient=num1/num2;
	remain=num1%num2;

//결과출력
	
System.out.println(quotient);
System.out.println(quotient);
	}
}
