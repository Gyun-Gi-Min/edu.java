package ch07;

public class AnimalTest2 {
    public static void main(String[] args){
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        //객체화 안했다? >> static 메서드


        AnimalTest2.animalCrying(bc); //큰 고양이 냐~~ㅇ농
        AnimalTest2.animalCrying(cat); //고양이 야옹야옹
        AnimalTest2.animalCrying(dog); // 강아지가 멍멍
        AnimalTest2.animalCrying(cow); //소가 음머
    }



    public static void animalCrying(Animal ani){ani.crying();}
    // 부모클래스를 가져다가 쓰면 한줄로 위에 4줄이 구현된다.
    // 부모타입은 자식객체 주소값 저장할수있으므로.

}



