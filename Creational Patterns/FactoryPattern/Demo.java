
package FactoryPattern;

public class Demo {

    public static void main(String[] args) {
        LanguageFactory factory = new LanguageFactory();

        Language english = factory.getLanguage(LanguageEnum.ENGLISH);
        System.out.println(english.getGreeting());
        System.out.println(english.getTranslation("world"));

        Language hindi = factory.getLanguage(LanguageEnum.HINDI);
        System.out.println(hindi.getGreeting());
        System.out.println(hindi.getTranslation("world"));

        Language spanish = factory.getLanguage(LanguageEnum.SPANISH);
        System.out.println(spanish.getGreeting());
        System.out.println(spanish.getTranslation("world"));
    }
}