package test;

import javax.naming.LinkException;

import list.*;

public class AppString {

    public static void main(String[] args) {

        LinkedListString strList = new LinkedListString();
        strList.add("A");
        strList.add("B");

        LinkedList<String> list = new LinkedList<>();
        list.addLast("a");
        list.addLast("b");

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.addLast(2);

    }

}
