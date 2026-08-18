package Aprendizado.DSjava.Chapter2.PersonExample;

public class Student implements Person {
    String id;
    String name;
    int age;
    public Student(String i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    protected int studyHours(){
        return age/2;
    }
    public String  getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean equalTo(Person other){
        Student otherStudent = (Student) other;
        return (id.equals(otherStudent.getId()));
    }
    public String toString(){
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
