
package test;

import list.*;

public class App {

    private static class MyClass {

    }

    public static void main(String[] args) {

        List<Integer> intList = new LinkedList<>();

        intList.addLast(1);
        intList.addLast(3);
        intList.addLast(2);


        System.out.println("intList: " + intList);
        

    }

}
