package ch07;
//부모클래스
public class CellPhone {
    String model;
    String color;

    public  CellPhone() {
        //외부에서 값을 지정받지 않으면 기본생성자.
        this("노트10","white");
    }


    public  CellPhone(String model, String color){
        this.model= model;
        this.color =color;
    }


    void powerOn(){
        System.out.println("전원을 켭니다");
    }

    void powerOff(){
        System.out.println("전원을 끕니다");
    }

    void printInfo(){
        System.out.printf("model : %s, color : %s, ",model,color);
    }

    void sendMsg(String msg){
        System.out.println("보낸 메시지 : "+msg);
    }
}
//final 키워드(300p) >> 얼린다?라는 느낌
//
//클래스 >>상속x
//멤버 필드 >>상수
//메소드 >> 오버라이딩 X