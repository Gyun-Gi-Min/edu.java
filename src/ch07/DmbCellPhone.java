package ch07;

public class DmbCellPhone extends CellPhone {
    int channel;
    /*
    public DmbCellPhone() {}
    public DmbCellPhone(int channel) {
        this.channel = channel;
    }
     */

    public DmbCellPhone(String model,String color,int channel) {
        //super(); // 이 경우가 아닌경우 > 부모가 기본생성자가 없을 때

        this.model=model;
        this.color=color;
        this.channel = channel;

    /*
            ★setter 메소드 이용해서 객체에 값을 넣었음
            ★생성자를 이용해서 객체에 값을 넣었음.

            ★★객체에 은닉화된 멤버필드에 값을 넣을 수 있는 방법은 딱 2가지! >> setter메소드, 생성자

            ★★객체에 은닉화된 멤버필드에 값을 빼내는 방법은 딱 1가지! >> getter 메소드
         */

    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf("channel : %d\n",channel);

        //★오버로딩 vs 오버라이딩
        //
        // 오버라이딩 : 메소드 재정의.
        //	     부모에 정의된 메소드를 그대로 사용하지 않고, 새롭게 정의하는 것.
    }
}
