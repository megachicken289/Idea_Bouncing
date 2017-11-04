package com.Data_Validation_Program;

import com.Cmn_Mods.MenusAndDia;
import com.Cmn_Mods.Rep_Mods;

/**
 * Created by Frank Borges on 10/24/2017.
 */
public class DVP_Main
{
	public void DVP_Setup()
	{
		Rep_Mods mods = new Rep_Mods();
		MenusAndDia menus =  new MenusAndDia();
		Boring_DV_Prog bDVP = new Boring_DV_Prog();
		
		System.out.println("Program Will begin to run now");
		
		String chooseRunProg = "";
		String loopBack 	 = "";
		String chooseQuit 	 = "";
		
		do {
			do {
				System.out.println("Would you like to run this prog [Y/N]: ");
				chooseRunProg = mods.redimeReduceTo(1, "", false, "low");
				if (chooseRunProg.equals("y")) {
					loopBack = bDVP.willLoop();                        // lets user know it will loop again
					if (loopBack.equals("n")) {
						DVP_Breakdown();
					}
				} else if (chooseRunProg.equals("n")) {
					chooseQuit = bDVP.willAskToQuit();                        // asks for quit
					if (chooseQuit.equals("y")) {
						DVP_Breakdown();
					} else if (chooseQuit.equals("n")) {
						chooseRunProg = "y";
					}
				} else {
					menus.OutOfBoundsMsg();                    // how?
					chooseRunProg = menus.RetryQuestion(1);
				}
			} while (loopBack.equals("y"));
		}while (chooseRunProg.equals("y"));
	}
	
	public void DVP_Breakdown()
	{
		System.out.println("Program Will End Now");
		System.exit(0);
	}
}
