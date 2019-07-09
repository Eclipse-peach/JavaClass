package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 배열
        // int, float, double, byte, boolean, short, char, long
        int[] intArr = null;
        intArr = new int[5];
        printArray(intArr);

        double[] dArr = new double[5];
        printArray(dArr);

        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[]{1, 2, 3, 4, 5};
        printArray(intArr2);


        // 참조형 배열
        // String, Book, Car, StringBuilder, Scanner, Random
        String[] strArr = new String[3];
        Book book = null;
        Car car = null;
        printArray(strArr);
        String[] strArr2 = {"정진영", "기안 84", "김찬형"};
        printArray(strArr2);

        // Book 타입 2개짜리 배열
        // Book 객체 생성 후 출력
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("미생", "윤태호", 100);
        bookArr[1] = new Book("김찬형의 축구백과", "김찬형", 250);
        printArray(bookArr);

        Book[] bookArr2 = {
                new Book("미생", "윤태호", 100), new Book("김찬형의 축구백과", "김찬형", 250)
        };

        //배열 사용 시 주의사항
        //null로 초기화되는것 주의하세요!
        int[] intArr4 = null;
        //  System.out.println(intArr4.length); null pointer exception
        intArr4 = new int[3];
        System.out.println(intArr4.length); // 3
        System.out.println(intArr4[intArr4.length - 1]); //out of bound

        String[] strArr3 = new String[3];
        // System.out.println(strArr3[0].length());  null pointer exception

        Book[] bookArr3 = new Book[3];
        // System.out.println(bookArr3[0].getTitle()); null pointer exception

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

    public static void printArray(double[] dArr) {
        for (double value : dArr) {
            System.out.printf(value + " | ");
        }
        System.out.println();
    }

    public static void printArray(Book[] bookArr) {
        for (Book value : bookArr) {
            //System.out.println("책제목:" + value.getTitle() + ", 저자명:" + value.getAuthor() + ", 페이지수:" + value.getPage());
            System.out.println(value);
        }
        System.out.println();
    }
}
