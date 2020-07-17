
package javaweek4;

import java.util.Scanner;



public class cokboyutludizi {
    public static void main(String [] args){
    int dizi[][]=diziAl();
        yazdir(dizi);
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
    public static void yazdir(int dizi[][]){
        
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
            
                System.out.print(dizi[i][j]+" ");
                
            }
            System.out.println("\n");
        }
    
    }
    
}
