package com.AllPossibleCombos;

import com.Cmn_Mods.Rep_Mods;

import java.util.Scanner;

public class Start_AllPossCombos
{
    Rep_Mods mods = new Rep_Mods();

    public void APC_Setup()
    {
        Scanner input = new Scanner(System.in);

//        int[] digitWithOutPlaceholders = new int[];   // add with DigitsWithoutTheirPlace

        System.out.println("How many digits is the combo: ");
        int howManyDigits = input.nextInt();
        int[] digitPlaceholders = new int[howManyDigits];

        System.out.println("Do you know any digits (and possibly their place) [Y/N]: ");
        String userHasDigits = mods.redimeReduceTo(1,"",false,"low");
        DigitsAndTheirPlace(userHasDigits, digitPlaceholders);

/*// add with DigitsWithoutTheirPlace
        System.out.printf("Do you know any digits, but not their place [Y/N]: ");
        String userHasDigWOPlace = mods.redimeReduceTo(1,"", false,"low");
        DigitsWithoutTheirPlace(userHasDigWOPlace, digitWithOutPlaceholders);
/**/

        System.out.println("Here is all possible combinations, assuming order is not important");
        // shows all possible combos,

        System.out.println("Here is all possible permutations, assuming order is important");
        // shows all possible perma,


    }

    protected void DigitsAndTheirPlace(String userHasDigits, int[] digitPlaceholders)
    {
        Scanner input = new Scanner(System.in);

        while (userHasDigits.equals("y")) {
            System.out.println("What place is the digit: ");
            int tempDigitPlace = input.nextInt();

            System.out.printf("What is the digit: ");
            int tempDigitNumb = input.nextInt();

            digitPlaceholders[tempDigitPlace] = tempDigitNumb;
            mods.qDeb("digitPlaceHolders[" + tempDigitPlace + "]", tempDigitNumb );

            // at the end ; when user enters digit
            System.out.printf("DO you have any more digits to add [Y/N]: ");
            userHasDigits = mods.redimeReduceTo(1,"",false,"low");
        }
    }

    protected void DigitsWithoutTheirPlace(String userHasDigWOPlace, int[] digitWithOutPlaceholders)
    {
        Scanner input = new Scanner(System.in);

        while (userHasDigWOPlace.equals("y")) {
            int tempCount = 0;
            System.out.printf("Add digit: ");
            int addedDigit = input.nextInt();
            digitWithOutPlaceholders[tempCount] = addedDigit;

            // at the end ; when user enters digit
            System.out.printf("DO you have any more digits to add [Y/N]: ");
            userHasDigWOPlace = mods.redimeReduceTo(1,"",false,"low");
        }
    }

    protected void Calculate_NCR()
    {
        // test
    }

    protected void Calculate_NPR()
    {

    }
}
