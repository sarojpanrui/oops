//example of a Java code that demonstrates passing objects to a method using an object as a parameter:
public class objPassTomethod {
    public static void main(String[] args) {
      // Create objects
      Person person1 = new Person("John", 25);
      Person person2 = new Person("Jane", 30);
  
      // Pass objects to a method
      printPersonDetails(person1);
      printPersonDetails(person2);
    }
  
    public static void printPersonDetails(Person person) {
      System.out.println("Name: " + person.getName());
      System.out.println("Age: " + person.getAge());
      System.out.println();
    }
  }
  
  class Person {
    private String name;
    private int age;
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  }
