package ConvertProgramm;


import java.util.Scanner;

public class ConvertMain {
    public static void main(String[] args) {
        ConvertProgramClass converter = new ConvertProgramClass();
        Scanner scan = new Scanner(System.in);

        System.out.println(" Welcome! Please write your letter or number and let the computer translate from Eng to Morse and vise versa :) ");


        while (true) {
            String text = scan.nextLine();
            String value = converter.convertEngToMorseAndViceVersa(text);

            System.out.println("your letter/number is a empty: " + value);


            if ((text.equals(converter.isÅ("Å")))) {

                System.out.println(converter.isÅ("Please write only english letter (A-Z)"));

            } else if (text.equals(converter.isÄ("Ä"))) {

                System.out.println(converter.isÄ("Please write only english letter (A-Z)"));
            }


        }


    }












/*
            System.out.println(converter.convertToMorse(str));
            System.out.println(converter.convertToEng(str));
            System.out.println(converter.isSmall(" please write only capital letters "));
           str= scan.nextLine();
           //text = converter.toMorse(str);
           //text = converter.toEng(str);


           System.out.println(" The size of your hashmap is: " + converter.size(Integer.parseInt(scan.nextLine())));

           //converter.hashMapSize();

           //System.out.println(converter.checkIfConverterStopTranslate(scan.nextLine()));

       }


      // converter.toEng(" --- -* ");
       //System.out.println(converter.toMorse(" ON "));
        //converter.output(text);
       // System.out.println(converter.smallLetters(con));*/


}



