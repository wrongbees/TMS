package com.Lesson7._task3_4;

public class TextFormater {
    public static boolean isPalindrome(String word){
        boolean result = true;
        /* внашме слове обрезаем все случайные пробеллы, переводим в нижний регистр
        и разбиваемв побуквенный массив.
         */
        String[] letters = word.trim().toLowerCase().split("");
        /*
        в цикле сравниваем первый и последний член массива, смещаясь к центру
         */
        for (int i = 0; i <= (letters.length/2)-1; i++){
            if (!letters[i].equals(letters[letters.length - 1 - i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
