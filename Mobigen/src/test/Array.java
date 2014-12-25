/*
(369문제) 1에서 1000까지 정수가 배열(Array) 로 주어질 때, 
아래 조건에 맞는 숫자의 합을 구하는 코드를 작성하세요.
(규칙1) 3의 배수이거나, 숫자 속에 3이 들어 있는 숫자를 모두 더하는데,
(규칙2) 위 (규칙1) 의 숫자 중 10의 배수에 해당하는 숫자는 제외한다.
*/

package test;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[1000];
		int sum = 0;
		int total = 0;
		int result = 0;
		
		//1부터 1000까지 정수 배열 선언 및 초기화
		for(int i=0;i<arr.length;i++){
			arr[i] = i+1;
		}
		
		//3의 배수의 합
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3 == 0)
				sum+=arr[i];
		}
		
		//숫자 속에 3이들어간 숫자의 합
		for(int j=0;j<100;j++){
			//단, 3의 배수와 중복되는 수 제외
			if((10*j+3)%3!=0){
				total+=(10*j+3);
			}
		}
		
		result = sum + total;	//규칙1
		
		//10의 배수에 해당하는 숫자
		for(int i=0;i<arr.length;i++){
			if(arr[i]%10 == 0)
				result-=arr[i];	//규칙2
		}
		
		System.out.println("주어진 조건에 맞는 숫자의 합: "+result);
	}
}