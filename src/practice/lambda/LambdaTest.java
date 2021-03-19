package practice.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		// ���ٽ��� �������̽��� ������ �����ϰ�,
		// �� ������ ����� ���ٽ� ������ ȣ��.
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello, lambda_1");
		showMyString(lambdaStr);
	}

	public static void showMyString(PrintString p) {
		// TODO Auto-generated method stub
		p.showString("Hello, lambda_2");
	}

}
