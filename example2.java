/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author Mostafa
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double radius ;
        double area ;
        Scanner input = new Scanner (System.in);
        //1)
        System.out.println("Enter radius : ");
        radius = input.nextDouble();
        //2)
        area = radius * radius * 3.141596 ;
        //3)
        System.out.println("the area of circle with radius "+ radius + "area" + area);
    }
    
}
