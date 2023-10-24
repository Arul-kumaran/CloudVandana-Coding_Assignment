public class PangramChecker {
    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(inputSentence);
        System.out.println(isPangram);
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
