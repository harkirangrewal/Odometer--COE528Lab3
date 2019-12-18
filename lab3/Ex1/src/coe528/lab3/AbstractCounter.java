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
public abstract class AbstractCounter implements Counter {
    
     protected int value;
     
     //default constructor
     AbstractCounter()
     {
        this.value =0; 
     }
     
     @Override
     public void reset()
     {
         value =0;
     }
   
     @Override
     public String count()
     {
         return String.valueOf(value);
         
     }
     
     public String querycount()
     {
         return count();
     }
}
    
    /*public String count()
    {
        return ""+ value;
     }
     
     public void increment()
     {
         if(value< 9)
         {
             value = value +1;
         }
         
         else
         {
             value = 9;
             //increment digit to the left
         }
     }
     
     public void decrement()
     {
         if (value >0)
         {
             value = value -1;
         }
         
         else
         {
             value =9;
             //decrement digit to the left
         }
     }
     
     public void reset()
     {
         value =0;
     }
    
    */
  