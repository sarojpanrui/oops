//example of a Java code that demonstrates passing objects to a method using an object as a parameter:
public class objpassmet {
    public static void main(String[] args) {
      // Create objects
      student s1 = new student("John", 25);
      student s2 = new student("Jane", 30);
  
      // Pass objects to a method
      printPersonDetails(s1);
      printPersonDetails(s2);
    }
  
    public static void printPersonDetails(student stu) {
      System.out.println("Name: " + stu.getName());
      System.out.println("Age: " + stu.getAge());
      System.out.println();
    }
  }
  
  class student {
    private String name;
    private int age;
  
    public student(String name, int age) {
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
