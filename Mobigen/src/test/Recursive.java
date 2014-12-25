//(재귀곱문제) 1부터 100까지의 곱을 재귀 함수를 써서 구하는 코드를 작성하세요.

package test;

public class Recursive {
	public static void main(String[] args) {
		System.out.println("100 factorial: " + factorial(100));
		//100의 재귀 곱은 반환값이 int와 long 자료형이 표현할 수 있는 범위를 벗어나므로 double형 사용
	}

	public static double factorial(int n) {
		if(n==1)
			return 1;
		else
			return n * factorial(n-1);
	}
}
