package ch06;

public class StaticCalc {
    //static 메모리에 스스로 올라간다.(클래스 메모리 영역)
    //static은 미리 메모리에 올라가있다.
    //static은 객체화(인스턴스)가 필요 없음

    public static int sum(int n1, int n2){
        return  n1+n2;
        
        //static 메소드 장려
        //2. 파라미터 값만 사용할 때()
        //3. 멤버필드를 사용하는데 그 멤버필요가 static인 경우
    }
}
