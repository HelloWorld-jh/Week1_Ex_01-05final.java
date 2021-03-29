package week01.day4_1;

import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)...
				//(1+2+3....100)까지의 합

				//변수 선언
				int n=1; // 입력
				int sum=0; //반복제어변수
				final int MAX = 100;
			
				 Scanner sc = new Scanner(System.in);
				 

				 //처리
				while(n <= MAX) {
					sum = sum + n ; //항 누적
					n= n+1; //항을 구한다
	}
}
}
