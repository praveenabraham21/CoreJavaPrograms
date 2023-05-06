package wrapperClass;

import java.util.ArrayList;

public class Autoboxing {

    public static void main(String[] args) {
        char ch = 'P';
        System.out.println(ch);
        //Auto-boxing of primitive character type to object.
        Character c = ch;
        System.out.println(c);

        ArrayList<Integer> arrayList = new ArrayList<>();
        //Auto-boxing of integer data type to object.
        arrayList.add(25);

        System.out.println(arrayList.get(0));

    }
}
