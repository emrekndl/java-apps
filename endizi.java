/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek4;

import java.lang.reflect.Array;
import java.util.Scanner;


public class endizi {
     public static void main(String [] args){
    int dizi[][]=diziAl();
        System.out.println("");
        yazdir(dizi);
        System.out.println("");
        enbuyuk(dizi);
    }
    public static int[][] diziAl(){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("satir sayisini giriniz :");
        int satir=sc.nextInt();
        System.out.println("sutun sayisini giriniz :");
        int sutun=sc.nextInt();
        int [][] dizi = new int[satir][sutun];
        System.out.println("elemalari giriniz :");
        
        
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
            
                dizi[i][j]=sc.nextInt();
                
            }
        }
     return dizi;
    }
    
    public static void enbuyuk(int dizi[][]){
    int buyuk=0;
    int kucuk=0;
    int satir=0;
    int enkucuk=0;
        for(int i=0;i<dizi.length;i++){
        
            for(int j=0;j<dizi[0].length;j++){
            
                if(dizi[i][j]>buyuk){
                buyuk=dizi[i][j];
                   satir=i;
                }
            }
        }
        enkucuk=dizi[satir][0];
        for(int j=0;j<dizi[0].length;j++){
            
                if(dizi[satir][j]<buyuk){
                kucuk=dizi[satir][j];
                   
                }
            }
        
        System.out.println("Dizideki en buyuk eleman :"+buyuk
                +" En buyuk elemanın bulunduğu satirdaki en kucuk eleman :"+kucuk);
        
        
        
        
    }
    public static void yazdir(int dizi[][]){
        
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
            
                System.out.print(dizi[i][j]+" ");
                
            }
            System.out.println("");
        }
    
    }
    
    
}
