package ch04;

public class ContinueTest {
    /*
    1~100까지 숫자중에 continue를 활용 짝수값만 전부 더해주기
    for문 끝나면 전부 더한 값을 출력.
    */
    public static void main(String[] args){
        int sum=0;
        for(int i = 1; i<=100; i++){
            if(i%2==1){
                continue;
            }else{
                sum = sum + i;
            }
        }
        System.out.println("더한 값 : "+sum);
    }
}
