package ch07;

public class Dog extends Animal {
    @Override
    public void crying(){
        System.out.println("강아지가 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 와그작와그작 먹는다.");
    }
}
