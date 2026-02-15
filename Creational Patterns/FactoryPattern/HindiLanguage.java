
package FactoryPattern;

public class HindiLanguage implements Language {

    @Override
    public String getGreeting() {
        return "नमस्ते!";
    }

    @Override
    public String getTranslation(String word) {
        return "शब्द '" + word + "' का हिंदी में अनुवाद: " + word;
    }    
}