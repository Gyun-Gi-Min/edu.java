package ch05;

import java.util.Locale;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1); //0x11
        //changeVal(s1);
        //호출되면 소멸,,,,,
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s1);
    }

    public static void changeVal(String str){ str = "안녕"; } //0x33
    //str = new String("안녕")이랑 같은 말임. 그래서 주소값을 바꾼거라고 본다.

}
