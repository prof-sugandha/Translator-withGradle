package edu.bsu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdentityTranslatorTest {
    @Test
    void translate_returnsSameString() {
        Translator translator = new IdentityTranslator();
        assertEquals("Foo", translator.translate("Foo"));
    }
    @Test
    void translate_emptyString() {
        Translator translator = new IdentityTranslator();
        assertEquals("", translator.translate(""));
    }
}
