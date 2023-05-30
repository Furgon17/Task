package module2.Task11;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract Label getLabel();

    protected abstract String[] getKeywords();

    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
