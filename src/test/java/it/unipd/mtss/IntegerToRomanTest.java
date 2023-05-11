package it.unipd.mtss;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for IntegerToRoman
 */
public class IntegerToRomanTest 
{
    /**
     * Test the number 1
     */
    @Test
    public void testNumberOneConversion()
    {
        String result = IntegerToRoman.convert(1);

        assertEquals("I",result);
    }

    /**
     * Test the number 2
     */
    @Test
    public void testNumberTwoConversion()
    {
        String result = IntegerToRoman.convert(2);

        assertEquals("II",result);
    }

    /**
     * Test the number 3
     */
    @Test
    public void testNumberThreeConversion()
    {

        String result = IntegerToRoman.convert(3);

        assertEquals("III",result);
    }

    //------- Test from 4 to 5 -------

    /**
     * Test the number 4
     */
    @Test
    public void testNumberFourConversion()
    {

        String result = IntegerToRoman.convert(4);

        assertEquals("IV", result);
    }

    /**
     * Test the number 5
     */
    @Test
    public void testNumberFiveConversion()
    {

        String result = IntegerToRoman.convert(5);

        assertEquals("V", result);
    }

    /**
     * Test the number 6
     */
    @Test
    public void testNumberSixConversion()
    {

        String result = IntegerToRoman.convert(6);

        assertEquals("VI", result);
    }

    //------- Test from 7 to 10 -------
    /**
     * Test the number 7
     */
    @Test
    public void testNumberSevenConversion()
    {

        String result = IntegerToRoman.convert(7);

        assertEquals("VII",result);
    }

    /**
     * Test the number 8
     */
    @Test
    public void testNumberEightConversion()
    {

        String result = IntegerToRoman.convert(8);

        assertEquals("VIII",result);
    }

    /**
     * Test the number 9
     */
    @Test
    public void testNumberNineConversion()
    {

        String result = IntegerToRoman.convert(9);

        assertEquals("IX",result);
    }

    /**
     * Test the number 10
     */
    @Test
    public void testNumberTenConversion()
    {

        String result = IntegerToRoman.convert(10);

        assertEquals("X",result);
    }

    /**
     * Test the number 11
     */
    @Test 
    public void testNumberElevenConversion()
    {
        String result = IntegerToRoman.convert(11);

        assertEquals("XI",result);
    }

    /**
     * Test the number 14
     */
    @Test
    public void testNumberFourteenConversion()
    {
        String result = IntegerToRoman.convert(14);

        assertEquals("XIV",result);
    }

    /**
     * Test the number 16
     */
    @Test
    public void testNumberSixteenConversion()
    {
        String result = IntegerToRoman.convert(16);

        assertEquals("XVI",result);
    }

    /*
     * Test the number 19
     */
    @Test
    public void testNumberNineteenConversion()
    {
        String result = IntegerToRoman.convert(19);

        assertEquals("XIX",result);
    }


    
}



