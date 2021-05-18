package hu.uni.me.iit.haladojava.isa;

import hu.uni.me.iit.haladojava.isahasa.HtmlText;

public class ItalicAndBoldHtmlText extends HtmlText {
    private static final String italicAndBoldOpenerTag = "<i><b>";

    private static final String italicAndBoldCloserTag = "</b></i>";

    public ItalicAndBoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return italicAndBoldOpenerTag.concat(super.getPlainText()).concat(italicAndBoldCloserTag);
    }
}
