import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyClass {

    public static void main(java.lang.String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
        Collections.sort(solarSystem);
        Collections.reverse(solarSystem);
        System.out.println(solarSystem);

    }
}
