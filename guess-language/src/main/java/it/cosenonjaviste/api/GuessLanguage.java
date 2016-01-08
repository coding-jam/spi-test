package it.cosenonjaviste.api;

import it.cosenonjaviste.spi.Dictionary;
import it.cosenonjaviste.spi.Translation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * API for accessing Guess Language service
 *
 * Created by acomo on 08/01/16.
 */
public class GuessLanguage {

    private ServiceLoader<Dictionary> services = ServiceLoader.load(Dictionary.class);

    public List<Translation> guess(String text) {
        Iterator<Dictionary> iterator = this.services.iterator();

        List<Translation> translations = new ArrayList<>();
        while (iterator.hasNext()) {
            Dictionary dictionary = iterator.next();
            translations.addAll(dictionary.translate(text));
        }

        return translations;
    }
}
