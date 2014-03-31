/**
 * Document inherit Document class for Email
 */
public class Email extends Document {
  private String sender;
  private String recipient;
  private String title;

  /**
   * Constructor
   * @param  sender    Email's sender
   * @param  recipient Email's recipient
   * @param  title     Email's title
   */
  public Email(String sender, String recipient, String title) {
    super();
    this.sender = sender;
    this.recipient = recipient;
    this.title = title;
  }

  /**
   * Sender accessor
   * @return Sender
   */
  public String getSender() {
    return this.sender;
  }

  /**
   * Sender mutator
   * @param sender Sender
   */
  public void setSender(String sender) {
    this.sender = sender;
  }

  /**
   * Recipient accessor
   * @return Recipient
   */
  public String getRecipient() {
    return this.recipient;
  }

  /**
   * Recipient mutator
   * @param recipient Recipient
   */
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  /**
   * Title accessor
   * @return Title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Title mutator
   * @param title Title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Concat all the details of this email
   * @return Details of this email
   */
  @Override public String toString()
  {
    return String.format("Sender: %s \nRecipient: %s \nTitle: %s \nBody: \n%s\n"
      , this.sender, this.recipient, this.title, this.text);
  }
}