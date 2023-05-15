package it.unipd.mtss;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class RomanPrinterTest {
    /*
     * Test the letter I 
     */
    @Test
    public void testLetterI(){
        String result = RomanPrinter.print(1);
        
        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n",result);
    }
}
