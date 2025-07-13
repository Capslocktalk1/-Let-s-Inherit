class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber){
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudentInfo(){
        displayInfo();
        System.out.println("Roll number: " + rollNumber );
    }
}

public class Main{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 101);
        student1.displayStudentInfo();
        student1.age +=1;
        System.out.println("After a year: ");
        student1.displayStudentInfo();
    }
}