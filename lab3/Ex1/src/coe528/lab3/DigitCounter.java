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
public class DigitCounter extends AbstractCounter {
    //To model digit with no left neighbour
    
    //Constructor for DigitCounter
    DigitCounter()
    {
     super();   
    }
    
    @Override
    public void increment() // add one to the digit
    {
        if(value<9)
        {
            value = value+1;
        }
        
        else
        {
            value=0;
        }
    }
    
    @Override
    public void decrement() //subtract one from the digit
    {
        if(value >0)
        {
            value = value-1;
        }
        else
        {
            value =9;
        }
    }
    
}
