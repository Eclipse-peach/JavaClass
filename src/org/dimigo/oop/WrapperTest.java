package org.dimigo.oop;

import java.util.Arrays;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : 기본 자료형을 객체화시켜주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(13));

        //Boxing : 기본자료형 데이터 -> Wrapper 클래스 객체
        //생성자 이용
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        // valueOf() 이용
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d1 = Double.valueOf(3.14);
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        //Unboxing
        int i = i3.intValue();
        double d = d1.doubleValue();

        // 문자열 -> 기본형 : parseXxx()
        int i5 = Integer.parseInt("200");
        //"3.14" -> double
        double d2 = Double.parseDouble("3.14");

        System.out.println(Arrays.toString(args));

        //100 + 200 = 300

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n", a, b, a + b);

        Integer n1 = new Integer(1000);
        Integer n2 = new Integer(2000);
        System.out.println(n1 + n2);

        Integer obj = 1000; // Autoboxing
        int i6 = obj + 100;  //Autounboxing
        System.out.println(i6);

        // 총 몇번의 autoboxing, autounboxing이 일어나는가?
        Integer n3 = 10; //autoboxing 1
        Integer n4 = n3 + 20;  //autoboxing 1  autounboxing 1
        Integer result = n1 + n2; //autoboxing 1 autounboxing2

    }
}