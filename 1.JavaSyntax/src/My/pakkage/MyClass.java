package My.pakkage;

public class MyClass {
// сортировка по возростанию
    public static void main(java.lang.String[] args) throws CloneNotSupportedException {

        Animal animal1 = new Animal("Pushok", 11);
        Animal animal2 = (Animal) animal1.clone();
        System.out.println("animal1: " + animal1.toString());
        System.out.println("animal2: " + animal2.toString());

    }


}


