package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //1. String으로 문자열 생성
        String s = "디미고 ";
        s += "2학년 ";
        s += "3반 ";
        s += "윤효연";

        //2. StringBuilder로 문자열 생성
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("3반 ").append("윤효연");

        System.out.println(sb);
        System.out.println(sb.toString());

        //속도 비교
        compareSpeed();
    }
    private static void compareSpeed(){
        //String, StringBuffer, StringBuilder
        long start = System.currentTimeMillis();
        String str = "abc";
        StringBuffer sb=new StringBuffer(str);
        StringBuilder sb2 =new StringBuilder(str);
        for(int i=0; i<100000; i++){
           // str += "def";
            sb.append("def");
        }
        //반복문
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
