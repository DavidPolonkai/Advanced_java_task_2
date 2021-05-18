package hu.uni.me.iit.haladojava.isa;

import hu.uni.me.iit.haladojava.isahasa.HtmlText;

public class BoldHtmlText extends HtmlText {
    private static final String boldOpenerTag = "<b>";

    private static final String boldCloserTag = "</b>";

    public BoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return boldOpenerTag.concat(super.getPlainText()).concat(boldCloserTag);
    }
}
