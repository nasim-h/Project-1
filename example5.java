/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author Mostafa
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double farenheit ;
       double celsius ;
       
       Scanner input = new Scanner(System.in);
       
        Scanner.out.print("please enter a degree in farenheit");
        farenheit = input.nextDouble();
        
        celsius = (5.0/9)* (farenheit-32);
        
        System.out.println("Dgree in "+ farenheit + " farenheit is equal to " + celsius + " celsius");
        
        
                
        
    }
    
}
