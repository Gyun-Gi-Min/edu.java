package other;

public class NumberBox {
    private  int val;

    public  NumberBox(int val){
        this.val = val;
    }

    public  int getVal(){
        return this.val;
    }

    @Override   //이걸 해줌으로써 equals를 재정의해줌.
    public boolean equals(Object obj){
        NumberBox temp = (NumberBox)obj;
        return  temp.val ==this.val;
    }
    @Override
    public String toString(){
        //return this.val + "";
        return  String.valueOf(this.val);   //추천.
        //return  Integer.toString(this.val);
    }




}
