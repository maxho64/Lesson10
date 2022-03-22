package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer("Test");
        System.out.println("String builder " + stringBuilder);
        System.out.println("String builder char at "
                + stringBuilder.charAt(0));
        stringBuilder.setCharAt(0, 'D');
        System.out.println("String builder " + stringBuilder);
        stringBuilder.setCharAt(0, 'T');
        System.out.println("String builder " + stringBuilder);
        stringBuilder.setLength(2);
        System.out.println("String builder " + stringBuilder);
        stringBuilder.append("st");
        System.out.println("String builder " + stringBuilder);
        stringBuilder.insert(3, "zcfdf");
        System.out.println("String builder " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("String builder " + stringBuilder);
        stringBuilder.reverse();
        stringBuilder.delete(3, 7);
        System.out.println("String builder " + stringBuilder);
        stringBuilder.deleteCharAt(3);
        System.out.println("String builder " + stringBuilder);
    }

    public static void methods() {
        String str1 = "Hello, World!";
        String str2 = "World";
        String str3 = "WORLD";

        System.out.println("String region matches " + str1.regionMatches(str1.indexOf('W'), str2, 0, str2.length()));
        System.out.println("Sting contains is " + "What is this".contains("this"));
        System.out.println("Sting starts is " + "What is this".startsWith("What"));
        System.out.println("Sting contains is " + "What is this".endsWith("this"));

    }

    public static void equalsMethods() {
        String string1 = "test";
        String string2 = "test";
        System.out.println("String equals is "
                + string1.equals(string2));
        System.out.println("String == is " + (string1 == string2));
        string1 = new String("test");
        string2 = new String("test");
        System.out.println("String equals is " + string1.equals(string2));
        System.out.println("String == is " + (string1 == string2));
        System.out.println("String equals ignore case " + "test".equalsIgnoreCase("Test"));
        System.out.println("String compare is " + "test".compareTo("Test"));
        System.out.println("String compare is " + "test".compareTo("test"));
        System.out.println("String compare is " + "Test".compareTo("test"));

    }

    public static void stringMethods() {
        String string = "Test";
        System.out.println("String length " + string.length());
        System.out.println("String concat " + string.concat(" 2"));
        System.out.println("String join " + String.join("-", "This", "is", "a", "String"));
        System.out.println("String char at " + string.charAt(0));
        System.out.println("String to char array " + Arrays.toString(string.toCharArray()));
        System.out.println("String value of bool " + String.valueOf(true));
        System.out.println("String index of " + string.indexOf('t'));
        System.out.println("String last index of " + string.lastIndexOf('t'));
        System.out.println("String replace " + string.replace("test", "mmmm"));
        System.out.println("String trim" + " test    ".trim());
        System.out.println("String to lower case " + string.toLowerCase());
        System.out.println("String to upper case " + string.toUpperCase());
        System.out.println("String split " + Arrays.toString("1,2,3".split(",")));
        System.out.println("String '' is empty? " + " ".trim().isEmpty());
        System.out.println("String 'Test' is empty? " + string.isEmpty());
        System.out.println("String ' ' is blank? (java 11) " + " ".isBlank());
        System.out.println("String 'Test' is blank? (java 11) " + string.isBlank());
        System.out.println("Sting substring " + "What is this?".substring(0, 4));

    }

    public static void stringConstructor() {
        String string = new String("Test");
        byte[] bytesString = {84, 101, 115, 116};
        System.out.println("Byte array without charset " +
                new String(bytesString));
        System.out.println("Byte array with charset " +
                new String(bytesString, StandardCharsets.ISO_8859_1));
        System.out.println("Byte array without charset length " +
                new String(bytesString, 1, 2));
        char[] chars = {'T', 'e', 's', 't'};
        System.out.println("Char array " +
                new String(chars, 1, 2));
        int[] unicodeArray = {84, 101, 115, 116};
        System.out.println("Unicode " +
                new String(unicodeArray, 0, unicodeArray.length));

    }
}
