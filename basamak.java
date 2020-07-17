
package javaapp;

import java.util.Scanner;
public class basamak {
    public static void main(String[] args){
    
        Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi=k.nextInt();
        int basamakdegeri,a=1;
        while(sayi>0){
         basamakdegeri=sayi%10;
         if(a!=10 && a<1000000)
             System.out.println(a+"'ler basamği :"+basamakdegeri);
         else 
             System.out.println(a+"'lar basamği :"+basamakdegeri);
         sayi/=10;
         a*=10;
        }
    }
    
}
