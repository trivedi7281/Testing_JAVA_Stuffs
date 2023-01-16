package org.example;

public class StringLiteralvsStringObject {

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str3 = "ABCD";
        String str2 = new String("A B C D ");
        String str4 = new String("ABCD");
        System.out.println(str1 == str3);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2 == str4);
        System.out.println(str2.equals(str4));

    }

}
