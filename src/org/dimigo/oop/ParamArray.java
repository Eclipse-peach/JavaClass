package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);

        String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(strArr, "김");
        printArray(strArr);
    }

    public static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.printf(value + " | ");
        }
        System.out.println();
    }

    public static void printArray(String[] strArr) {
        for (String value : strArr) {
            System.out.printf(value + " | ");
        }
        System.out.println();
    }

    public static void add(int[] intArr, int sum) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] += sum;
        }
    }

    public static void changeName(String[] strArr, String familyName) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = familyName + strArr[i].substring(1);

        }
    }

}