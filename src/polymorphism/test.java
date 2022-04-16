package polymorphism;

public class test {
    public static void main(String[] args) {
//        System.out.println("This is a polymorphism.test class");
//        Student student = new Student();
//        student.read();
//        student.read("ABC");

        Person person = new Person();

        Sagar sagar = new Sagar();
        sagar.doWork(person);
    }
}
