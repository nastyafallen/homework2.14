package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	StringList stringList = new StringListImpl();
    stringList.add("test1");
    stringList.add("test2");
    stringList.add("test3");
    stringList.add("test4");
    stringList.add("test5");
    stringList.add("test6");
    stringList.add("test7");
    stringList.add("test8");
    stringList.add("test9");
    stringList.add("test10");
    stringList.remove(3); //проверка
    stringList.indexOf("test1"); //проверка

    }
}
