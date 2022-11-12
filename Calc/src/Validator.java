import java.util.List;
//Этот класс отвечает за валидацию входящих занчений
class Validator {
    static String[] letters = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String[] s = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static final List<String> let = List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
    static final List<String> num = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

    public static void validate(String word1, String word3) throws Exception {
        if (let.contains(word1) && num.contains(word3) || let.contains(word3) && num.contains(word1)) {
            throw new Exception("You entered incorrect numbers");
        }
    }
    public static void examSign(String str1) throws Exception {
        if (str1.contains("+") || str1.contains("-") || str1.contains("*") || str1.contains("/")) {
        } else throw new Exception("You entered incorrect sign");
    }

    public static void examInt(int a) throws Exception {
        if (a > 10) throw new Exception("This number is greater than 10");
    }

    public static void examRom(int a) throws Exception {
        if (a <= 0)
            throw new Exception("there are no negative numbers in the Roman system and no zero");
    }

    public static void examArray(String[] str) throws Exception {
        if (str.length != 3)
            throw new Exception("The number of characters does not match the condition");
    }

}



