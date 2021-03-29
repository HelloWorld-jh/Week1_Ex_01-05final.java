package week01.day4_1;

public class arraytest2 {

	public static void main(String[] args) {
		
		//int[] arry = new int[4];
		// 문제 : 배열의 요소 및 배열 다 더한 값을 출력하기
		
		//배열 전체 더한 값 출력
		int[] arry2 = {90,80,30,40}; //배열의 선언 및 초기화//int[] arry=new int[4];
		int sum = 0;
		int sumFor=0;
		
		
		System.out.println( sum);
		//배열 반목문 사용안하기
		System.out.println(arry2[0]);
		System.out.println(arry2[1]);
		System.out.println(arry2[2]);
		System.out.println(arry2[3]);
		
		
		sum = arry2[0] + arry2[1]+ arry2[2] + arry2[3];
		System.out.println("배열의 합=" + sum);
		
		//배열반복문 사용하기
		for(int i=0; i<4; i++) {
			System.out.println( arry2[i]);
			
		}
		for(int i=0; i<4; i++) {
			sumFor = sumFor + arry2[i];
			
		}
		System.out.println("반복문의 사용한 배열의 합=" + sumFor);
	}
}
