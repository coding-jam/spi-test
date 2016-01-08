package it.cosenonjaviste.providers;


import it.cosenonjaviste.spi.Dictionary;
import it.cosenonjaviste.spi.Translation;

import java.util.List;

/**
 * Created by acomo on 08/01/16.
 */
public class ItalianProvider extends Dictionary {

    public ItalianProvider() {
        this.dictionary.add("a");
        this.dictionary.add("ciao");
        this.dictionary.add("sera");
        this.dictionary.add("notte");
    }

    public List<Translation> translate(String text) {
        return findTranslation(text, "IT");
    }
}
