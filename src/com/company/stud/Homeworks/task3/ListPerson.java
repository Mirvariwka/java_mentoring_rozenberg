package com.company.stud.Homeworks.task3;

import java.util.List;
import java.util.ArrayList;
/*Есть список строк. Создать одну строку, состоящую из элементов списка,
 длина которых менее 5 символов, через пробел, и вывести ее на консоль. (использовать List<String>, StringBuilder)

        Пример: список строк {“aaa”, “bbb”, “qwerty”, “”, “.”,”abcde”,“ccc”} => Вывод: “aaa bbb  . ccc”*/

public class ListPerson {
    public static void main(String[] args) {
        List<String> listDo5 = new ArrayList<>();
        listDo5.add("ya");
        listDo5.add("tebya");
        listDo5.add("jizn");
        listDo5.add(1, "lyublyu");
        listDo5.add("!");
        listDo5.add(3, ",");
        StringBuilder sb = new StringBuilder();
        for (String s : listDo5) {
            if (s.length() < 5) {
                sb.append(s + " ");
            }
        }
        System.out.println(sb);
    }
}


