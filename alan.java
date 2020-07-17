
package javaapp;
import java.util.Scanner;

public class alan {
public static void main(String[] args){
  
    System.out.println("Dikdörtgen ve Daire Alanı");
    hesapla yeni =new hesapla();
    yeni.deger1();
    yeni.deger2();
    
  }    
}

class hesapla{
Scanner sc = new Scanner(System.in);
    public void deger1(){
        System.out.println("Yariçapı giriniz :");
        double yari=sc.nextDouble();
        double pi=3.14;
        System.out.println("Daire Alan :"+pi*yari*yari);
    }
    public void deger2(){
     System.out.println("Kenarı giriniz :");
      double kenar1=sc.nextDouble();
     System.out.println("Kenarı :"+kenar1);
     System.out.println("Kenarı giriniz :");
     double kenar2=sc.nextDouble();
     System.out.println("Kenarı :"+kenar2);
        System.out.println(" Dikdörtgen Alan :"+kenar1*kenar2);
    }
}

