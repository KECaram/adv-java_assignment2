package KeithCaram;
/**
 * Models an electric guitar from the brand Gibson
 */
public class Gibson implements Model{
    /**
     *
     * @return the type of guitar
     */
    @Override
    public GuitarType getType() {
        return GuitarType.ELECTRIC;
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
