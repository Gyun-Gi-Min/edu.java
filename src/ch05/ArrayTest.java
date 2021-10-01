package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100,87,56,23,28,98,30,32,17,18};


        //점수가 짝수인 친구들만 점수 print
        //점수가 홀수인 친구들의 합계점수 print

        int sum = 0;

        for(int i=0; i<scores.length; i++){
            int val = scores[i];
            if(val % 2==0){
                System.out.println("짝수:"+val);
            }else{
                sum = sum+val;
            }
        }
        System.out.println("홀수 합:"+sum);


    }
}
