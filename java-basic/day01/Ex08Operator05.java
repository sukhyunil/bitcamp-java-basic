package day01;

// 비트연산자
// 비트연산은 숫자를 비트로 변환하여
// 연산을 하게 된다.
// & | ^ ~ << >>> >> 가 있다.

public class Ex08Operator05 {
	public static void main(String[] args) {
		// &: 2개의 숫자를 2진법으로 바꾸어서
		// 같은 자리가 모두 1일 때만 1이 나온다.
		int number1 = 20;
		// 0001 0100
		
		int number2 = 15;
		// 0000 1111
		
		// 0001 0100
		//&0000	1111
		//----------
		// 0000 0100 -> 4
		System.out.println(number1 & number2);
		
		// |: 2개의 숫자를 비교해서
		// 같은 자리가 하나라도 1이면 1. 2개 다 0이면 0.
		
		// 0001 0100
		//|0000 1111
		// ---------
		// 0001 1111 -> 31
		System.out.println(number1 | number2);
		
		// ^: 2개의 숫자를 비교해서
		// 같은 자리가 다를 때만 1 같으면 0
		// 0001 0100
		//^0000	1111
		//----------
		// 0001 1011 -> 27
		System.out.println(number1 ^ number2);
		
		// ~: 해당 숫자를 2진법으로 변경 후에
		// 0은 1, 1은 0으로 바꾼다.
		// 다만 int는 32자리이기 때문에
		// 쉬운 계산을 위하여
		// byte 변수를 하나 만들자
		
		byte myByte = 20;
		//~0001 0100
		//----------
		// 1110	1011
		// -128 + 1 + 2 + 8 + 32 + 64
		// = -21
		System.out.println(~myByte);
		
		// <<은 오른쪽에 나오는 숫자만큼
		// 자릿수를 이동한다.
		// myByte << 3
		// 1010 0000
		System.out.println((byte)(myByte << 3));
		
		// >> 은 오른쪽에 나오는 숫자만큼
		// 자릿수를 오른쪽으로 이동한다.
		// 단 부호는 유지된다. (맨 앞자리가 0이면 0으로 빈 공간을 채우고
		// 1이면 1로 채운다.)
		// myByte >> 3
		// 0001 0100 >> 3
		// 000 0001 0100
		// 0000 0010 -> 2
		System.out.println(myByte >> 3);
		
		myByte = -112;
		// 이제 myByte는
		// 1001 0000 이 되었다!
		// myByte >> 3
		// 1111 0010
		System.out.println(myByte >> 3);
		
		// 단 오른쪽 쉬프트 연산의 경우
		// 앞에 부호를 무시하고 무조건 0으로 채우는
		// >>> 연산자가 있다!
		// myByte >>> 3
		// 0001 0010
		// = 18
		System.out.println(myByte >>> 3);
		// 하지만 실제로는 java가 int로 강제로 바꿔버리기 때문에
		// 10001 0000 에서 시작하는 게 아니라
		// 1111 1111 1111 1111 1111 1001 0000 에서 시작해버린다!
		// 그래서
		// 000 1111 1111 1111 1111 1111 1001 0000
		// 0001 1111 1111 1111 1111 1111 0010
		// 가 되어버려서
		// 536870898 이 된다.
		
	}
}