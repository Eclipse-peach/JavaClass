package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Calculator Calc = new Calculator(a,b);
        //Calc.powerOn();
        System.out.printf("%d + %d = %d\n",a,b,Calc.add());
        System.out.printf("%d - %d = %d\n",a,b,Calc.sub());
        System.out.printf("%d * %d = %d\n",a,b,Calc.mul());
        System.out.printf("%d / %d = %.1f\n",a,b,Calc.div());
        Calc.powerOff();
    }
}
