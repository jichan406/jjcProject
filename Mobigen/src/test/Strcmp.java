/*
 * (strcmp문제) 임의의 언어로 strcmp(x,y)와 유사하게 아래와 같은 값을 리턴하는 문자열을 비교하는 함수 코드를 작성하세요.
 * strcmp("가나다", "가나다") 0리턴, strcmp("abc", "cbc") 음수리턴,
 * strcmp("cbc", "abc") 양수리턴, strcmp("abcde", "abc") 양수리턴
 */
package test;

public class Strcmp {
	public static void main(String[] args){
		//첫번째 변수와 두번째 변수가 같으면 0을 반환
		System.out.println("strcmp(가나다, 가나다) : " + strcmp("가나다", "가나다"));
		//첫번째 변수가 두번째 변수보다 작으면 음수를 반환
		System.out.println("strcmp(abc, cbc) : " + strcmp("abc", "cbc"));
		//첫번째 변수가 두번째 변수보다 작으면 양수를 반환
		System.out.println("strcmp(cbc, abc) : " + strcmp("cbc", "abc"));
		//첫번째 변수가 두번째 변수보다 크면 양수를 반환
		System.out.println("strcmp(abcde, abc) : " + strcmp("abcde", "abc"));
	}
	
	//2개의 문자열을 비교하고 int형 값을 반환(맨 첫자리부터 차례대로 비교하는 특성이 있다.)
	public static int strcmp(String first, String second){
		return first.compareTo(second);	
	}
}
