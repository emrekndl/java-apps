
package javaweek4;

import java.util.Scanner;


public class markovmatrisii {
     public static void main(String [] args){
    double dizi[][]=diziAl();
    System.out.println("");
    System.out.println("Dizi :");
        yazdir(dizi);
        boolean x=markov(dizi);
        System.out.println("Markov matrisi mi :"+x);//matrisin elemanları pozitif ve satirdaki elamanların toplamı 1 e eşitse
    }
    public static double[][] diziAl(){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("satir sayisini giriniz :");
        int satir=sc.nextInt();
        System.out.println("sutun sayisini giriniz :");
        int sutun=sc.nextInt();
        double [][] dizi = new double[satir][sutun];
        System.out.println("elemalari giriniz :");
        
        
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
            
                dizi[i][j]=sc.nextDouble();
                
            }
        }
     return dizi;
    }
    public static boolean markov(double dizi[][]){
    double toplam=0.0;
    boolean pozitifmi=false;
         for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
            
                toplam+=dizi[j][i];
                if(toplam==1.0)
                    pozitifmi=true;
                
            }
        }
         return pozitifmi;
    }
    
    public static void yazdir(double dizi[][]){
        
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
            
                System.out.print(dizi[i][j]+" ");
                
            }
            System.out.println("\n");
        }
    
    }
    
}
