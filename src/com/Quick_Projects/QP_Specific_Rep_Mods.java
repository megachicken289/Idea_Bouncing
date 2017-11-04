package com.Quick_Projects;

/**
 * Created by Frank Borges on 10/25/2017.
 */
public class QP_Specific_Rep_Mods
{
	protected String The_Gauntlet(String str)
	{
		str = Sanitize(str);
		str = checkForExist(str);
		
		return str;
	}
	
	protected String Sanitize(String str)
	{
		return str.toUpperCase().trim();
	}
	
	protected String checkForExist(String str)
	{
		int sLen = str.length();
		if (sLen>0) {
			return str;
		} else {
			return "DEFAULT";
		}
	}
}
