
package javaweek4;
import java.util.Random;

public class dizirandom {
    public static void main(String [] args){
        
    int dizi[][]=dizirand();
        yazdir(dizi);
    }
    public static int [][]dizirand(){
    Random rnd=new Random();
    int dizi[][]=new int[10][10];
    
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            
                dizi[i][j]=rnd.nextInt(51);
                
            }
        }
        return dizi;
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
