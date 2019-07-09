package org.dimigo.inheritance;

public class Teacher extends Person {
    private String subject;

    public void teach(){
        System.out.println(getName() + "샘이 공부를 가르칩니다.");
    }

    public void overSee(){
        System.out.println(getName() + "샘이 감독을 합니다.");
    }

    public Teacher(String name, int age, int height, int weight, String subject){
        super(name, age, height, weight);
        this.subject=subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
              super.toString();
    }
}
