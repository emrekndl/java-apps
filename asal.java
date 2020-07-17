
package javaapp;

import java.util.Scanner;
public class asal {
    public static void main(String [] args){
       boolean b=durum();
        if(b)    
        System.out.println("Asal");
        else
         System.out.println("Asal Değil");
            
    }
    static boolean durum(int sayi){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayi gir :");
         sayi=sc.nextInt();
        int flag;
        for(int i=2;i<sayi;i++){
             flag=0;
        for(int j=1;j<i;j++){
       
            if(i%j==0){
                flag++;
            break;
            }
        }
       
        if(flag==0)
            return true;
        else 
            return false;
    }
       
    }
    
   }

