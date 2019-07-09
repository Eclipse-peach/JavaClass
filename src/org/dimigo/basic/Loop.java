package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //1. for문
        //구구단 출력
        int i, j;
        for (i = 2; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%d\t  ", i, j, i * j);
            }
            System.out.println();
        }

        //2. for-each
        int[] arr = {1, 2, 3, 4, 5};
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int value : arr) {
            System.out.println(value);
        }

        String[] rv = {"조이", "아이린", "슬기", "웬디", "예리"};
        for (String value : rv) {
            System.out.println(value);
        }

        //3. while, do~while
        //메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. BTS");
            System.out.println("2. 레드벨벳");
            System.out.println("3. 여자친구");
            System.out.println("9. 종료");
            System.out.printf("메뉴 입력 =>");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("BTS를 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("레드벨벳을 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("여자친구를 선택하셨습니다.");
                    break;
                case 9:
                    System.out.println("종료합니다");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 선택지입니다");
                    continue;
            }
        } while (menu != 9);
    }
}