
package javaweek;


public class geometrikNesne {
    private String color ="white";
    private boolean filled=false;
    private java.util.Date dateCreated;
    public geometrikNesne(){
    
        
    }
     public geometrikNesne(String color,boolean filled){
    
        this.color=color;
        this.filled=filled;
        this.dateCreated=new java.util.Date();
    }
     public String getColor(){
     
         return color;
     }
     public void setColor(String color){
     
          this.color=color;
     }
     public boolean isFilled(){
     
         return filled;
     }
     public void setFilled(boolean filled){
     
          this.filled=filled;
     }
     public java.util.Date getDateCreated(){
     
         return dateCreated;
     }
     public String toString(){
     
         return "Renk :"+color+"\nDoluluk :"+filled+"|nTarih :"+dateCreated;
     }
     
    
}
