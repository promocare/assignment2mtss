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

    /*
     * Test the letter V 
     */
    @Test
    public void testLetterV(){
        String result = RomanPrinter.print(5);
        
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n",result);
    }

    /*
     * Test the number 8
     */
    @Test
    public void testNumberEightPrint(){
        String result = RomanPrinter.print(8);
        
        assertEquals(" __      __ _____  _____  _____ \n \\ \\    / /|_   _||_   _||_   _|\n  \\ \\  / /   | |    | |    | |  \n   \\ \\/ /    | |    | |    | |  \n    \\  /    _| |_  _| |_  _| |_ \n     \\/    |_____||_____||_____|\n",result);
    }
}
