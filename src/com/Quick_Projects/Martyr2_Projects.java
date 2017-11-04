package com.Quick_Projects;

import com.Cmn_Mods.Get_Constants_Vars;
import com.Cmn_Mods.Rep_Mods;

/**
 * Created by Frank Borges on 10/24/2017.
 *
 * Where the Ideas Come from:
 * http://www.dreamincode.net/forums/topic/78802-martyr2s-mega-project-ideas-list/
 */
public class Martyr2_Projects
{
	Rep_Mods mods = new Rep_Mods();
	Get_Constants_Vars consts = new Get_Constants_Vars();
	
	public String Reverse_A_String(String str)
	{
		int sLen = str.length();
		String[] gnirtS_A_esreveR = new String[sLen];
		String final_String = "";
//		System.out.printf("String Length: %d\n", sLen);
//		System.out.printf("String Itself: %s\n", str);
		
		int count = 0;
		for(int i = sLen; i > 0; i--) {
			gnirtS_A_esreveR[count] = str.substring(i-1,i);
//			System.out.println("Reverse by Letter: " + gnirtS_A_esreveR[count]);
			count++;
		}
		String seeAgain = "y";
		if (seeAgain.equals("y"))
		{
			for(String let:gnirtS_A_esreveR) {
				final_String = final_String+let;
			}
			System.out.println("Reversed String: " + final_String);
		}
		return final_String;
	}
	
	public String Pig_Latin(String str)
	{
		int sLen = str.length();
		str = str.toUpperCase().trim();
		String xAy = ("-" + str.substring(0,1) + "AY");
		String restOf = str.substring(1,sLen);
		String finalStr = restOf + xAy;
		String seeAgain = "y";
		if (seeAgain.equals("y")) {
			System.out.printf("Pig-Latin-ized: ");
			System.out.println(finalStr);
		}
		return finalStr;
	}
	
	public int Count_Vowels(String str)
	{
		int sLen = str.length();
		str = str.toUpperCase().trim();
		int countVowel = 0;
//		System.out.printf("String Length: %d\n", sLen);
		System.out.printf("String: %s\n", str);
		String[] strSplit = new String[sLen];
		for (int i = 0; i < sLen; i++) {
			strSplit[i] = str.substring(i,i+1);
//			System.out.println("Singular: " + strSplit[i]);
		}
		for (int i = 0; i<sLen; i++) {
//			System.out.println("outside I[" + i + "]");
			for (int j = 0; j <= 4; j++) {
//				System.out.println("inside I[" + i + "]+J[" + j + "]");
				if (strSplit[i].equals(consts.getConstVowels()[j])) {
					countVowel++;
				}
			}
		}
		System.out.println("Vowel Count: " + countVowel);
		return countVowel;
	}
	
	public boolean Check_For_Palidrome(String str)
	{
		System.out.printf("String w/ spaces: %s\n", str);
		str = str.toUpperCase().trim().replaceAll("\\s+","");
		int sLen = str.length();
//		System.out.printf("String Length: %d\n", sLen);
		System.out.printf("String w/o spaces: %s\n", str);
		boolean isPala;
		String firstHalf;
		String exactlyHalf;
		String secondHalf;
		if (sLen%2==0) {
			firstHalf = str.substring(0,sLen/2);
			secondHalf = str.substring(sLen/2,sLen);
			
			secondHalf = Reverse_A_String(secondHalf);
//			System.out.println("First: " + firstHalf);
//			System.out.println("Secon: " + secondHalf);
			if (firstHalf.equals(secondHalf)) isPala = true;
			else { isPala = false; }
		} else {
			firstHalf = str.substring(0,sLen/2);
			secondHalf = str.substring(sLen/2+1,sLen);
			exactlyHalf = str.substring(sLen/2,sLen/2+1);
			
			secondHalf = Reverse_A_String(secondHalf);
//			System.out.println("First: " + firstHalf);
//			System.out.println("Secon: " + secondHalf);
//			System.out.println("Exact: " + exactlyHalf);
			if ((firstHalf+exactlyHalf).equals((secondHalf+exactlyHalf))) isPala = true;
			else { isPala = false; }
		}
		System.out.println("isPaladrome: " + isPala);
		
		return isPala;
	}
	
	public int[] Count_Words_In_String(String str)
	{
		// Counts the number of individual words in a string. For added complexity read these
		// strings in from a text file and generate a summary.
		
		str = str.toUpperCase().trim();
		int[] sLen = new int[2];
		sLen[0] = str.length();
		System.out.printf("String w/ space: %s\n", str);
		String strWOSpace = str.replaceAll("\\s+","");
		sLen[1] = strWOSpace.length();
		System.out.printf("String w/o space: %s\n", strWOSpace);
		System.out.println("String Count w/ space: " + sLen[0]);
		System.out.println("String Count w/o space: " + sLen[1]);
		
		return sLen;
	}
	
	public void Ceasar_Cipher(String str)
	{
		str = str.toUpperCase().trim();
		System.out.printf("String w/ space: %s\n", str);
		str = str.replaceAll("\\s+","");
		int sLen = str.length();
		
		String[] changedWd = new String[sLen];
	}
	
	public void Text_To_HTML_Generator(String str)
	{
		// Converts text files into web HTML files and stylizes them.
		// Great for making online documentation of standard text documentation.
		
	}
	
	public void Text_To_XML_Generator(String str)
	{
		// Converts text files into web XML files and stylizes them.
		// Great for making online documentation of standard text documentation.
		
	}
	
	public void CD_Key_Generator(String str)
	{
		// Generates a unique key for your applications to use based on some arbitrary algorithm that you can specify.
		// Great for software developers looking to make shareware that can be activated.
	}
}

//this is a pretend fuckup to test pull'