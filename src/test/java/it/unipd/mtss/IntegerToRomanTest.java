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

    //------- Test from 11 to 20 -------
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


    
    //------- Test from 21 to 50 -------
    /**
     * Test the number 21
     */
    @Test
    public void testNumberTwentyOneConversion()
    {

        String result = IntegerToRoman.convert(21);

        assertEquals("XXI",result);
    }

    /**
     * Test the number 40
     */
    @Test
    public void testNumberFortyConversion()
    {

        String result = IntegerToRoman.convert(40);

        assertEquals("XL",result);
    }

    /**
     * Test the number 45
     */
    @Test
    public void testNumberFortyFiveConversion()
    {

        String result = IntegerToRoman.convert(45);

        assertEquals("XLV",result);
    }

    /**
     * Test the number 50
     */
    @Test
    public void testNumberFiftyConversion()
    {

        String result = IntegerToRoman.convert(50);

        assertEquals("L",result);
    }


     //------- Test from 100 to 500 -------
    /**
     * Test the number 100
     */
    @Test
    public void testNumberOneHundredConversion()
    {

        String result = IntegerToRoman.convert(100);

        assertEquals("C",result);
    }

    /**
     * Test the number 400
     */
    @Test
    public void testNumberFourHundredConversion()
    {

        String result = IntegerToRoman.convert(400);

        assertEquals("CD",result);
    }

    /**
     * Test the number 444
     */
    @Test
    public void testNumberFourHundredFortyFourConversion()
    {

        String result = IntegerToRoman.convert(444);

        assertEquals("CDXLIV",result);
    }

    /**
     * Test the number 500
     */
    @Test
    public void testNumberFiveHundrerConversion()
    {

        String result = IntegerToRoman.convert(500);

        assertEquals("D",result);
    }


    //------- Test for edge cases -------
    /**
     * Test the number 0
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumberZeroError()
    {

        IntegerToRoman.convert(0);

    }

    /**
     * Test negative numbers
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbersError()
    {

        IntegerToRoman.convert(-2);

    }

    
    /**
     * Test positive exponentials
     */
    @Test
    public void testPositiveExponentialsError()
    {

        String result = IntegerToRoman.convert( (int)Math.pow(2, 3) );

        assertEquals("VIII",result);

    }

    /**
     * Test negative exponentials
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeExponentialsError()
    {

        IntegerToRoman.convert( (int)Math.pow(-2, 3) );

    }

    /**
     * Test number greater than 1000 
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumberGreaterThanOneThousandError()
    {

        IntegerToRoman.convert(1200);

    }

}



