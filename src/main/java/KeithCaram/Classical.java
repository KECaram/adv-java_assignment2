package KeithCaram;
/**
 * models our guitar playing a classical song
 */
public class Classical implements PlayingGenre{
    /**
     *
     * @return the classical song our guitar plays
     */
    @Override
    public String playSong() {
        return "Play: Moonlight Sonata by Ludwig von Beethoven";
    }
}
