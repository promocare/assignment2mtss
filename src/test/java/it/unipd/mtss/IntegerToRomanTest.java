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
    public void testNumberOne()
    {
        String result = IntegerToRoman.convert(1);

        assertEquals(result, "I");
    }

    /**
     * Test the number 2
     */
    @Test
    public void testNumberTwo()
    {
        String result = IntegerToRoman.convert(2);

        assertEquals(result, "II");
    }

    /**
     * Test the number 3
     */
    @Test
    public void testNumberThree()
    {

        String result = IntegerToRoman.convert(3);

        assertEquals(result, "III");
    }
}
