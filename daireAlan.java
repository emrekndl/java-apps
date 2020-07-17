
package javaweek4;


public class daireAlan {
    public static void main(String args[]){
    
        daire Daire = new daire(5.0);
        System.out.println("yaricapi"+Daire.getyariCap()+" olan dairenin alanı :"+Daire.getalan());
        daire Daire1 = new daire();
        System.out.println("yaricapi"+Daire1.getyariCap()+" olan dairenin alanı :"+Daire1.getalan());
        
    }
    
    
}
class daire{

    private double yariCap;   //private olduğu için setter getter metodları kullanılır.
    
    public daire(){
    
        yariCap=1.0;
    }
    public daire(double yeniYariCap){
    
        yariCap=yeniYariCap;
    }
    public double getalan(){
    
        return yariCap*yariCap*Math.PI;
    }
     public void setyariCap(int r){
    
       this.yariCap=r;
    }
     public double getyariCap(){
     
           return yariCap;
     }
     
    
}
