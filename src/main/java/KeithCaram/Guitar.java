package KeithCaram;

/**
 * This class represents a guitar.
 *
 * Guitars are best at playing different types of music based on their
 * makes/models, and come in a variety of finishes/colors
 *
 */
public class Guitar {
    private Model model;
    private FinishColor finish;
    private PlayingGenre genre;

    /**
     * Construct a new Guitar with the following attributes:
     *
     * @param guitarModel - the model of our guitar
     * @param guitarColor - the color/finish of our guitar
     * @param idealGenre - the genre of music our guitar is made to play
     */
    Guitar(Model guitarModel, PlayingGenre idealGenre, FinishColor guitarColor){
        this.model = guitarModel;
        this.genre = idealGenre;
        this.finish = guitarColor;
    }
    /**
     *
     * @return model of the guitar
     */
    Model getModel(){
        return this.model;
    }
    /**
     *
     * @return the genre the guitar is made to play
     */
    public PlayingGenre getGenre() {
        return this.genre;
    }
    /**
     *
     * @return the finish/color of the guitar
     */
    FinishColor getFinish(){
        return this.finish;
    }

}
