
package javaapp;
import java.util.Scanner;

public class isim {
    public static void main(String[] args){
    
        goruntule bilgi =new goruntule();
        bilgi.stringGoruntuleYaz();
        bilgi.intGoruntuleYaz();
    }
    
}
class goruntule{
Scanner sc=new Scanner(System.in);
    public void stringGoruntuleYaz(){
    
        System.out.println("İsim Giriniz :");
        String isim=sc.nextLine();
        System.out.println("Soyisimi Giriniz :");
        String soyisim=sc.nextLine();
        System.out.println("İsimi :"+isim);
        System.out.println("Soyisimi :"+soyisim);
    }
    public void intGoruntuleYaz(){
        System.out.println("Numarayı Giriniz :");
        int no=sc.nextInt();
        System.out.println("Numara :"+no);
    }
}
