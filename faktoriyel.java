
package javaapp;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String [] args){
    
        fak();
    }
    
    public static void fak(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int sayi=sc.nextInt();
        int f=1;
        for(int i=sayi;i>0;i--){
        
            f*=i;
        }
        System.out.println("Faktöriyel :"+f);
    }
}
