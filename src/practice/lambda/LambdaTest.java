package practice.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		// 람다식을 인터페이스형 변수에 대입하고,
		// 그 변수를 사용해 람다식 구현부 호출.
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello, lambda_1");
		showMyString(lambdaStr);
	}

	public static void showMyString(PrintString p) {
		// TODO Auto-generated method stub
		p.showString("Hello, lambda_2");
	}

}
