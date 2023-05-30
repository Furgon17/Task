package module2.Task11;

public class Task11 {
    public static void main(String[] args) {
        int maxLength = 20;
        String[] spamKeywords = {"spam", "bad"};
        TextAnalyzer[] ta = {new SpamAnalyzer(spamKeywords), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(maxLength)};
        System.out.println(checkLabels("Комментарий с плохим словом bad", ta));
        System.out.println(checkLabels("very Loooooooooooooooooong commet", ta));
        System.out.println(checkLabels("Negative comment :(", ta));
        System.out.println(checkLabels("Good comment! :)", ta));
    }

    public static Label checkLabels(String text, TextAnalyzer[] analyzers) { // сделал статикЮ дя удобного тестирования...
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }
}
