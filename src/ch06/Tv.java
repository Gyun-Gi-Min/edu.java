package ch06;

public class Tv {

    private String brand = null;
    private  int inch = 0;

    //getters, setters

    public  String getBrand(){          //getter는 안적음
        return  this.brand;
    }

    public  void setBrand(String brand){ //setter는 void
        this.brand=brand;
    }

    public  int getInch(){
        return  this.inch;
    }

    public  void setInch(int inch){
        this.inch = inch;
    }
}
