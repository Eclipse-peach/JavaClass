package org.dimigo.oop;

public class multiarray {
    public static void main(String[] args) {
        // int 타입 이차원 배열
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][1] = 100;
        intArr[1][2] = 90;
        printArray(intArr);

        // String 타입 이차원 배열
        String[][] strArr = new String[2][3];
        printArray(strArr);

        strArr[0][1] = "100";
        strArr[1][2] = "90";
        printArray(strArr);
    }

    private static void printArray(int[][] intArr) {
//        for(int i=0; i<intArr.length; i++){
//            for(int j=0; j<intArr[i].length; j++){
//                System.out.println(intArr[i][j] + " | ");
//            }
//            System.out.println();
//        }
//    }
        for (int[] arr : intArr) {
            for (int value : arr) {
                System.out.printf(value + " | ");
            }
            System.out.println();
        }
    }

    private static void printArray(String[][] strArr) {
//        for(int i=0; i<intArr.length; i++){
//            for(int j=0; j<intArr[i].length; j++){
//                System.out.println(intArr[i][j] + " | ");
//            }
//            System.out.println();
//        }
//    }
        for (String[] arr : strArr) {
            for (String value : arr) {
                System.out.printf(value + " | ");
            }
            System.out.println();
        }
    }
}
