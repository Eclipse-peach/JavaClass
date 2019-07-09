package org.dimigo.inheritance;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("버억");
    }

    public void sleep(){
        System.out.println("쿨쿨");
    }

    public void bark(){
        System.out.println("멍멍");
    }

    public String toString(){
        return "제 이름은 " + name + "입니다.";
    }
}
