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
        assertEquals("Test that string type is correct",
                classical.getModel().getGuitarStringType(), TypeOfStrings.NYLON);
        assertEquals("Test that guitar type is correct",
                classical.getModel().getType(), GuitarType.ACOUSTIC);
        assertEquals("Test that finish is correct",
                classical.getFinish(), FinishColor.SUNBURST);
        assertEquals("Test that guitar plays correct song",
                classical.getGenre().playSong(),
                "Play: Moonlight Sonata by Ludwig von Beethoven");
    }

    @Test
    public void createElectric(){
        assertEquals("Test that string type is correct",
                electric.getModel().getGuitarStringType(), TypeOfStrings.STEEL);
        assertEquals("Test that guitar type is correct",
                electric.getModel().getType(), GuitarType.ELECTRIC);
        assertEquals("Test that finish is correct",
                electric.getFinish(), FinishColor.BLACK);
        assertEquals("Test that guitar plays correct song",
                electric.getGenre().playSong(),
                "Play: Free Bird by Lynyrd Skynyrd");
    };

    @Test
    public void createAcoustic(){
        assertEquals("Test that string type is correct",
                acoustic.getModel().getGuitarStringType(), TypeOfStrings.STEEL);
        assertEquals("Test that guitar type is correct",
                acoustic.getModel().getType(), GuitarType.ACOUSTIC);
        assertEquals("Test that finish is correct",
                acoustic.getFinish(), FinishColor.WOOD);
        assertEquals("Test that guitar plays correct song",
                acoustic.getGenre().playSong(),
                "Play: Take Me Home, Country Roads by John Denver");
    }
}
