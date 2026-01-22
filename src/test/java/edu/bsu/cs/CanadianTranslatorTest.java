package edu.bsu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CanadianTranslatorTest {
    @Test
    void translate_addsEh(){
        Translator translator = new CanadianTranslator();
        assertEquals("Hello eh",translator.translate("Hello"));
    }
}
