package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //byte, shor, long, int, float, double, char, boolean
        
        //int arr3[] = {1,2,3}; // C언어 스타일
        int[] arr1={10,20,30};
        int[] arr2 = arr1; //얕은 복사( shallow copy) 주소값만 복사

        System.out.println("arr1[0] : "+ arr1[0]);
        System.out.println("arr2[0] : "+ arr2[0]);

        arr2[0]=7;  //arr1[0]=7을 해줘도 똑같아.
        //래퍼런스값들의 비교는 주소값이 같냐? 라는걸 물어보는것.
        System.out.println("arr1[0] : "+ arr1[0]);
        System.out.println("arr2[0] : "+ arr2[0]);

        System.out.println(arr1==arr2);
    }
}
