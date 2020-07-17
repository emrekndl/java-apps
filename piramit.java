
package javaapp;
import java.util.Scanner;

public class piramit {
    
    public static void main(String[] args){
    
        p();
    }
     static void p(){
     
          Scanner sc=new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz :");
        int sayi=sc.nextInt();
        
        int satirsayisi=sayi*2-1;
        int satirdakiyildizsayisi=1;
        int  satirdakibosluksayisi=sayi-satirdakiyildizsayisi;
        while(satirsayisi>0){
        
            while(satirdakiyildizsayisi<=sayi){
            
                  while (satirdakibosluksayisi >= 0){ 
                       System.out.print("");
                  }
            
            System.out.print("*");
            if(satirdakiyildizsayisi<sayi)
                satirdakiyildizsayisi++;
            else
                satirdakiyildizsayisi--;
        }
        System.out.print("\n");
        satirsayisi--;
        satirdakibosluksayisi=sayi-satirdakiyildizsayisi;
        
        }
        
     }
    
}
