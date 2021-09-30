package ch04;

public class IfTest {
    public static void main(String[] args){
        int score = 84;

        //점수가 90점이상이면 A
        //점수가 80점이상이면 B
        //점수가 70점이상이면 C
        //70점 미만이면 D

        //C등급 이상으로는
        // ?7점 이상이면+
        // ?3점 이하이면-

        //98점이면 A+ 85점이면 B 73점이면 C-

        //쌤은 if안에 if문으로 함.

        if(score >=97){
            System.out.println("A+");
        }else if(score>93){
            System.out.println("A");
        }else if(score>=90){
            System.out.println("A-");
        }else if(score>=87){
            System.out.println("B+");
        }else if(score>83){
            System.out.println("B");
        }else if(score>=80){
            System.out.println("B-");
        }else if(score>=77){
            System.out.println("C+");
        }else if(score>73){
            System.out.println("C");
        }else if(score>=70){
            System.out.println("C-");
        }else{
            System.out.println("D");
        }


    }
}
