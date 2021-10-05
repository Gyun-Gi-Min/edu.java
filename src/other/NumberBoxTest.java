package other;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox bn1 = new NumberBox(1);
        NumberBox bn2 = new NumberBox(2);

        System.out.println(bn1 == bn2);
        System.out.println(bn1.equals(bn2)); //object 메소드. toString
        //String 에서 equals는 오버라이딩 상태라서 비교가능했던것.
        System.out.println(bn1.getVal());
        System.out.println(bn2.getVal());

        System.out.println("bn1 : "+bn1);
        System.out.println(bn1.toString());
        System.out.println("bn2 : "+bn2);
        System.out.println(bn2.toString());

        String str = new String("abc");
        System.out.println(str);

        System.out.println(str.toString());
    }
}
