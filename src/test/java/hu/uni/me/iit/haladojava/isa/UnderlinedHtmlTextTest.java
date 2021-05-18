package hu.uni.me.iit.haladojava.isa;

import hu.uni.me.iit.haladojava.isahasa.TextSource;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class UnderlinedHtmlTextTest {

    @Test
    @DisplayName("Test if getPlainText return the tagged value")
    public void getPlainTextInCaseOfInput() {
        //given
        final String inputString = "String2";
        final String expectedString = "<u>String2</u>";
        //when
        final TextSource textSource = new UnderlinedHtmlText(inputString);
        final String actualString = textSource.getPlainText();
        //then
        assertEquals(actualString,expectedString);
    }

    @Test
    @DisplayName("Test if getPlainText return the tagged value in case of no input")
    public void getPlainTextInCaseOfNoInput() {
        //given
        final String inputString = "";
        final String expectedString = "<u></u>";
        //when
        final TextSource textSource = new UnderlinedHtmlText(inputString);
        final String actualString = textSource.getPlainText();
        //then
        assertEquals(actualString,expectedString);
    }

}