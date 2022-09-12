package KeithCaram;
/**
 * Represents the Model of our guitar
 */
public interface Model {
    /**
     *
     * @return the type of guitar we have
     */
    GuitarType getType();
    /**
     *
     * @return the type of strings on our guitar
     */
    TypeOfStrings getGuitarStringType();
}
