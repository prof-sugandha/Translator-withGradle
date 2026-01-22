package edu.bsu.cs;

public class CanadianTranslator implements Translator {
    @Override
    public String translate(String input){
        return input + " eh";
    }
}
