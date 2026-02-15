
package FactoryPattern;

public class EnglishLanguage implements Language {

    @Override
    public String getGreeting() {
        return "Hello!";
    }

    public String getTranslation(String word) {
        return "Translation of '" + word + "' in English is: " + word;
    }
}
