package org.enca.javaworkshop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCaptureGroup {

    public static void main(String[] args) {

        String regexStr="((\\d{1,2})[-\\s])?(\\d{3}[-\\s]?)(\\d{3}[-\\s]?)\\d{4}";
        Pattern pat=Pattern.compile(regexStr);

        Matcher mat=pat.matcher("12-123-523-6352");
        if(mat.matches())
        {
            System.out.printf("Country Code with ext %s \n",mat.group(1));
            System.out.printf("Country Code without ext %s \n ",mat.group(2));

        }
    }
}
