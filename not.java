
package javaapp;

import java.util.Scanner;
public class not {
    public static void main(String [] args){
        
        Scanner k = new Scanner(System.in);
        
        System.out.println("Notu giriniz :");
        int not=k.nextInt();
        if(not>100 || not<0)
            System.out.println("0-100 Arasında Değer Giriniz!");
        else if(not>=90)
            System.out.println("Öğrenci notu :"+not+" Geçti -> A");
        else if(not>=80)
            System.out.println("Öğrenci notu :"+not+" Geçti -> B");
        else if(not>=70)
            System.out.println("Öğrenci notu :"+not+" Geçti -> C");
        else if(not>=50)
            System.out.println("Öğrenci notu :"+not+" Geçti -> D");
        else 
            System.out.println("Öğrenci notu :"+not+" Kaldı -> F");
        
        
    }
}
