package day02;
// 제어문(Control Statement)
// 제어문이란 특정 코드(들)의 실행여부나 반복여부를 결정하는 코드이다.
// 제어문에는 조건문과 반복문이 있다.
// 조건문: 조건이 맞으면 코드를 실행
// 반복문: 조건이 맞으면 코드를 반복

// If문
// if문은 대표적인 조건문의 한종류로써
// 조건식을 적어주고 그 조건식이 true이면
// 코드블락이 실행된다.

// if문은 다음과 같은 구조를 가진다.
// if(조건식){
//		조건식이 참일때
//		실행될 코드들
// }

// 코드 블락과 변수의 유효범위(=scope)
// 코드 블락이란 한개의 { }의 전체 내용을 코드 블락이라고 한다.
// 1개의 코드 블락 안에는 여러개의 코드 블락이 들어갈 수도 있다.
//
// 코드블락이 중요한 이유는 우리가 변수를 선언하면
// 그 변수가 유효한 범위는 선언한 이후부터 그 변수가 속해 있는
// 코드 블락이 종료될때까지이기 때문이다.
// 해당 변수가 유효한 범위 안에서는 똑같은 이름의 변수는다시 선언해 줄 수 없다.
// 또한 유효범위가 끝난 이후에는 해당 변수는 없는 취급되기 때문에
// 값을 할당하거나 저장된 값을 출할수 없다!

public class Ex05If {
	public static void main(String[] args) {
		int number = 3;
		
		// if 조건식을 써서 number가 5보다 작은지 체크해보자
		
		
		if(number < 5) {
			System.out.println("number는 5보다 작습니다.");
			String name = new String("석현일");
			System.out.println("name: " +name);
	
		}
		
		System.out.println("프로그램 종료");
	}

}
