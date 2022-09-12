package KeithCaram;
/**
 * Models our guitar playing a country song
 */
public class Country implements PlayingGenre{
    /**
     *
     * @return the country song our guitar plays
     */
    @Override
    public String playSong() {
        return "Play: Take Me Home, Country Roads by John Denver";
    }
}
