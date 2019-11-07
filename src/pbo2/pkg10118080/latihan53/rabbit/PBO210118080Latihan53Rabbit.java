/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan53.rabbit;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit r = new Rabbit("grey", "Peter", false, "grass", 4);
        System.out.println("Hello, His name is "+r.getName());
        System.out.println(r.getName()+" is Vegetarian? "+r.isVegetarian());
        System.out.println(r.getName()+" eats "+r.getEats());
        System.out.println(r.getName()+" has "+r.getNoOfLegs()+" legs.");
        System.out.println(r.getName()+" color is "+r.getColor());
        
    }
    
}
