package assesment;

public abstract class Person {
    private String name;


    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;

    }
}
