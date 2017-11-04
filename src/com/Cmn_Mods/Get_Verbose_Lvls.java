package com.Cmn_Mods;

/**
 * Created by Frank Borges on 10/24/2017.
 */
public class Get_Verbose_Lvls
{
//	Rep_Mods mods = new Rep_Mods();
	int thisVariableBetterNotBeEnabledBecauseItWillTurnAllTheAboveToOneSUPAFAST = 1;
	protected static int[] isVerbArr = new int [10];

//	public void setVerbLvlArr(int[] isVerbArr) { this.isVerbArr = isVerbArr; }
	
	public int[] getVerbLvlArr(int[] isVerbArr)
	{
		isVerbArr[0] = 0;	// DevAdv		= GODMODEonly			default:1	// dont enable unless you are manny b
		isVerbArr[1] = 0;	// DevModerate  = debugging				default:0
		isVerbArr[2] = 0;	// DevFriendly  = SeeBehindTheScenes	default:0
		isVerbArr[3] = 0;	// UserAdv		= GODMODEonly			default:1	// dONt enAbLe uNLesS You ARe maNnY B
		isVerbArr[4] = 0;	// UserModerate = n/a				 	default:0
		isVerbArr[5] = 0;	// UserFriendly = DemoBasic 			default:0
		isVerbArr[6] = 0;	// DemoExpand   = DevSet :example: isVerbArr[3] = isVerbArr[0]
		isVerbArr[7] = 0;	// not used
		isVerbArr[8] = 0;	// not used
		isVerbArr[9] = 0;	// not used
		
		return isVerbArr;
	}
	
	protected void superVerboseOverrideButton_DoNotUse()
	{
		// Do not enable the following unless you need to see ALL POSSIBLE VERBOSE BECAUSE YOU MESSED UP
		// 1 = all verbose levels plus godmod
		// 2 = all verbose levels
		// 3 = basic verbose levels
		if (isVerbArr[1]==1 || isVerbArr[3]==1) {
			System.out.println("SuperVerboseButtonOverride==" + thisVariableBetterNotBeEnabledBecauseItWillTurnAllTheAboveToOneSUPAFAST);
		}
		if (thisVariableBetterNotBeEnabledBecauseItWillTurnAllTheAboveToOneSUPAFAST==1) {
//			int k = 0;
//			for (int item:isVerbArr) {
//				if (item!=0) {
//					isVerbArr[k] = 1;
//				}
//				k++;
//			}
			for (int k = 0; k<isVerbArr.length; k++) {
				if (thisVariableBetterNotBeEnabledBecauseItWillTurnAllTheAboveToOneSUPAFAST==3) {
					// only enable userfriendly verbose
					k=4;
					isVerbArr[k] = 1;
				} else {
					isVerbArr[k] = 1;
				}
			}
		}
		checkVerboseStats();
	}
	
	/**
	 * Visual - Debugging | Anywhere
	 * *----------------------------*
	 * Allows dev to see if they have enabled
	 * verbose or not before/during runtime
	 * ++++++++++++++++++++++++++++++++++++++++
	 *
	 */
	protected void checkVerboseStats()
	{
		int lvl = 0;	// Generic counter token
		String humanReadability = "";	// Convert 0 and 1 to "off" and "on"
		// See autogen doc
//			System.out.println("---------------------------------");
//			System.out.println("- Verbose... [0 = off ; 1 = on] -");
//			System.out.println("---------------------------------");
		System.out.println("------LEVELS------");
		System.out.println("God Modes:\t0; 3");
		System.out.println("Dev:\t\t1-2");
		System.out.println("User:\t\t3-5");
		System.out.println("Misc:\t\t6");
		System.out.println("------------------");
		
		System.out.println(" Verbose");
		System.out.println("---------");
		System.out.printf("%-3s|%3s\n","Lvl", "IO");
		System.out.println("---+-----");
		for (int item : isVerbArr) {
			if (item==0) { humanReadability = "off"; }
			else if (item == 1) { humanReadability = "on";	}
			
			System.out.printf("%-3d|%4s\n", lvl, humanReadability);
//				System.out.println("---+----");							// makes bigger, but more readability
			lvl++;
		}
		System.out.println();
	}
}
