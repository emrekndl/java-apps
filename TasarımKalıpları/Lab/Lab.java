/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author ogrenci
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();
        B b1 = new B();
        B b2 = new C();
        C c1 = new C();
        
        a1.method2(c1);
       
        a2.method2(c1);

        //a1.method2(a1);
    }
    
}
