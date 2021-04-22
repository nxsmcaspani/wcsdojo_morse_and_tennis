import java.util.HashMap;

class Morse {
    public static final HashMap<String, String> morseMap = createMap();
    private static HashMap<String, String> createMap() {
        HashMap<String, String> morseMap = new HashMap<String,String>();
        morseMap.put("-.-.--", "!");
        morseMap.put("....-", "4");
        morseMap.put("..--..", "?");
        morseMap.put("--..--", ");");
        morseMap.put(".-.-.-", ".");
        morseMap.put("..---", "2");
        morseMap.put("...--", "3");
        morseMap.put("--...", "7");
        morseMap.put("-....", "6");
        morseMap.put(".....", "5");
        morseMap.put("---..", "8");
        morseMap.put("-...", "B");
        morseMap.put("----.", "9");
        morseMap.put(".--.", "P");
        morseMap.put("-----", "0");
        morseMap.put("--..", "Z");
        morseMap.put("-.--", "Y");
        morseMap.put("-..-", "X");
        morseMap.put("-.-.", "C");
        morseMap.put("...-", "V");
        morseMap.put(".----", "1");
        morseMap.put("..-.", "F");
        morseMap.put("....", "H");
        morseMap.put(".---", "J");
        morseMap.put("--.-", "Q");
        morseMap.put("-..-.", "/");
        morseMap.put(".-..", "L");
        morseMap.put("...", "S");
        morseMap.put("---", "O");
        morseMap.put("-.-", "K");
        morseMap.put(".-.", "R");
        morseMap.put("..-", "U");
        morseMap.put("-..", "D");
        morseMap.put(".--", "W");
        morseMap.put("--.", "G");
        morseMap.put("-.", "N");
        morseMap.put("--", "M");
        morseMap.put("..", "I");
        morseMap.put(".-", "A");
        morseMap.put("-", "T");
        morseMap.put(".", "E");
        return morseMap;
    }

    public static Object convert(String morse) {
        String response="";
        for(String mot : morse.split(("   "))) {
            for (String letter : mot.split(" ")) {
                response += morseMap.get(letter);
            }
            response+=" ";
        }
        return response.trim();
    }
}