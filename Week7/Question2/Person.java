public class Person
{
  private String name;

  public Person()
  {
    this.name = "John Doe";
  }

  public Person (String theName)
  {
    this.name = theName;
  }

  public String getName()
  {
    return this.name;
  }

  public void setName (String theName)
  {
    this.name = theName;
  }

  @Override public String toString()
  {
    return "Name: " + this.name;
  }

  @Override public boolean equals(Object other)
  {
    Person otherPerson = (Person)other;
    return (this.name == otherPerson.name);
  }
}