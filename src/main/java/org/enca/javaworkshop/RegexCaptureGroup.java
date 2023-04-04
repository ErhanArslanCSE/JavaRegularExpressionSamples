package org.enca.javaworkshop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCaptureGroup {

    public static void main(String[] args) {

       RegexCaptureGroup regEx=new RegexCaptureGroup();
       regEx.captureGroupViaNumber();
        regEx.captureGroupViaGroupNames();
    }

    public void captureGroupViaNumber()
    {
        String regexStr="((\\d{1,2})[-\\s])?(\\d{3}[-\\s]?)(\\d{3}[-\\s]?)\\d{4}";
        Pattern pat=Pattern.compile(regexStr);

        Matcher mat=pat.matcher("12-123-523-6352");
        if(mat.matches())
        {
            System.out.printf("Country Code with ext %s \n",mat.group(1));
            System.out.printf("Country Code without ext %s \n ",mat.group(2));

        }
    }
    public void captureGroupViaGroupNames()
    {
        String regexStr="(?:(?<countryCode>\\d{1,2})[-\\s])?(?<cityCode>\\d{3}[-\\s]?)(\\d{3}[-\\s]?)\\d{4}";
        Pattern pat=Pattern.compile(regexStr);

        //?:  chars will eliminate the regex group
        //?<>  will give a name to the regex group. so, we can call it via its name.
        Matcher mat=pat.matcher("12-123-523-6352");
        if(mat.matches())
        {
            System.out.printf("Country Code : %s \n",mat.group("countryCode"));
            System.out.printf("City Code : %s \n ",mat.group("cityCode"));

        }

        System.out.println("---".matches("\\W{3}"));
    }
}
