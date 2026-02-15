
package FactoryPattern;

public class SpanishLanguage implements Language {

    @Override
    public String getGreeting() {
        return "¡Hola!";
    }

    public String getTranslation(String word) {
        return "La traducción de '" + word + "' en español es: " + word;
    }
}