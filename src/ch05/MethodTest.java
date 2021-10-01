package ch05;

public class MethodTest {
    public static void main(String[] args) {

        //printMySelf("황장군", 17, 180.2f, 'A');

        int mon = (int)(Math.random()*12)+1; // 1~12

        printSeason(mon);
        //12,1,2 > "겨울"
        //3 4 5    "봄"
        //6 7 8    여름
        //9 10 11  가을
    }
    public static void  printSeason(int mon){

        if(mon<3 ||mon==12){
            System.out.println("겨울");
        }
        else if(mon <6){
            System.out.println("봄");
        }else if(mon <9){
            System.out.println("여름");
        }
        else if(mon<12){
            System.out.println("가을");
        }else{
            System.out.println("몰라");

        }
        System.out.println("몇월? "+mon+"월");
    }



    public static void printMySelf(String name,int age,float height,char bloodtype){
            System.out.printf("%s의 키는 %.2fcm, 나이는 %d세,혈액형은 %c형 이다",name,height,age,bloodtype);
        }

        //
        //황장군의 키는 180.80 cm, 나이는 17세, 혈액형은 A형이다.



}
