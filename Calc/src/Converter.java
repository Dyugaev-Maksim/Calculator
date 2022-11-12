//Этот класс отвечает за конвертацию
class Converter {

    public static int letterToNumber(String letter) {
        if (letter.equals("I"))
            return 1;
        else if (letter.equals("II"))
            return 2;
        else if (letter.equals("III"))
            return 3;
        else if (letter.equals("IV"))
            return 4;
        else if (letter.equals("V"))
            return 5;
        else if (letter.equals("VI"))
            return 6;
        else if (letter.equals("VII"))
            return 7;
        else if (letter.equals("VIII"))
            return 8;
        else if (letter.equals("IX"))
            return 9;
        else if (letter.equals("X"))
            return 10;
        else return -1;
    }

    public static String numberToLetterD(int numbers) {
        if (numbers == 1)
            return "X";
        else if (numbers == 2)
            return "XX";
        else if (numbers == 3)
            return "XXX";
        else if (numbers == 4)
            return "XL";
        else if (numbers == 5)
            return "L";
        else if (numbers == 6)
            return "LX";
        else if (numbers == 7)
            return "LXX";
        else if (numbers == 8)
            return "LXXX";
        else if (numbers == 9)
            return "XC";
        else if (numbers == 10)
            return "C";
        else return "";
    }

    public static String numberToLetterU(int numbers) {
        if (numbers == 1)
            return "I";
        else if (numbers == 2)
            return "II";
        else if (numbers == 3)
            return "III";
        else if (numbers == 4)
            return "IV";
        else if (numbers == 5)
            return "V";
        else if (numbers == 6)
            return "VI";
        else if (numbers == 7)
            return "VII";
        else if (numbers == 8)
            return "VIII";
        else if (numbers == 9)
            return "IX";
        else if (numbers == 10)
            return "X";
        else return "";
    }}