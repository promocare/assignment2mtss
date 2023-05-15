////////////////////////////////////////////////////////////////////
// Giulio Moretto 2011875
// Lisien Skenderi 2023461
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number){
        
        String romanNumeral = "";

        if(number <= 0){
            throw new IllegalArgumentException("Input should be positive and greater than zero");
        }

        if(number > 1000){
            throw new IllegalArgumentException("Input should less or equal to 1000");
        }

        while (number == 1000) {
            romanNumeral += "M";
            number -= 1000;        
        }
        
        while (number >= 900) {
            romanNumeral += "CM";
            number -= 900;
        }

        while (number >= 500) {
            romanNumeral += "D";
            number -= 500;
        }

        while (number >= 400) {
            romanNumeral += "CD";
            number -= 400;
        }

        while (number >= 100) {
            romanNumeral += "C";
            number -= 100;
        }

        while (number >= 90) {
            romanNumeral += "XC";
            number -= 90;
        }

        while (number >= 50) {
            romanNumeral += "L";
            number -= 50;
        }
        while (number >= 40) {
            romanNumeral += "XL";
            number -= 40;
        }

        while (number >= 10) {
            romanNumeral += "X";
            number -= 10;
        }
        while (number >= 9) {
            romanNumeral += "IX";
            number -= 9;
        }

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
