package ch07;

public class AnimalTest {
    /*
    다형성(여러가지 형태가 있는 성질)

    1. 부모타입은 자식객체 주소값 저장할 수 있다.( 가리킬 수 있다.)
    2. 자식타입은 부모객체 주소값 저장할 수 없다.(가리킬 수 없다.) 바로 컴파일에러 발생
    3. 매소드 호출은 타입이 알고 있는 것만 호출 할 수 있고, 내용은 객체 기준이다.
     */
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new BigCat();
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
        // Animal animal3 = new Animal();

        Object obj = new Object();  // Object 타입은 전~~~부다 참조가능!

        // BigCat bc = new Cat();   자식이 부조참조 못해
        // Cat cat2 = new Animal(); 자식이 부조참조 못해

        Animal cat2 = new BigCat();
        cat2.crying();  //객체 기준으로 실행 됨 BigCat 기준.
        // cat2.sleep(); 그냥 Animal에는 sleep(); 없으니까

        BigCat bigcat1 = (BigCat)cat2; //형변환 해줘야해
        bigcat1.sleep(); //호출된다~


        /*
        래퍼런스 함수 참조할수있는 거 다 있음.
        Integer integer = new Integer(1);
        Float f = new Float(10.1);
         */
    }
}
