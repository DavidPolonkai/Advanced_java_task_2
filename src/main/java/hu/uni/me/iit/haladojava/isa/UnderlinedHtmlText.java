package hu.uni.me.iit.haladojava.isa;

import hu.uni.me.iit.haladojava.isahasa.HtmlText;

public class UnderlinedHtmlText extends HtmlText {
    private static final String underlinerOpenerTag = "<u>";

    private static final String underlinerCloserTag = "</u>";

    public UnderlinedHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return underlinerOpenerTag.concat(super.getPlainText()).concat(underlinerCloserTag);
    }
}
