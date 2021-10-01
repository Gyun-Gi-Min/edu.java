package ch05;

public class MethodExample {
    public static void main(String[] args) {
        sum(10,20);    //arguments만 적어야함. 10,20 같은걸 arguments라고 함.
        sum(50,120);  //값만 보내야해
        minus(100,20);
    }



    public static void  minus(int n1, int n2){
        System.out.println("minus : "+ (n1-n2));
    }


    public static void sum(int n1, int n2) {
        System.out.println("sum : "+ (n1+n2));
    }


}
