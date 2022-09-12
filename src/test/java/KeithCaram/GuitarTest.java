package KeithCaram;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Guitar
 */
public class GuitarTest {
    //create our three test Guitars
    private final Guitar classical = new Guitar(new Cordoba(), new Classical(), FinishColor.SUNBURST);
    private final Guitar electric = new Guitar(new Gibson(), new Rock(), FinishColor.BLACK);
    private final Guitar acoustic = new Guitar(new Taylor(), new Country(), FinishColor.WOOD);
    /**
     * test to create a classical guitar
     */
    @Test
    public void createClassical(){
        //test that string type is correct
        assertEquals(classical.getModel().getGuitarStringType(), TypeOfStrings.NYLON);
        //test that guitar type is correct
        assertEquals(classical.getModel().getType(), GuitarType.ACOUSTIC);
        //test that passed finish is correct
        assertEquals(classical.getFinish(), FinishColor.SUNBURST);
        //test that our guitar plays the correct song
        assertEquals(classical.getGenre().playSong(),
                "Play: Moonlight Sonata by Ludwig von Beethoven");
    }

    @Test
    public void createElectric(){
        //test that string type is correct
        assertEquals(electric.getModel().getGuitarStringType(), TypeOfStrings.STEEL);
        //test that guitar type is correct
        assertEquals(electric.getModel().getType(), GuitarType.ELECTRIC);
        //test that passed finish is correct
        assertEquals(electric.getFinish(), FinishColor.BLACK);
        //test that our guitar plays the correct song
        assertEquals(electric.getGenre().playSong(), "Play: Free Bird by Lynyrd Skynyrd");
    };

    @Test
    public void createAcoustic(){
        //test that string type is correct
        assertEquals(acoustic.getModel().getGuitarStringType(), TypeOfStrings.STEEL);
        //test that guitar type is correct
        assertEquals(acoustic.getModel().getType(), GuitarType.ACOUSTIC);
        //test that passed finish is correct
        assertEquals(acoustic.getFinish(), FinishColor.WOOD);
        //test that our guitar plays the correct song
        assertEquals(acoustic.getGenre().playSong(),
                "Play: Take Me Home, Country Roads by John Denver");
    }
}
