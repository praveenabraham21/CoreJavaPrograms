package dataTypes;

public class primtiveDataType {
    public static void main(String[] args) {

        /*Boolean data type represents only bit of information either true or false.
         * It is intended to represent the truth values of logic and boolean algebra
         * Size of the boolean data type is virtual machine-dependent.
         * Value of boolean cannot be converted implicitly or explicitly to any other data type using casts.
         * Programmer can easily write conversion code.*/

        boolean a = true;
        boolean b = false;
        boolean c = Boolean.parseBoolean("true");
        boolean d = Boolean.parseBoolean("false");
        boolean e = Boolean.parseBoolean("null");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
