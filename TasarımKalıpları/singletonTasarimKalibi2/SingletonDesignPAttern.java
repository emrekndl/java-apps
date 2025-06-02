/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondesignpattern;


public class SingletonDesignPAttern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SMS msg = SMS.getBaglanti();
	 SMS.getBaglanti();
	 SMS.getBaglanti();
        
        msg.gonder("Hello World.", 10);
        System.out.println(msg.bakiye());
        msg.gonder("Hi.", 20);
        System.out.println(msg.bakiye());
        
        
    }
    
}
