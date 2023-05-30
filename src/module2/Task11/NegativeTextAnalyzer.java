package module2.Task11;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] negativeSmile = {":(", ":|", "=("};

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return negativeSmile;
    }
}
