package practice.stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// sum()�������� arr�迭�� ����� ���� ��� ����.
		int sumVal = Arrays.stream(arr).sum();
		// count()�������� arr�迭�� ��� ������ ��ȯ.
		// count() ��ȯ ���� long�̹Ƿ� int������ ��ȯ
		int count = (int)Arrays.stream(arr).count();
	
		System.out.println(sumVal);
		System.out.println(count);
	}

}
