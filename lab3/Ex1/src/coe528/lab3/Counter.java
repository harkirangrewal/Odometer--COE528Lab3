/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 *
 * @author h36grewa
 */
public interface Counter {
    
    //The current value of this Counter as a String of digits
    String count();
    
    //Increment this Counter
    void increment();
    
    //Decrement this Counter
    void decrement();
    
    //Reset this Counter
    void reset();
    
    
    
}
