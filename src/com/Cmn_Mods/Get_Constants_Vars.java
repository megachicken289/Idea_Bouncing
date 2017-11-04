package com.Cmn_Mods;

/**
 * Created by Frank Borges on 10/24/2017.
 */
public class Get_Constants_Vars
{
	protected static String[] constXXX = new String[3];
	protected static String[] constMenuItems = new String[3];
	protected static String[] constArrItems = new String[10];
	protected static String[] constArrSent = new String[4];
	protected static String[] constArrVowels = new String[5];
	
	
	public void setConstXXX(String[] constXXX) { this.constXXX = constXXX; }
	public void setConstMenuItems(String[] constMenuItems) { this.constMenuItems = constMenuItems; }
	public void setConstArrItems(String[] constArrItems) { this.constArrItems = constArrItems; }
	public void setConstArrSent(String[] constArrSent) { this.constArrSent = constArrSent; }
	public void setConstArrVowels(String[] constArrVowels) { this.constArrVowels = constArrVowels; }
	
	protected String[] getConstXXX()
	{
		constXXX[0] = "";
		
		return constXXX;
	}
	
	protected String[] getConstMenuItems()
	{
		constMenuItems[0] = "";
		
		return constMenuItems;
	}
	
	public String[] getConstArrItems()
	{
		constArrItems[0] = "PENIS";
		constArrItems[1] = "TESTES";
		constArrItems[2] = "RACECAR";
		constArrItems[3] = "TENET";
		constArrItems[4] = "LEVEL";
		constArrItems[5] = "ROTATOR";
		constArrItems[6] = "ROTAVATOR";
		constArrItems[7] = "MONKEYBUTT";
		constArrItems[8] = "ULTRABPOOP";
		constArrItems[9] = "ISARRAYSI";
		
		return constArrItems;
	}
	
	public String[] getConstArrSent()
	{
		constArrSent[0] = "THIS IS A SENTENCE";
		constArrSent[1] = "A NUT FOR A JAR OF TUNA";
		constArrSent[2] = "?Are we not drawn onward, we few, drawn onward to new era?";
		constArrSent[3] = "This Is An encoded message, suck a peen";
		
		return constArrSent;
	}
	
	public String[] getConstVowels()
	{
		constArrVowels[0] = "A";
		constArrVowels[1] = "E";
		constArrVowels[2] = "I";
		constArrVowels[3] = "O";
		constArrVowels[4] = "U";
		
		return constArrVowels;
	}
}
