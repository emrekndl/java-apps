
package javaapp;

import java.util.Scanner;
public class ucgensayi {
    public static void main(String[] args){
    
        ucgen();
    }
    static void ucgen(){
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz :");
        int sayi=sc.nextInt();

        for(int i=1;i<=sayi;i++){
        
            for(int j=i;j>0;j--){
            
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
}
