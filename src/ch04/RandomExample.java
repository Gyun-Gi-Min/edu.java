package ch04;

public class RandomExample {
    public static void main(String[] args){
        int num= (int)(Math.random()*6); //random() <<< ()가 있으므로 메소드
        //random은 double 타입
        //0.0~0.99999999999999...
        //0.00~5.99999
        //0~5
        System.out.println("num : "+num); //println도 메소드~

        //2~7
        int num2 = (int)((Math.random()*6)+2);
        System.out.println("num2 : "+ num2);

        //55~108  0~53 >>54곱하고 +55더하면?
        int num3 = (int)((Math.random()*54)+55);
        System.out.println("num3 : "+ num3);

    }
}
