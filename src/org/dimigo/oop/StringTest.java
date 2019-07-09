package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        // 1. 문자열 리터럴 방식
        String dog1 = "설기";
        String dog2 = "설기";
        System.out.println(dog1 == dog2); //T

        //2. new 객체 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2); //F

        System.out.println(dog1 == "설기"); //T
        System.out.println(cat1 == "야옹이"); //F

        // 문자열 비교시 equals()
        System.out.println(dog1.equals(dog2)); //T
        System.out.println(cat1.equals(cat2)); //T

        String id = null;
        //id가 "admin"이면 "관리자" 출력
        //아니면 "일반사용자" 출력

        if(id == null){
            System.out.println("아이디를 입력하세요");
        }
        if("admin".equalsIgnoreCase(id)){
            System.out.println("관리자");
        }else{
            System.out.println("일반사용자");
        }
        testString();
    }
    public static void testString(){
        //01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3)); //defgABCDEFG
        System.out.println(s.substring(3,6)); // def
        System.out.println(s.indexOf("C")); //9    C가 몇번째 배열에 있는가
        System.out.println(s.charAt(7));//A 7번째 배열의 문자
        System.out.println(s.concat("ABC")); //abcdefgABCDEFGABC
        System.out.println("       ABC       ".trim()); //Space 제거
        System.out.println(s.toUpperCase());//대문자 변환
        System.out.println(s.toLowerCase());//소문자 변환
        System.out.println(s.replace('a','A')); //해당 문자를 새 문자로 바꾸어줌
        System.out.println(s.startsWith("abc")); //abc로 시작하는가??
        System.out.println(s.endsWith("EFG")); //EFG로 끝나는가??

    }
}
