package com.Cmn_Mods;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class is where all repeatable modules go.
 * Keeps them easy to find and transferable between
 * different testing scenarios
 * Created by manny on 4/11/17.
 */

public class Rep_Mods
{
	
	// Objects
	Get_Constants_Vars consts = new Get_Constants_Vars();
	Get_Verbose_Lvls verbLvl = new Get_Verbose_Lvls();

// Debutting
	/**
	 * Debugging | Anywhere
	 * *-------------------*
	 * Mostly a test mod
	 * =====================
	 * Used to confirmAct an action has
	 * been done in the console
	 * ******************************
	 * Output: [Action has been confirmed: ACTION]
	 * ******************************
	 * ++++++++++++++++++++++++++++++
	 * @param action
	 *
	 */
	protected void confirmAct(String action)
	{
		if (verbLvl.isVerbArr[2] == 1) {
			System.out.println("<@ [Action has been confirmed: " + action + "]\n");
		}
		
	}
	
	/**
	 * Debugging | Anywhere
	 * *-------------------*
	 * Tells user that it is testing
	 * what they want to be tested
	 * ==============================
	 * Used to show that an action is
	 * being taken; typically used to
	 * show that an action is being
	 * taken at a specific point and
	 * helps find broken sequences
	 * ******************************
	 * Output: [[TESTING: ACTION]]
	 * ******************************
	 * ++++++++++++++++++++++++++++++
	 * @param action
	 *
	 */
	protected void testing(String action)
	{
		if (verbLvl.isVerbArr[2] == 1)
		{
			System.out.println("<@ [[TESTING: " + action + "]]\n");
		}
	}
	
	/**
	 * Debugging | Anywhere
	 * *-------------------*
	 * Quick/dirty debugging module
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * Lets dev know the output of a calculation
	 * *****************************
	 * Can only be seen with verbose turned
	 * on inside the running program
	 * 			***********
	 * Output: <<[DEBUG TESTING RESULTS FOR: action]>>
	 * <*<VAR[STRING]	>>>>>>>RESULTS: str
	 * ******************************
	 * ++++++++++++++++++++++++++++++
	 * @param action
	 * @param str
	 */
	protected void qDeb(String action, String str)
	{
		if (verbLvl.isVerbArr[1] == 1)
		{
			System.out.println("<*<[DEBUG TESTING RESULT FOR: " + action + "]>>\n" +
					"<*<VAR[STRING]" +
					"\t\t>*>>>>>>>>OUTPUT: " + str + "\n");
		}
	}
	
	/**
	 ** Debugging | Anywhere
	 * *-------------------*
	 * Quick/dirty debugging module
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * Lets dev know the output of a calculation
	 * *****************************
	 * Can only be seen with verbose turned
	 * on inside the running program
	 * 			***********
	 * Output: <<[DEBUG TESTING RESULTS FOR: action]>>
	 * <*<VAR[DOUBLE]	>>>>>>>RESULTS: str
	 * ******************************
	 * ++++++++++++++++++++++++++++++
	 * @param action
	 * @param doub
	 */
	protected void qDeb(String action, double doub)
	{
		if (verbLvl.isVerbArr[1] == 1)
		{
			System.out.println("<*<[DEBUG TESTING RESULT FOR: " + action + "]>>\n" +
					"<*<VAR[DOUBLE]" +
					"\t\t>*>>>>>>>>OUTPUT: " + doub + "\n");
		}
	}
	
	/**
	 ** Debugging | Anywhere
	 * *-------------------*
	 * Quick/dirty debugging module
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * Lets dev know the output of a calculation
	 * *****************************
	 * Can only be seen with verbose turned
	 * on inside the running program
	 * 			***********
	 * Output: <<[DEBUG TESTING RESULTS FOR: action]>>
	 * <*<VAR[INTEGER]	>>>>>>>RESULTS: str
	 * ******************************
	 * ++++++++++++++++++++++++++++++
	 * @param action
	 * @param integ
	 */
	public void qDeb(String action, int integ)
	{
		if (verbLvl.isVerbArr[1] == 1)
		{
			System.out.println("<*<[DEBUG TESTING RESULT FOR: " + action + "]>>\n" +
					"<*<VAR[INTEGER]" +
					"\t\t>*>>>>>>>>OUTPUT: " + integ + "\n");
		}
	}
	
	protected void qDeb(String action, int[] integ)
	{
		if (verbLvl.isVerbArr[1] == 1)
		{
			System.out.println("<*<[DEBUG TESTING RESULT FOR: " + action + "]>>\n" +
					"<*<VAR[INTEGER:ARRAY]" +
					"\t\t>*>>>>>>>>OUTPUT: " + integ + "\n");
		}
	}
	
	protected void qDebForLoops(String action, String str, int loopCounter)
	{
		if (verbLvl.isVerbArr[1] ==1)
		{
			
		}
	}
	
	// graphics/visuals
	/**
	 * Visual - Enhancement | Anywhere
	 * *------------------------------*
	 * Used to make borders for various methods calls
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * Typically found in verify[Multi]PassFail
	 * @param actStr    = the base word used to determine how long
	 * @param baseChars    = action.length() + 2 [for spaces]
	 * @param specChar    = the designated repeated character
	 * @return
	 */
	protected String mkStars(String actStr, int baseChars, String specChar)
	{
		int actLen = actStr.length();
		
		String starred = "";
		
		actLen = baseChars + actLen;		// By default; baseChar = 22
		
		for (int i = 0; i < actLen; i++)
		{
			starred = starred + specChar;	// By default; specChar = "*"
		}
		
		return starred + "\n";
	}
	
	/**
	 * Visual - Enhancement | Anywhere
	 * *------------------------------*
	 * use to clear the console
	 * =========================
	 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * WARNING: May only work for ACTUAL
	 * 			console, not in-IDE terminal
	 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * @throws IOException
	 * @throws InterruptedException
	 */
	protected void clearConsole() throws IOException, InterruptedException
	{
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	
	/**
	 * Visual - Enhancement | Anywhere
	 * *------------------------------*
	 * Use to clear the console
	 * =======================================
	 * Quick, dirty and cheap hack to "clear" console
	 * while also keeping the history available
	 * =======================================
	 * Not necessary, but nice to have/look at
	 * +++++++++++++++++++++++++++++++++++++++
	 * @param howMuchCrap
	 */
	protected static void clrHax(int howMuchCrap)
	{
		for(int i=0; i<howMuchCrap; i++) System.out.println();
	}

// verbose
	/** TODO: Add SuccessfulPasses explaination
	 * Verbose - Visual | Anywhere VB is req
	 * *------------------------------------*
	 * Mostly a test mod
	 * ======================================
	 * This mod takes in a string for visual feedback,
	 * two stings that will be used to check against
	 * each other.
	 * If both strings match, depending on the verbose
	 * level set, user can see more detailed info on
	 * what passed or what failed and how/why
	 * ======================================
	 * **************************************
	 * Used to show verification of action
	 * 	1) will return "Verification passed" in console
	 * 		if actual String matched expected string
	 * 	2) will return "Verification failed" in console
	 * 		if actual String did not match expected string
	 * 		a) Console will also show hardcoded string
	 * 			and mismatched expected string
	 * 	**************************************
	 * 	*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * 	See docs page for explaination of the
	 * 	variable "successfulPasses
	 * 	*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * 	++++++++++++++++++++++++++++++++++++++
	 * @param action
	 * @param expect
	 * @param actual
	 * @param isPassW
	 */
	protected int verifyPassFail(String action, String expect, String actual, int isPassW)
	{
		String starred = mkStars(action, 22, "*");
		String censoredExpect = mkStars(expect, 0, "#");
		String censoredActual = mkStars(actual, 0, "#");
		int isSuccessful = 0;
		
		if (actual.equals(expect))
		{
			if (verbLvl.isVerbArr[5] == 1)
			{
				// Determine if a test has passed or failed
				System.out.print("\n" + starred);
				System.out.println(" " + action + " Verification Passed");
				if (verbLvl.isVerbArr[1] == 1) {
					if (isPassW==1) {
						System.out.println(" Expected: " + censoredExpect);        // Debugging only
						System.out.println("   Actual: " + censoredActual);        // Debugging only
					} else {
						System.out.println(" Expected: " + expect);        // Debugging only
						System.out.println("   Actual: " + actual);        // Debugging only
					}
				}
				System.out.println(starred);
			}
			isSuccessful = 1;
		} else {
			if (verbLvl.isVerbArr[5] == 1)
			{
				// Determine if a test has passed or failed
				if (isPassW==1) {
					System.out.print("\n" + starred);
					System.out.println(" " + action + " Verification Failed");
					System.out.println(" Expected: " + censoredExpect);
					System.out.println("   Actual: " + censoredActual);
					System.out.println(starred);
				} else {
					System.out.print("\n" + starred);
					System.out.println(" " + action + " Verification Failed");
					System.out.println(" Expected: " + expect);
					System.out.println("   Actual: " + actual);
					System.out.println(starred);
				}
			}
			isSuccessful = 2;
		}
		return isSuccessful;
	}
	
	/**
	 * Verbose - Visual | Anywhere VB is req
	 * *------------------------------------*
	 * Mostly a test mod
	 * ======================================
	 * This mod takes in a string for visual feedback,
	 * THREE stings that will be used to check against
	 * each other; one is the actual, which will be
	 * checked against TWO possible expected
	 * If the actual string matches either of
	 * strings depending on the verbose level
	 * set, user can see more detailed info on
	 * what passed or what failed and how/why
	 * ======================================
	 * **************************************
	 * (same as verifyPassFail, but for
	 * 	multiple expected strings)
	 * Used to show verification of action
	 * 	1) will return "Verification passed" in
	 * 		console if actual String matched
	 * 		expected string
	 * 	2) will return "Verification failed" in
	 * 		console if actual String did not
	 * 		match expected string
	 * 		a) Console will also show hardcoded
	 * 			string and mismatched expected
	 * 			string
	 * **************************************
	 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * See docs page for explaination of
	 * the variable "successfulPasses
	 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * ++++++++++++++++++++++++++++++++++++++
	 * @param action
	 * @param mactual
	 * @param mexpect
	 * @param mexpect2
	 */
	protected int verifyMultiPassFail(String action, String mactual, String mexpect, String mexpect2)
	{
		String starred = mkStars(action, 22, "*");
		int isMultiSuccessful = 0;
		if (mactual.equals(mexpect)||mactual.equals(mexpect2))
		{
			if (verbLvl.isVerbArr[5] ==1)
			{
				// Determine if a test has passed or failed
				System.out.println("\n" +
						starred +
						" " + action  + " Verification Passed");
				if (verbLvl.isVerbArr[1] == 1) {
					System.out.println(" Expected[1]: " + mexpect);		// Debugging only
					System.out.println(" Expected[2]: " + mexpect2);		// Debugging only
					System.out.println("      Actual: " + mactual);			// Debugging only
				}
				System.out.println(starred);
			}
			
			isMultiSuccessful=1;
		}
		else
		{
			if (verbLvl.isVerbArr[5] ==1)
			{
				// Determine if a test has passed or failed
				System.out.println("\n" +
						starred +
						" " + action + " Verification Failed" + "\n" +
						" Expected[1]: " + mexpect + "\n" +
						" Expected[2]: " + mexpect2 + "\n" +
						"      Actual: " + mactual + "\n" +
						starred + "\n"
				);
			}
			isMultiSuccessful = 2;
		}
		return isMultiSuccessful;
	}
	
	/**
	 * Verbose - Basic/Req | Anywhere
	 * *-----------------------------*
	 * Required verbose
	 * ===============================
	 * Basic verbose/console feedback
	 * to let users know their test is
	 * CURRENTLY running
	 * ++++++++++++++++++++++++++++++++
	 * @param isRunning
	 */
	protected void ConfirmRunning(String isRunning)
	{
		Object runningStar = mkStars(isRunning, 15, "*");
		System.out.println("\n" + runningStar +
				"Running: " + isRunning + " Tests\n" +
				runningStar + "\n");
	}
	
	/**
	 * Verbose - Basic/Req | Anywhere
	 * *-----------------------------*
	 * Required verbose
	 * ===============================
	 * Basic verbose/console feedback to let
	 * users know their test is FINISHED running
	 * ++++++++++++++++++++++++++++++++++++++++++
	 * @param isFinished
	 */
	protected void ConfirmFinished(String isFinished)
	{
		Object runningStar = mkStars(isFinished, 15, "*");
		Object runningStarOuter = mkStars(isFinished,15, "!");
		System.out.println("\n" + runningStarOuter +
				runningStar +
				"Finished: " + isFinished + "\n" +
				runningStar +
				runningStarOuter + "\n");
		
	}
	
	/**
	 * Visual - Menu | Main Demo Hub
	 * *----------------------------*
	 * If you haven't logged in, this pops up
	 * =======================================
	 * Module is called to simply let user know
	 * they can't complete a specific portion
	 * of the demo until they have logged
	 * in to the website
	 */
	protected void CantUntilLoggedIn()
	{
		String cantUseModMessage = "<# You cannot run this test until you have successfully logged in";
		Object runningStar = mkStars(cantUseModMessage, 0, "!");
		System.out.println("\n" + runningStar + cantUseModMessage + "\n" + runningStar + "\n");
	}

// Data validation modules
	//Add ability to turn off/on verbose - complete
	/**
	 * Data Validation | MenusAndDialog && Test_Login
	 * *---------------------------------------------*
	 * Data validation for user answers
	 * ===============================================
	 * Reduces an answer down to the len-variable
	 * character after going through a crucible
	 * +++++++++++++++++++++++++++++++++++++++++++++++
	 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * "reduced = reduced.trim().toLowerCase();"
	 * WAS FORMERLY SEPARATED BUT I CHAINED THEM ON
	 * 080317.
	 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
	 * @param len
	 * @param toReduce
	 * @param passTheStr
	 * @param toCase
	 * @return
	 */
	public String redimeReduceTo (int len, String toReduce, boolean passTheStr, String toCase)
	{
		Scanner input = new Scanner(System.in);
		
		String reduced = "";			// Foucusing crystal for toReduce
		
		/**
		 * if bool passTheStr is true, this mod will not attempt to recapture the user's input; ie, this mod will simply
		 *		"pass along" the string toReduce to be potentially trunicated LEN characters
		 * if bool passTheStr is false, this mod will attempt to recapture user's input, as this mod believes that no input
		 *		has been captured in the first place, THEN it will potentially trunicate LEN characters
		 */
		if (passTheStr) {
			// This is a legacy option ; it is rarely used for newer modules
			// Allows a string to be passed from where it was called to save
			//		Scanner object instantiation
			reduced = toReduce;
		} else {
			// This is used
			reduced = input.nextLine();
		}
		
		reduced = reduced.toString();
		if (toCase.equals("low")) {
			reduced = reduced.trim().toLowerCase();
		} else if (toCase.equals("hi")) {
			reduced = reduced.trim().toUpperCase();
		}
		
		if (reduced.length()<=len) return reduced;
		reduced = reduced.substring(0,len);
		
		if (verbLvl.isVerbArr[1] == 1) {
			System.out.println("<*< Redime(" + len + "): " + reduced);
		}
		
		return reduced;
	}
	
	//TODO:PARSE FOR INT -> IF INT; TURN INTO NUMBER
	/**
	 * Data Validation | MenusAndDialog
	 * *-------------------------------*
	 * This mod checks for numbers
	 * =================================
	 * This mod checks an user-input
	 * answer for one of three things
	 * 		1) a number; currently 1, 2, 3, 4
	 * 		2) against an array from Get_Const_Vars
	 * 		3) none of the above
	 * and returns an int variable
	 * +++++++++++++++++++++++++++++++++
	 * @param str
	 * @return
	 */
	protected int checkForNumber(String str)
	{
		
		/**
		 * 0 = false
		 * 1 = isNumbered
		 * 2 = isOption
		 */
		int isNumber = 0;		// 0 = no ; 1 = yes
		String checkingIfNumbered = str;		// Used to make sure it starts cleared everytime
		String checkingIfSwitched = "";			// 		to check for switch
		
		if (checkingIfNumbered.length()<=1 ) {
			isNumber = 0;
		} else if (checkingIfNumbered.equals("n")) {
			isNumber=99; 	// Checks for "NO"
		} else {
			// Trunicated because only the first char of the
			// only char this module is interested in
			checkingIfNumbered = String.valueOf(str.charAt(0));
			checkingIfSwitched = String.valueOf(str.charAt(1));
			// Debugging
			if (verbLvl.isVerbArr[1] == 1) {
				System.out.println("< checkForNum - checkingIfNumbered: " + checkingIfNumbered);
			}
			
			if (checkingIfNumbered.equals("1") || checkingIfNumbered.equals("2") ||
					checkingIfNumbered.equals("3") || checkingIfNumbered.equals("4")) {
				isNumber = 1;
			}
			
			for (int i = 0; i < consts.getConstMenuItems().length; i++) {
				if (str.equals(consts.getConstMenuItems()[i])) {
					isNumber = 2;
				}
			}
			
			if (checkingIfNumbered.equals("v")) isNumber = 4;
			
			if (checkingIfSwitched.equals("-")) isNumber = 3;	// Checks for switch
		}
		if (verbLvl.isVerbArr[1] ==1) {
			// Shows user what the output is
			System.out.println("<*< checkForNumber: " + isNumber);
		}
		return isNumber;
	}
	
	/**TODO:Use this for All int binIS types
	 * NOTQUITE-DATA VALIDATION | Demo_Stats class
	 * (soon to be everywhere)
	 * *------------------------------------------*
	 * ============================================
	 * Used to convert int-type variables into
	 * human readable format
	 * ++++++++++++++++++++++++++++++++++++++++++++
	 * @param toConvert
	 * @return
	 */
	protected static String convertToHuman_StatInfo(int toConvert)
	{
		if (toConvert ==0) 	return "Untested";
		else if (toConvert ==1) 	return "Pass";
		else if (toConvert ==2) 	return "Tested and failed";
		else if (toConvert ==3) 	return "Pass*"; // Previously "See Specific Test Results for Pass/Failure"
		else if (toConvert ==4)		return "Skipped*"; // Means untested but for good reason
		else if (toConvert ==99)	return "Not Available";
		else 					return "ERR";
	}
	
}

/**
 * WhatIsIt | WhereIsItLocated
 * *----------*
 * TL;DR
 * ==============
 * Long Description
 * ****************
 * Notes
 * ****************
 * *#*#*#*#*#*#*#*
 * Warning
 * *#*#*#*#*#*#*#*
 * @param nonExistant
 */

//<editor-fold desc="Depreciated">
//	protected static int checkForSwitch(String str, int[] isVerbArr)
//	{
//		Get_Constant_Vars consts = new Get_Constant_Vars();
//
//		int isSwitch = 0;		// 0 == no ; 1 == yes
//		String checkingIfSwitch = str;		// used to make sure it starts fresh everytime
//
//		if (checkingIfSwitch.length()<=1) isSwitch = 0;
//		else {
//			// trunicated because only the first char of the
//			// only char this module is interested in
//			checkingIfSwitch = String.valueOf(str.charAt(1));
//			// debugging
//			if (isVerbArr[1] == 1) {
//				System.out.println("checkForSwi - checkingIfSwitch: " + checkingIfSwitch);
//			}
//
//			if (checkingIfSwitch.equals("-")) {
//				isSwitch = 1;
//			}
//		}
//	}
//</editor-fold>
