package other;

public class MyArrayList {
    private int[] arr;

    public  MyArrayList() {arr = new int[0];}

    public void add(int val){

        int[] temp = new int[arr.length+1];// 칸늘렸고 안늘리면 들어갈자리가 없어.

        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        temp[arr.length]=val;
        arr = temp;
    }

    public int size(){
        return arr.length;
    }


    public void print(){
        System.out.print("[");
        for(int i=0; i<arr.length-1;i++){
            System.out.printf("%d, ",arr[i]);
        //if문으로 i!=0 해서 푸셨음.
        }
        System.out.printf("%d",arr[arr.length-1]);

        System.out.print("]");
    }

}
