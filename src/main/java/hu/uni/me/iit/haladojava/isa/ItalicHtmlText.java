package hu.uni.me.iit.haladojava.isa;

import hu.uni.me.iit.haladojava.isahasa.HtmlText;

public class ItalicHtmlText extends HtmlText {
    private static final String italicOpenerTag = "<i>";

    private static final String italicCloserTag = "</i>";

    public ItalicHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return italicOpenerTag.concat(super.getPlainText()).concat(italicCloserTag);
    }
}
