////////////////////////////////////////////////////////////////////
// Giulio Moretto 2011875
// Lisien Skenderi 2023461
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number){
        
        String romanNumeral = "";

        while (number >= 5) {
            romanNumeral += "V";
            number -= 5;
        }
        while (number >= 4) {
            romanNumeral += "IV";
            number -= 4;
        }    
        while(number >=1){
            romanNumeral += "I";
            number -= 1;
        }

        return romanNumeral;
    }

}
