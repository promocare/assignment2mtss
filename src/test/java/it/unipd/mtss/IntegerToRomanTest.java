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

        String result = IntegerToRoman.convert(7);

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
}



