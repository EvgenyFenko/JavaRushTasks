package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);

        getQuery(params);
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder("");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                if (!(result.toString().equals(""))){
//                    result.append(entry.getValue());
                    result.append(" and ");
                }
                result.append(entry.getKey());
                result.append(" = '");
                result.append(entry.getValue());
                result.append("'");
            }
        }
        System.out.println(result);

        return result.toString();
    }
}
