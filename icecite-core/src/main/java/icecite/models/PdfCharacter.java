package icecite.models;

/**
 * A character in a PDF document.
 * 
 * @author Claudius Korzen
 */
public interface PdfCharacter extends PdfElement, HasColor, HasFont, HasText {
  /**
   * Returns the number of this character in the extraction order.
   *
   * @return The number of this character in the extraction order.
   */
  int getExtractionOrderNumber();

  /**
   * Sets the number of this character in the extraction order.
   *
   * @param num
   *        The number of this character in the extraction order.
   */
  void setExtractionOrderNumber(int num);

  // ==========================================================================

  /**
   * The factory to create instances of {@link PdfCharacter}.
   * 
   * @author Claudius Korzen
   */
  public interface PdfCharacterFactory {
    /**
     * Creates a PdfCharacter.
     * 
     * @return An instance of {@link PdfCharacter}.
     */
    PdfCharacter create();
  }
}
