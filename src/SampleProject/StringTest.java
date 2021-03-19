package SampleProject;

public class StringTest {

	public static void main(String[] args) {
		
//		String str1 = "abc";
//		String str2 = "cde";
//		String str3 = str2;
//		str2 = str1.toUpperCase();
//		String str4 = str2.concat("??");
//		String str5 = "!".concat(str2).concat("@");
//		String str6 = "abc";
//		
//		System.out.println("str1 : " + str1);
//		System.out.println("str2 : " + str2);
//		System.out.println("str3 : " + str3);
//		System.out.println("str4 : " + str4);
//		System.out.println("str5 : " + str5);
//		
//		System.out.println(str1.equals(str6));
//		
//		String greeting = "Hello JAVA!";
//		System.out.println(greeting.charAt(3));
//		System.out.println(greeting.charAt(10));
//		System.out.println(greeting.substring(4, 9));
	
//		String str = "JAVA Programming";
//		System.out.println(str.length());
//		for(int i = 0; i < str.length(); i++) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.println(str.replace("A", "B"));
//		System.out.println(str.toUpperCase());
		
		
		// str 내용 중 공백(" ")을 "," 로 변경하는 코드 작성.
//		String str = "apple mango banana";
//		String s = "APPLE MANGO BANANA";
//		System.out.println(str.replace(" ", ","));
//		System.out.println(str.contains(" "));
//		System.out.println(str.indexOf(" m"));
//		System.out.println(str.equals(s));
//		System.out.println(str.equalsIgnoreCase(s));
//		System.out.println(str.trim());
//		System.out.println(str.length());
//		String[] split = str.split(" ");
//		System.out.println(split[0]);
//		System.out.println(split[1]);
//		System.out.println(split[2]);
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		String s = new String(c);
		System.out.println(s);
		s = s.replaceAll(" ", ",");
		System.out.println(s);
		
	}

}
