package com.example;

import java.util.Locale;

public class HelloHelper {

    public String getGreeting(Locale locale) {

        String languageTag = locale.toLanguageTag().substring(0, 2);

        String greeting;
        switch (languageTag){
            case "fr":
                greeting = "Bonjour";
                break;
            case "de":
                greeting = "Guten tag";
                break;
            default:
                greeting = "Hello";
                languageTag = "en";
        }
        return greeting;
    }
}
