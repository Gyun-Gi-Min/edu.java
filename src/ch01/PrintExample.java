package ch01;

public class PrintExample {

    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("----------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.println();

        String nm="황장군";
        int age= 17;
        float height = 180.8f;
        char bloodType ='A';

        //2020,8,9 >>20200909

        System.out.printf("%s의 키는 %.2f cm, 나이는 %,09d세, 혈액형은 %c형이다."
                           ,nm,     height,     age,        bloodType);
    }
}
