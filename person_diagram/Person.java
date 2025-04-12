package person_diagram;

public class Person {
    private String name;
    private int age;

    // constructor
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}