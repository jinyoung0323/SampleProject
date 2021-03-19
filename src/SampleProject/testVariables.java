package SampleProject;

import java.util.ArrayList;

public class testVariables {

	public static void main(String[] args) {
//		ArrayList alist = new ArrayList();
//		alist.add("hello");
//		alist.add("java");
//		
//		// Object 자료형에서 String 자료형으로 형변환(Casting)
//		String hello = (String)alist.get(0);	
//		String java = (String)alist.get(1);
//		
//		System.out.println(hello);
//		System.out.println(java);
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hello");
		alist.add("java");
		
		String hello = alist.get(0);
		String java = alist.get(1);
		
		System.out.println(hello);
		System.out.println(java);
	}

}
