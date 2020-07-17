
package javaapp;

import java.util.Scanner;
public class carpimTablosu {
    public static void main(String[] args){
    
        Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi=k.nextInt();
         System.out.println("\n");
        for(int i=1;i<=sayi;i++){
        
            for(int j=1;j<=sayi;j++){
            
                System.out.print(" "+i*j+" ");
            }
            System.out.println("\n");
        }
    }
}
