package My.pakkage;

public class Animal implements Cloneable {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return this.getClass() + this.name + this.age;
    }
}
