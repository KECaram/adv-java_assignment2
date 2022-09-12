package KeithCaram;
/**
 * Models our guitar playing a rock song
 */
public class Rock implements PlayingGenre{
    /**
     *
     * @return the rock song our guitar plays
     */
    @Override
    public String playSong() {
        return "Play: Free Bird by Lynyrd Skynyrd";
    }
}
