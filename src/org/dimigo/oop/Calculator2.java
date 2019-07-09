package org.dimigo.oop;

public class Calculator2 {

        //인스턴스 필드 -> 객체를 생성해야만 이용 가능//
        //인스턴스 필드 -> static이 없음//


        private boolean powerFlag;


        //인스턴스 메소드 -> static이 없음//

    //this는 객체가 있어야해//
    //객체가 없으면 this를 쓸 수 없어//

        public void powerOn() {
            if (!powerFlag) {
                System.out.println("전원을 켭니다.");
                powerFlag = true;
            }
        }
        public  void powerOff() {
            if (powerFlag) {
                System.out.println("전원을 끕니다.");
                powerFlag = false;
            }
        }
        public static int add(int num1, int num2, Calculator2 c){
            c.powerOn();
            return num1+num2;
        }
        public static int sub(int num1, int num2, Calculator2 c){
           c.powerOn();
            return  num1 - num2;
        }
        public static int mul(int num1, int num2, Calculator2 c){
            c.powerOn();
            return num1 * num2;

        }
        public static double div(int num1, int num2, Calculator2 c){
           c.powerOn();
            return (double)num1/num2;
        }
    }

