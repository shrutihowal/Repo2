package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="MY Name Is Monika";
		/*String[] strArr=new String[str.length()];
		for(int i = 0; i < str. length(); i++)
		{
		   strArr[i] = String.valueOf(str. charAt(i));
		}*/
		
		int strLen=str.length();
		List<String> list = new ArrayList<String>(Arrays.asList(str.split(" ")));
		String newStr=new String();
		
		ListIterator iter = list.listIterator(list.size());

		while (iter.hasPrevious()) {
		      System.out.println(iter.previous());
		   }
	
		
	}

}
