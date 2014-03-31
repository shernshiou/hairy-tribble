/**
 * Document class implements class to handle text
 */
public class Document {
  protected String text;

  /**
   * Constructor
   */
  public Document() {
    this.text = "";
  }

  /**
   * Constructor to insert text
   * @param  text Text to be inserted
   */
  public Document(String text) {
    this.text = text;
  }

  /**
   * Text accessor
   * @return Text contained
   */
  public String getText() {
    return this.text;
  }

  /**
   * Text mutator
   * @param text Text to be set
   */
  public void setText(String text) {
    this.text = text;
  }

  @Override public String toString()
  {
    return this.text;
  }
}