package ConvertProgramm;

import java.util.HashMap;

public class ConvertProgramClass {

    private HashMap<String, String> converter = new HashMap<>();

    public ConvertProgramClass() {
        converter.put("A", "*-");
        converter.put("*-", "A");
        converter.put("-***", "B");
        converter.put("B", "-***");
        converter.put("-*-*", "C");
        converter.put("C", "-*-*");
        converter.put("-**", "D");
        converter.put("D", "-**");
        converter.put("E", "*");
        converter.put("*", "E");
        converter.put("**-*", "F");
        converter.put("F", "**-*");
        converter.put("--*", "G");
        converter.put("G", "--*");
        converter.put("H", "****");
        converter.put("****", "H");
        converter.put("I", "**");
        converter.put("**", "I");
        converter.put("*---", "J");
        converter.put("J", "*---");
        converter.put("-*-", "K");
        converter.put("K", "-*-");
        converter.put("*-**", "L");
        converter.put("L", "*--*");
        converter.put("--", "M");
        converter.put("M", "--");
        converter.put("-*", "N");
        converter.put("N", "-*");
        converter.put("---", "O");
        converter.put("O", "---");
        converter.put("*--*", "P");
        converter.put("P", "*--*");
        converter.put("--*-", "Q");
        converter.put("Q", "--*-");
        converter.put("*-*", "R");
        converter.put("R", "*-*");
        converter.put("***", "S");
        converter.put("S", "***");
        converter.put("-", "T");
        converter.put("T", "-");
        converter.put("**-", "U");
        converter.put("U", "**-");
        converter.put("***-", "V");
        converter.put("V", "***-");
        converter.put("*--", "W");
        converter.put("W", "*--");
        converter.put("-**-", "X");
        converter.put("X", "-**-");
        converter.put("-*--", "Y");
        converter.put("Y", "-*--");
        converter.put("--**", "Z");
        converter.put("Z", "--**");
        converter.put("1", "*----");
        converter.put("*----", "1");
        converter.put("2", "**---");
        converter.put("**---", "2");
        converter.put("3", "***--");
        converter.put("***--", "3");
        converter.put("4", "****-");
        converter.put("****-", "4");
        converter.put("5", "*****");
        converter.put("*****", "5");
        converter.put("6", "-****");
        converter.put("-****", "6");
        converter.put("7", "--***");
        converter.put("--***", "7");
        converter.put("8", "---**");
        converter.put("---**", "8");
        converter.put("9", "----*");
        converter.put("----*", "9");
        converter.put("0", "-----");
        converter.put("-----", "0");
        converter.put(".", "*-*-*-");
        converter.put("*-*-*-", ".");
        converter.put(",", "--**--");
        converter.put("--**--", ",");
        converter.put("?", "**--**");
        converter.put("**--**", "?");

    }


    public String convertEngToMorseAndViceVersa(String text) {
        StringBuilder builder = new StringBuilder();

        String[] codes = text.split(" ");

        for (String code : codes) {
            String character = converter.get(code);
            builder.append(character);
        }

        return builder.toString();
    }



    public String isÅ(String text) {


        return text;
    }



    public String isÄ(String text) {
        return text;
    }
}






