package it.cosenonjaviste.spi;

/**
 * Created by acomo on 08/01/16.
 */
public class Translation {

    private String text;

    private String language;

    public Translation(String text, String language) {
        this.text = text;
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public String getLanguage() {
        return language;
    }
}
