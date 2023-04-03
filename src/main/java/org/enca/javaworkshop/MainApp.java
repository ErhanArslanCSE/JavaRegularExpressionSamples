package org.enca.javaworkshop;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Regular Expression Workshop..." );

        RegularExpProg myTester=new RegularExpProg();

        //myTester.testAsDummy();// this method shows the ABCs of reg exp.

        System.out.println("Does the word Cat  starts with the range of c--f: "+myTester.givingALetterRange("Cat"));

        System.out.println("does the word Cat starts with a char different from c: "
                +myTester.isDifferentFromASpecifiedChar("Cat","C"));

        System.out.println("does the word Cat starts with a char different from d: "
                +myTester.isDifferentFromASpecifiedChar("Cat","D"));

        System.out.println("does the word cat starts with a char different from a-z: "
                +myTester.isDifferentFromASpecifiedChar("cat","a-z"));

        System.out.println("does the word *at starts with a char different from a-z: "
                +myTester.isDifferentFromASpecifiedChar("*at","a-z"));

        System.out.println("Does the word Cat has length of 3 with any word characters: "
                +myTester.doesContainOnlyWords("Cat"));

        System.out.println("Does the word 8at has length of 3 with any word characters: "
                +myTester.doesContainOnlyWords("8at"));

        System.out.println("Does the word *at has length of 3 with any word characters: "
                +myTester.doesContainOnlyWords("*at"));

        System.out.println("Does the word 123456 has only number characters: "
                +myTester.doesContainOnlyNumbers("123456"));

        System.out.println("Does the word 1y33 has only number characters: "
                +myTester.doesContainOnlyNumbers("1y33"));

        System.out.println("Does the word 123dsa*dsad has length of 3 with any word characters: "
                +myTester.doesContainOnlyWordsPro("123dsad*sad"));
        System.out.println("Does the word 123dsadsad has length of 3 with any word characters: "
                +myTester.doesContainOnlyWordsPro("123dsadsad"));

        System.out.println("does the value has a number format? "+ myTester.isPhoneFormat("123-4562-7899"));
        System.out.println("does the value has a number format? "+ myTester.isPhoneFormat("123-4562.789"));
        System.out.println("does the value has a number format? "+ myTester.isPhoneFormat("123-4562-78a"));

        System.out.println("Catdsaduy8*".matches("[\\w]+"));
        System.out.println("123-4567 185".matches("\\d{3}[ -]*\\d{4}[ -]*\\d{3}"));
        System.out.println("123-4567185".matches("\\d{3}[ -]*\\d{4}[ -]*\\d{3}"));
        System.out.println("123-4567     18511222".matches("\\d{3}[ -]*\\d{4}[ -]*\\d{3,6}"));

        // Lets write a word starts with Mr. or Mrs. and continues with name and surname. There have to be a space between name and surname.

        System.out.println("name control: "+myTester.nameSurnameControl("Mr. Erhan Arslan"));
    }
}
