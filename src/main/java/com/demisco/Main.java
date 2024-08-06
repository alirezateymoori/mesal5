package com.demisco;


import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Ali");
        list.add("Taghi");
        System.out.println(list.get(1));
        list.remove("Taghi");
        for (String string : list) {
            System.out.println(string);


        }
    }
}