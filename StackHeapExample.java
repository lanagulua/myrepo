public class StackHeapExample {

    public static void main(String[] args) {
        int count = 3;
        String message = new String("Hi!");
        Person person = new Person("Alice");

        greet(person, message);
    }

    public static void greet(Person p, String msg) {
        String greeting = msg + " " + p.getName();
        System.out.println(greeting);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
