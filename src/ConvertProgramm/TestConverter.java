package ConvertProgramm;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {

    public static String[][] morseCodes() {
        return new String[][]{
                {"*-", "A"},
                {"A", "*-"},
                {"B", "-***"},
                {"-***", "B"},

        };
    }


    @ParameterizedTest
    @MethodSource("morseCodes")
    @DisplayName("Test morse translates to english correctly and vice versa ")
    public void testMyConverter(String input, String expected) {
        ConvertProgramClass converter = new ConvertProgramClass();
        assertEquals(expected, converter.convertEngToMorseAndViceVersa(input));
    }



    @Test

    public void testIfInputIsÅ(){
        ConvertProgramClass converter = new ConvertProgramClass();
        String actual = converter.isÅ("Å");

         String expected = "Å";

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testIfInputIsÄ(){
        ConvertProgramClass converter = new ConvertProgramClass();
        String actual = converter.isÄ("Ä");

        String expected = "Ä";

        Assert.assertEquals(expected, actual);

    }


}


