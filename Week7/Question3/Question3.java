/**
 * Question3 class implements application using Document, Email and File class
 */
public class Question3 {

  /**
  * Main application
  * 
  * @param args
  */
  public static void main(String[] args) {
    Document doc = new Document("Hello world");
    Email email = new Email("google@gmail.com", "yahoo@yahoo.com", "Important Email MUST READ");
    email.setText("Not so important after all");
    File file = new File("C:\\abc.txt");
    file.setText("Bacon ipsum dolor sit amet beef ribs hamburger corned beef chicken fatback. \nPork chop porchetta ribeye short ribs pig flank kielbasa spare ribs chicken beef.");

    System.out.println(doc.toString());
    System.out.println(email.toString() + ">>>>>Contain ribeye? " + ContainKeyword(email, "ribeye") + "<<<<<\n");
    System.out.println(file.toString() + ">>>>>Contain ribeye? " + ContainKeyword(file, "ribeye") + "<<<<<\n");
  }

  /**
   * Check whether the text of the document contain the keyword
   * @param  docObject document containing text
   * @param  keyword   keyword to be searched
   * @return           True if found, False if not found
   */
  public static Boolean ContainKeyword (Document docObject, String keyword)
  {
    if (docObject.toString().indexOf(keyword, 0) >= 0)
      return true;
    return false;
  }
}