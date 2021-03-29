package week01.day4_1;

public class arraytest {

  	public static void main(String[] args) {
  		
  	int a = 90;
  	int b=  90;
  	int c = 90;
  	int d = 90;
  	int sum1 =0;
  	int sum2 =0;
  	int sum3 =0;
  	
  	sum1 = a+b+c+d;
  	
  	int[] arry = new int[4];
  	
  	arry[0]=90;
  	arry[1]=90;
  	arry[2]=90;
  	arry[3]=90;
  	
  	// 배열의 요소 전체 더하기
  	sum2 = arry[0] + arry[1] + arry[2] + arry[3];
  	//배열의 요소 전체 더하기 (반복문 사용)
  	for(int i=0; i<4 ; i++)
  	{
  		sum3 = sum3 + arry[i];
  	}
  		}
  	}
