package org.enca.javaworkshop;

public class RegularExpProg {

    public boolean givingALetterRange(String data)
    {
        return data.matches("[c-fC-F]at");
    }

    public boolean isDifferentFromASpecifiedChar(String data,String specChar)
    {
        return data.substring(0,1).matches("[^"+specChar+"]");
    }

    public boolean doesContainOnlyWords(String data)
    {
        String regExpStr="";
        for (int i = 0; i < data.length(); i++) {
            regExpStr+="\\w";
        }
        return data.matches(regExpStr);
    }

    public boolean doesContainOnlyNumbers(String data)
    {
        String regExpStr="";
        for (int i = 0; i < data.length(); i++) {
            regExpStr+="\\d";
        }
        return data.matches(regExpStr);
    }

}
