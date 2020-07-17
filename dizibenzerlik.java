
package javaweek4;

import java.util.Random;


public class dizibenzerlik {
     public static void main(String [] args){
        
    int dizi1[][]=dizirand();
    int dizi2[][]=dizirand();
        System.out.println("Dizi1 :");
        yazdir(dizi1);
        System.out.println("\n");
        System.out.println("Dizi2 :");
        yazdir(dizi2);
        int benzer=benzerlik(dizi1,dizi2);
         System.out.println("");
        System.out.println("benzerlik sayisi :"+benzer);
    }
    public static int [][]dizirand(){
    Random rnd=new Random();
    int dizi[][]=new int[10][10];
    
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            
                dizi[i][j]=rnd.nextInt(6)+1;
                
            }
        }
        return dizi;
    }
    public static int  benzerlik(int dizi1[][],int dizi2[][]){
     
        int benzer=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            
                if(dizi1[i][j]==dizi2[i][j])
                benzer++;
            }
        }
        return benzer;
    }
    
    public static void yazdir(int dizi[][]){
    
         for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            
                System.out.print(dizi[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
}
