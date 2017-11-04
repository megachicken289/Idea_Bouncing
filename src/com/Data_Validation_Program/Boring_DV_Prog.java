package com.Data_Validation_Program;

import com.Cmn_Mods.MenusAndDia;
import com.Cmn_Mods.Rep_Mods;

/**
 * Created by Frank Borges on 10/24/2017.
 */
public class Boring_DV_Prog
{
	MenusAndDia menu = new MenusAndDia();
	Rep_Mods mods = new Rep_Mods();
	
	public String willLoop()
	{
//		System.out.println("Program has run\nWill loop back now");
		System.out.println("Would you like to loop back [Y/N]: ");
		return mods.redimeReduceTo(1,"", false,"low");
	}
	
	public String willAskToQuit()
	{
		System.out.println("Would you like to quit [Y/N]: ");
		
		return mods.redimeReduceTo(1,"",false,"low");
	}
	
	public void quiter()
	{
		
	}
}
