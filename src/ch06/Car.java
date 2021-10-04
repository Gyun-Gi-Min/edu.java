package ch06;

/*
    2가지로 구성
    -   멤버필드 (변수,상수)
    -   메소드

 */
public class Car {
    String nm;
    String brand;

    // 생성자
    //1. 클래스명과 같다.
    //2. 리턴 타입이 없어야 한다.
    // * 생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다. (생성자 여러개 가능.)

    //오버로딩 :  똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    //          파라미터만 다르다면 다르게 만들 수 있다.
    //          타입만 중요, 타입의 갯수, 순서, 리턴타입은 상관없음!
    Car() {}
    Car(int aaa,String bb){

    }
    Car(String aaa,int bb){

    }

    Car(String brand,String nm) { //지역변수, 전역변수
        this.brand=brand; //this 는 나 자신의 주소값 이라는 의미. 여러개 쓰면 달라짐.
        this.nm = nm;  //this를 안해주면 null값 뜬다~
    }


    void drive(){
        System.out.printf("%s의 %s가 달린다.\n",brand,nm);

    }

    void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n",brand,nm);
    }
}
