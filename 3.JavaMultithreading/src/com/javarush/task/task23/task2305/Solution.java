package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution [] array = new Solution[2];
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();

        solution1.innerClasses = new InnerClass[]{};
        solution2.innerClasses = new InnerClass[]{};
        array[0] = solution1;
        array[1] = solution2;
        return array;
    }



    public static void main(String[] args) {

    }
}
