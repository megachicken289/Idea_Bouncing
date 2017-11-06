package com.CmnEnumArrs;

public class Rep_Arrs
{
// Objects/Enums
    Rep_Enums rEn = new Rep_Enums();

    protected String[] e2a_Colors = new String[Rep_Enums.colors.values().length];

    public String[] getE2a_Colors()
    {

        return e2a_Colors;
    }
}
