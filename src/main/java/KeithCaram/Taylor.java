package KeithCaram;
/**
 * Models an acoustic guitar from the brand Taylor
 */
public class Taylor implements Model{
    /**
     *
     * @return the type of guitar
     */
    @Override
    public GuitarType getType() {
        return GuitarType.ACOUSTIC;
    }

    /**
     *
     * @return the type of strings on the guitar
     */
    @Override
    public TypeOfStrings getGuitarStringType() {
        return TypeOfStrings.STEEL;
    }
}
