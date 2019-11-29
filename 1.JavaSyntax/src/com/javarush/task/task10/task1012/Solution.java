package com.javarush.task.task10.task1012;                                                                                                    
                                                                                                    
import java.io.BufferedReader;                                                                                                    
import java.io.InputStreamReader;
import java.util.*;
                                                                                                    
/*                                                                                                     
Количество букв                                                                                                    
*/                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
    public static void main(String[] args) throws Exception {                                                                                                    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                                                                    
                                                                                                    
        // Алфавит                                                                                                    
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',                                                                                                    
                'з','и','й','к','л','м','н','о',                                                                                                    
                'п','р','с','т','у','ф','х','ц',                                                                                                    
                'ч','ш','щ','ъ','ы','ь','э','ю','я');                                                                                                    
                                                                                                    
        // Ввод строк                                                                                                    
        ArrayList<String> list = new ArrayList<String>();                                                                                                    
        for (int i = 0; i < 10; i++) {                                                                                                    
            String s = reader.readLine();                                                                                                    
            list.add(s.toLowerCase());                                                                                                    
        }                                                                                                    
                                                                                                    
        // напишите тут ваш код
        //        System.out.println(alphabet.getClass());
        Map<Character, Integer> result = new HashMap<Character, Integer>(); // создал Мапу

        for (int i = 0; i < alphabet.size(); i++) {
//            System.out.println(alphabet.get(i)); // debug
            result.put(alphabet.get(i), 0); // заполнил мапу ключами и значениями
        }

        for (int i = 0; i < list.size(); i++)
        {
            char[] strToArray = list.get(i).toCharArray();
            for(int j = 0; j < strToArray.length; j++)
            {
                int oldValue = result.get(strToArray[j]);
                int newValue = oldValue + 1;
                result.replace(strToArray[j],newValue);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iterator = result.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<Character, Integer> pair = iterator.next();
            Character key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }
                                                                                                  
    }                                                                                                    
}