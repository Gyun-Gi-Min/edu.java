package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        //배열 (Array)
        /*
        같은 타입의 값을 여러개 저장할 때 좋음.
        for문과 함께 사용하면 멍꿀~~
         */


        int[] scores = {83,90,87,100,50}; // int형 배열
        //scores[5]=11;
        //ArrayIndexOutOfBoundsException 이건 없는 배열을 사용할때 뜬다.
        //배열은 5칸 유지.
        //System.out.println(scores[0]);
        System.out.println(scores.length);
        //길이를 알수있다.

        for(int i=0; i<scores.length; i++){
        System.out.println(scores[i]);
        }



    }
}
