package it.cosenonjaviste.spi;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * SPI for Dictionary service
 *
 * Created by acomo on 08/01/16.
 */
public abstract class Dictionary {

    protected List<String> dictionary = new ArrayList<>();

    public abstract List<Translation> translate(String text);

    protected List<Translation> findTranslation(String text, String language) {
        return dictionary.stream()
                .filter(item -> item.equalsIgnoreCase(text))
                .map(item -> new Translation(text, language))
                .collect(toList());
    }
}
