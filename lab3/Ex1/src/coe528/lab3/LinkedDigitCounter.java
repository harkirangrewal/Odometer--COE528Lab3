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
public class LinkedDigitCounter extends AbstractCounter {
    //Class that represents digits
    
    //Store digit to the left of this one
    // To be initialized in the constructor
    private Counter leftNeighbour = null;
   
    //default constructor, needs left neighbour to point to
    LinkedDigitCounter(Counter leftNeighbour)
    {
        super(); //call to parent class constructor
        this.leftNeighbour = leftNeighbour;
    }
    
    @Override
    //Add one to the digit, if 9, make sure leftNeighbour also increments
    public void increment()
    {
        if(value < 9)
        {
            value = value +1;
        }
        
        else
        {
            value =0;
            //increment digit to the left
            leftNeighbour.increment();
        }
    }
    
    @Override
    public void decrement()
    {
        if(value >0)
        {
            value = value -1;
        }
        else
        {
            value =9;
            //decrement digit to the left
            leftNeighbour.decrement();
        }
    }
    
}
