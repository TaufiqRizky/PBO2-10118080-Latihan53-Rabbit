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
public class Rabbit extends Animal {
    private String color,name;

    public Rabbit(String color, String name, boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
