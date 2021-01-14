package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main (String[] args) {
        String [] langs = {"Java", "C#", "Python", "PHP"};

        //for (int i=0; i < langs.length; i++) {   старый вариант, когда языки в качестве индекса указывали
        //  System.out.println("Я хочу изучать " + langs[i]);

        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP"); //можно без угловых скобок, но после фор Стринг поменять на Обджект

        // for (String l : languages) {  //теперь l не индекс, а ссылка на элемент массива

       for (int i=0; i < languages.size(); i++) {
      //по элементам списка можно устраивать итерацию при помощи этой вспомогательной переменной, size это как раньше length

        System.out.println("Я хочу изучать " + languages.get(i)); // раньше просто l было после +




        }
    }
}
