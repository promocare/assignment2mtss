////////////////////////////////////////////////////////////////////
// Giulio Moretto 2011875
// Lisien Skenderi 2023461
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

   
    public static String print(int num){

        return printAsciiArt(IntegerToRoman.convert(num));
    }

    static final String[] letterI = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };

    static final String[] letterV = {
        " __      __",
        " \\ \\    / /",
        "  \\ \\  / / ",
        "   \\ \\/ /  ",
        "    \\  /   ",
        "     \\/    "
    };

    static final String[] letterX = {
        " __   __",
        " \\ \\ / /",
        "  \\ V / ",
        "   > <  ",
        "  / . \\ ",
        " /_/ \\_\\"
    };

    static final String[] letterL = {
        "  _      ",
        " | |     ",
        " | |     ",
        " | |     ",
        " | |____ ",
        " |______|"
    };

    static final String[] letterC = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    };

    private static String printAsciiArt(String romanNumber){
        String output = "";
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < romanNumber.length(); j++){
                switch(romanNumber.charAt(j)){
                    case 'I':
                        output += letterI[i];
                        break;

                    case 'V':
                        output += letterV[i];
                        break;

                    case 'X':
                        output += letterX[i];
                        break;
                    
                    case 'L':
                        output += letterL[i];
                        break;
                    case 'C':
                        output += letterC[i];
                        break;
                }
            }
            output += "\n";
        }
        return output;
    }

}
