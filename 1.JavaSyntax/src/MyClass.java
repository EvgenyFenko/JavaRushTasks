import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyClass {
// сортировка по возростанию
    public static void main(java.lang.String[] args) {
        int[] array = {1, 5, 3, 8, 9, 12};

        for (int out = array.length - 1; out >= 0; out--)
        {
            for (int in = 0; in < out; in++)
            {
                if (array[in] < array[in + 1])
                {
                    int tmp = array[in +1];
                    array[in + 1] = array[in];
                    array[in] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
