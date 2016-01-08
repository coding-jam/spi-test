package it.cosenonjaviste.providers;


import it.cosenonjaviste.spi.Dictionary;
import it.cosenonjaviste.spi.Translation;

import java.util.List;

/**
 * Created by acomo on 08/01/16.
 */
public class EnglishProvider extends Dictionary {

    public EnglishProvider() {
        this.dictionary.add("a");
        this.dictionary.add("hello");
        this.dictionary.add("evening");
        this.dictionary.add("night");
    }

    public List<Translation> translate(String text) {
        return findTranslation(text, "EN");
    }
}
