package com.AllPossibleCombos;

public class Combo_AutoUnlock
{
    public static void main(String[] args) {
        // TODO code application logic here
        double combination = Math.random();
        combination = (int)(combination*100000);
        combination = Math.round(combination);
        System.out.println(combination);
        for (int i = 0; i<=100000;i++) {
            System.out.println(i);
            if (i==combination) {
                System.out.println("Passcode found: " + i);
                break;
            }
        }
    }
}
