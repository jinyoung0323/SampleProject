package practice.lambda;

public class MyNumberTest {

	public static void main(String[] args) {
		// ���ٽ��� �������̽��� max ������ ����
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}

}
