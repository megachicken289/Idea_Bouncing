package com.HowToKillSelf_Generator;

import com.Cmn_Mods.Rep_Mods;

public class Start_Weirdo_Machine
{
    Rep_Mods mods = new Rep_Mods();
    protected void Suicide_SetUp()
    {
        System.out.println("SO, you want to kill yourself" +
                "Want to go with the classic Russian Rulette [Y/N]:");
        String isRulette_State = mods.redimeReduceTo(1, "", false, "low");
        if (isRulette_State.equals("y")) {
            StartRulleteMiniGame();
        }
        System.out.println("So, you don't like the classics" +
                "No, you prefer a different and exciting way to " +
                "end you life on this miserable planet.\n" +
                "Glad to hear and happy that you decided to use\n" +
                "our suicide services.\n" +
                "From the list of personal and carefully curated list\n" +
                "");
    }

    protected void StartRulleteMiniGame()
    {
        // give player classic russian rulette game

        // end game here
    }
}
