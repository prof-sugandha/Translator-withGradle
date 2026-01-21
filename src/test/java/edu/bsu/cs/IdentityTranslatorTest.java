package edu.bsu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdentityTranslatorTest {
    @Test
    void translate_returnsSameString() {
        IdentityTranslator translator = new IdentityTranslator();
        assertEquals("Foo", translator.translate("Foo"));
    }
}
