package ch04;

public class ContinueExample {
    public static void main(String[] args){
        for(int i=0; i<100; i++){

            if(i == 50 || i==55){
                continue; // 밑에있는 함수는 그만.
            }
            System.out.println(i);
        }
    }
}
