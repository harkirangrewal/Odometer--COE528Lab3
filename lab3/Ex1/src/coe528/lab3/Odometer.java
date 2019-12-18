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
public class Odometer implements Counter{
    
    private int numberOfDigits; //stores number of digits
    private Counter digits[]; //array of all LDC and DC
    
    //Constructor
    Odometer(int n)
    {
       try
       {
           this.numberOfDigits = n;
           digits = new Counter[n];
           digits[0] = new DigitCounter();
        //Since the first index of the array is a digitcounter
        // The rest of the indexes must be initialized as LinkedDigitCounters
        for(int i =1; i<n; i++)
        {
           //Create a linked array where objects point to their left neighour
            digits[i] = new LinkedDigitCounter(digits[i-1]);
        }
       }
       
       catch (IllegalArgumentException e)
       {
           System.out.println("Incorrect number of odometer digits");
       }
        
    }
    
    //Output the current value of the counter as a string of digits
    @Override
    public String count()
    {
        String output = "";
        Boolean flag = false; // false until non-zero found
        for(int i=0; i < numberOfDigits; i++)
        {
            if(digits[i].count().equals("0") && flag == false)
            {
                //Supress high order zeroes
                output = output + "-";
            }
            
            else
            {
                flag = true;
                output = output + digits[i].count();
                //add all string values together
            }
        }
        return output;
    }
    
    @Override
    public void increment()
    {
        digits[numberOfDigits-1].increment();
        //increments right-most digit
    }
    
    public void decrement()
    {
        digits[numberOfDigits-1].decrement();
        //decrements right-most digit 
    }
    
    //Reset the counter
    @Override
    public void reset()
    {
        for(int i =0; i<numberOfDigits; i++)
        {
            digits[i].reset();
            //resets all digits of the odometer
        }
    }  
}
