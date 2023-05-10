////////////////////////////////////////////////////////////////////
// Giulio Moretto 2011875
// Lisien Skenderi 2023461
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number){
        
        String romanNumeral = "";

        while(number >=1){
            romanNumeral += "I";
            number -= 1;
        }

        return romanNumeral;
    }

}
