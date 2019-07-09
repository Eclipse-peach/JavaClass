package org.dimigo.basic;

public class PrimitiveDataType {
    static boolean flag;
    public static void main(String[] args) {
        //1. 논리형 boolean // default = false
        // 삼항연산자
        //  System.out.println(flag ? "참입니다!" : "거짓입니다!");

        //2. 문자형
        /*
        char c1 = 'A'; //알파벳
        char c2 = 65; //아스키코드
        char c3 = '\ua9c4'; //유니코드
        String name = "이우신"; //문자열
        System.out.println("하... 또 "+ name);
        */

       //3. 정수형
        /*
        // 2진수 0b(0000)  8진수 0 16진수 0x
        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;
        System.out.printf("%d, %d, %d, %d\n", i1, i2, i3, i4);
        // byte타입 ( -128 ~ 127)
        byte b1 = -128; // b1--  == 127
        byte b2 = 127; // b2++ == -128
        System.out.println(b1);
        System.out.println(b2);
        // 증감연산자

        //정수의 범위
        System.out.println(Integer.MIN_VALUE  + "~" +Integer.MAX_VALUE);
        long l1 = 10000000000l; //long은 숫자 뒤에 l 붙이기
        System.out.println("long " + l1);
        */

        //4.실수형

        float f1 = 3.14f; //float는 뒤에 f 붙이기
        double d1 = 3.14;

        //소수점 자리 많을때 double은 float 2배 자릿수 가능

        float f2 = 0.12345678901234567890f;
        double d2 = 0.12345678901234567890;
        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c, %d, %.2f, %s\n", 'A', 100, 12.34, "즐거운 자바");
    }
}
