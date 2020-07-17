

package javaweek;


public class Triangle extends geometrikNesne {
    private double kenar1=1.0,kenar2=1.0,kenar3=1.0;
    
    public Triangle(){
    
        
    }
    public Triangle(double kenar1,double kenar2,double kenar3){
    
        this.kenar1=kenar1;
        this.kenar2=kenar2;
        this.kenar3=kenar3;
    }
    public Triangle(double kenar1,double kenar2,double kenar3,String color,boolean filled){
    
        this.kenar1=kenar1;
        this.kenar2=kenar2;
        this.kenar3=kenar3;
        setColor(color);
        setFilled(filled);
    }
    

    public double getKenar1() {
        return kenar1;
    }

    public void setKenar1(double kenar1) {
        this.kenar1 = kenar1;
    }

    public double getKenar2() {
        return kenar2;
    }

    public void setKenar2(double kenar2) {
        this.kenar2 = kenar2;
    }

    public double getKenar3() {
        return kenar3;
    }

    public void setKenar3(double kenar3) {
        this.kenar3 = kenar3;
    }
    
    public double getArea(){
    
        double s=(kenar1+kenar2+kenar3)/2;
        return Math.sqrt(s+((kenar1-s)+(kenar2-s)+(kenar3-s)));
    }
    
    
    
    
}
