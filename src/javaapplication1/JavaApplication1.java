/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 1691677
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lowerbound =1;
        int upperbound =2010;
        
       int year;
       int count=0;
        
          
                
           for (year=0;year<=2010;year=year+4){
             System.out.println(year+ " is a  leap year.");
        count++;
        
             }      

      
        System.out.println("the count of all leap years is"+count);
      }
    } 

