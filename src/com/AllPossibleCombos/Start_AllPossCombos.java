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

        System.out.printf("How many digits is the combo: ");
        int howManyDigits = input.nextInt();
        int[] digitPlaceholders = new int[howManyDigits];

        System.out.printf( "What is the max number allowed for any digit\n" +
                            "Type \'0\' for 0-9. Type any other number for\n" +
                "any other size: ");
        int maxNumbAllowed = input.nextInt();
        maxNumbAllowed = sanitizeMaxNumb(input, maxNumbAllowed);

        System.out.printf("Do you know any digits (and possibly their place) [Y/N]: ");
        String userHasDigits = mods.redimeReduceTo(1,"",false,"low");
        DigitsAndTheirPlace(userHasDigits, digitPlaceholders);

/*// add with DigitsWithoutTheirPlace
        System.out.printf("Do you know any digits, but not their place [Y/N]: ");
        String userHasDigWOPlace = mods.redimeReduceTo(1,"", false,"low");
        DigitsWithoutTheirPlace(userHasDigWOPlace, digitWithOutPlaceholders);
/**/

        System.out.printf("Do you know if any numbers repeat [Y/N]: ");
        String repeatingNumbers = mods.redimeReduceTo(1, "", false,"low");
        if (repeatingNumbers.equals("y")) {
            System.out.println("Here is all possible combinations, assuming order is not important");
            // shows all possible combos,
            System.out.printf("probability for combo: " + Calculate_NCR(maxNumbAllowed,howManyDigits) + "\n");
        } else if (repeatingNumbers.equals("n")) {
            System.out.println("Here is all possible permutations, assuming order is important\nRepetition not allowed");
            // shows all possible perma,
            System.out.printf("probability for combo: " + Calculate_NPR(maxNumbAllowed, howManyDigits) + "\n");
        }
    }

    protected int sanitizeMaxNumb(Scanner input, int numb)
    {
        while (numb>=9 || numb<0) {
            System.out.printf("Please enter a number between 0 and 9: ");
            numb=input.nextInt();
        }
        if (numb == 0) {
            numb = 10;
        }
        return numb;
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

    protected int Calculate_NCR(int n, int r)
    {
        // order not important, rep not allowed
        // formula for combination
        // n!/r!(n-r)!
        int nF = mods.factorial(n);
        int rF = mods.factorial(r);
        int nrF = mods.factorial((n-r));
        return nF/(rF*(nrF));
}

    protected int Calculate_NPR(int n, int r)
    {
        // order important, rep not allowed
        // formula for combination
        // n!/(n-r)!
        int nF = mods.factorial(n);
        int nrF = mods.factorial(n-r);
        return nF/nrF;
    }

    protected int Calculate_NoOrder_YesRep(int n, int r)
    {
        // order not important, rep allowed
        // formula for
        // (r+n-1)!/r!(r-1)!
        int top = mods.factorial((r+n-1));
        int rF  = mods.factorial(r);
        int bot = mods.factorial((n-1));
        return top/(rF*bot);
    }

    protected int Calculate_YesOrder_YesRep(int n, int r)
    {
        // order not important, rep allowed
        // formula for
        // (r+n-1)!/r!(r-1)!
        return (int) Math.pow(n,r);
    }
}
