//Этот класс отвечает за логику
class Logic {
    static int y;
    static int a1;
    static int a2;
    static String[] letters = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static String calc(String input) throws Exception {

        String[] words = input.split(" ");
        Validator.examArray(words);
        String word1 = words[0];
        String word2 = words[1];
        String word3 = words[2];
        Validator.validate(word1, word3);
        boolean flag = false;
        for (String letter : letters)
            if (letter.equals(word1) || letter.equals(word3)) {
                flag = true;
                break;
            }
        if (flag) {
            a1 = Converter.letterToNumber(word1);
            a2 = Converter.letterToNumber(word3);
        } else {
            a1 = Integer.parseInt(word1);
            Validator.examInt(a1);
            a2 = Integer.parseInt(word3);
            Validator.examInt(a2);
        }
        Validator.examSign(word2);
        switch (word2) {
            case "+" -> y = a1 + a2;
            case "-" -> y = a1 - a2;
            case "*" -> y = a1 * a2;
            case "/" -> y = a1 / a2;
        }
        int unit;
        int dozens;
        if (flag) {
            Validator.examRom(y);
            dozens = y / 10;
            unit = y - dozens * 10;
            System.out.println(Converter.numberToLetterD(dozens) + Converter.numberToLetterU(unit));
        } else
            System.out.println(y);

        return input;
    }}