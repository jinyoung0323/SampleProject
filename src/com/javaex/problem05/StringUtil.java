package com.javaex.problem05;

public class StringUtil {
	public static String concatString(String[] s){
		String str = "";
		for(int i = 0; i < s.length; i++) {
			str += s[i];
        }
		return str;
    }
}
