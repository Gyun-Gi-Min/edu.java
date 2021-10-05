package ch06;

/*
    클래스 > 붕어빵 틀
    객체 > 붕어빵

    2가지로 구성
    -   멤버 필드 (변수,상수)
    -   멤버 메소드

 */
public class Car {
    String nm;
    String brand;

    // 생성자
    //1. 클래스명과 같다.
    //2. 리턴 타입이 없어야 한다.
    // * 생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자를 넣어준다.

    //오버로딩 :  똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    //          파라미터만 다르다면 다르게 만들 수 있다. (구분해서 호출 할 수 있다면)
    //          (변수명은 중요X)타입만 중요, 타입의 갯수, 순서, 리턴타입은 상관없음!
    public Car() {}
    public Car(int aaa,String bb){

    }
    public Car(String aaa,int bb){

    }

    public Car(String brand,String nm) { //지역변수, 전역변수
        this.brand=brand; //this 는 나 자신의 주소값 이라는 의미. 여러개 쓰면 달라짐.
        this.nm = nm;  //this를 안해주면 null값 뜬다~
    }

    //void가 들어가면 메소드.
    public void drive(){
        System.out.printf("%s의 %s가 달린다.\n",brand,nm);

    }

    void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n",brand,nm);
    }
}
