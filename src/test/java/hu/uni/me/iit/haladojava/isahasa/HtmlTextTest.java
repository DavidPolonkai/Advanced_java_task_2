package hu.uni.me.iit.haladojava.isahasa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class HtmlTextTest {

    @Test
    @DisplayName("Test if getPlainText return the correct value")
    public void getPlainTextInCaseOfInput() {
        //given
        final String inputString = "String";
        final String expectedString = "String";
        //when
        final TextSource textSource = new HtmlText(inputString);
        final String actualString = textSource.getPlainText();
        //then
        assertEquals(actualString,expectedString);
    }

    @Test
    @DisplayName("Test if getPlainText return the correct value")
    public void getPlainTextInCaseOfNoInput() {
        //given
        final String inputString = "";
        final String expectedString = "";
        //when
        final TextSource textSource = new HtmlText(inputString);
        final String actualString = textSource.getPlainText();
        //then
        assertEquals(actualString,expectedString);
    }
}