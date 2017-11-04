package com.Cmn_Mods;

/**
 * Created by Frank Borges XPTHQ on 10/30/2017.
 */
public class Curses
{
	public String[] curseWords = new String[20];
	public String[] altCurseWords = new String[20];
	
	protected String[] getCurseWords()
	{
		curseWords[0] = "shit";
		curseWords[1] = "piss";
		curseWords[2] = "fuck";
		curseWords[3] = "cunt";
		curseWords[4] = "cock";			// cocksucker
		curseWords[5] = "fuck";			// motherfucker
		curseWords[6] = "tits";
		curseWords[7] = "fart";			// not bad
		curseWords[8] = "turd";
		curseWords[9] = "twat";
		// end of 10 cursewords
		curseWords[10] = "dick";
		curseWords[11] = "pussy";
		curseWords[12] = "hell";
		curseWords[13] = "bitch";
		curseWords[14] = "damn";
		curseWords[15] = "";
		
		
		return null;
	}
	
	protected String[] getAltCurseWords()
	{
		curseWords[0] = "poop";
		curseWords[1] = "pee";
		curseWords[2] = "sex";
		curseWords[3] = "vagina";
		curseWords[4] = "penis";			// cocksucker
		curseWords[5] = "fricker";			// motherfucer
		curseWords[6] = "boobs";
		curseWords[7] = "fart";				// not bad
		curseWords[8] = "vagina";
		
		
		return null;
	}
}
