package com.Cmn_Mods;

/**
 * Created by Frank Borges on 10/24/2017.
 */
public class MenusAndDia
{
	public void intro()
	{
		
	}
	public void UnderConstruction() { System.out.println("This Module is under Construction");}
	
	public String RetryQuestion (int howManyChar)
	{
		Rep_Mods mods = new Rep_Mods();
		System.out.println("Would you like to try answering that again [Y/N]: ");
		return mods.redimeReduceTo(howManyChar, "", false,"low");
	}
	
	public void OutOfBoundsMsg()
	{
		System.out.println(	"You have made an invalid decision\n" +
							"Please try again");
	}
}
