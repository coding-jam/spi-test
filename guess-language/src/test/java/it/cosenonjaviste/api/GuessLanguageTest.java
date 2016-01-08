package it.cosenonjaviste.api;

import it.cosenonjaviste.spi.Translation;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by acomo on 08/01/16.
 */
public class GuessLanguageTest {

    @Test
    public void shouldBeItalian() throws Exception {
        GuessLanguage guessLanguage = new GuessLanguage();
        List<Translation> translations = guessLanguage.guess("sera");

        assertNotNull(translations);
        assertFalse(translations.isEmpty());
        assertEquals(1, translations.size());
        assertEquals("IT", translations.get(0).getLanguage());
    }

    @Test
    public void shouldBeItalianAndEnglish() throws Exception {
        GuessLanguage guessLanguage = new GuessLanguage();
        List<Translation> translations = guessLanguage.guess("a");

        assertNotNull(translations);
        assertFalse(translations.isEmpty());
        assertEquals(2, translations.size());

        assertTrue(isLanguage(translations, "IT"));
        assertTrue(isLanguage(translations, "EN"));
    }

    private boolean isLanguage(List<Translation> translations, String language) {
        return translations.stream().filter(translation -> translation.getLanguage().equals(language)).findFirst().isPresent();
    }
}