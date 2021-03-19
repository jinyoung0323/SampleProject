package practice.stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// sum()연산으로 arr배열에 저장된 값을 모두 더함.
		int sumVal = Arrays.stream(arr).sum();
		// count()연산으로 arr배열의 요소 갯수를 반환.
		// count() 반환 값이 long이므로 int형으로 변환
		int count = (int)Arrays.stream(arr).count();
	
		System.out.println(sumVal);
		System.out.println(count);
	}

}