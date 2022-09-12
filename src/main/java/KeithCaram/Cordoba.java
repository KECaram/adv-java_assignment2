package KeithCaram;

/**
 * Models a classical guitar from the brand Cordoba
 */
public class Cordoba implements Model{
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
        return TypeOfStrings.NYLON;
    }
}
