package hu.uni.me.iit.haladojava.isahasa;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HtmlText implements TextSource {
    private final String plainText;

    @Override
    public String getPlainText() {
        return this.plainText;
    }
}
