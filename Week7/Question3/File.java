/**
 * Files inherit Document class for text File
 */
public class File extends Document {
  private String pathname;

  /**
   * Constructor
   * @param  pathname Pathname of the file
   */
  public File(String pathname) {
    super();
    this.pathname = pathname;
  }

  /**
   * Concat path with inner text
   * @return Details of the file in string
   */
  @Override public String toString()
  {
    return String.format("Path: %s \nText: \n%s\n"
      , this.pathname, this.text);
  } 
}