package FactoryPattern;

public class LanguageFactory {

    public static Language getLanguage(LanguageEnum languageType) {
        if (languageType == null) {
            return null;
        }
        switch (languageType) {
            case ENGLISH:
                return new EnglishLanguage();
            case HINDI:
                return new HindiLanguage();
            case SPANISH:
                return new SpanishLanguage();
            default:
                break;
        }
        return null;
    }
}