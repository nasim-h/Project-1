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
        Scanner input = new Scanner (system.in);
        long totalMiliseconds ;
        long hours , minutes , seconds , miliseconds ;
        long currentHour , currenMinute , currentSecond ;
        
        totalMiliseconds = System.currentTimeMillis();
        
        miliseconds = totalMiliseconds % 1000 ;
        seconds = totalMiliseconds / 1000 ;
        
        minutes = seconds / 60 ;
        seconds = seconds % 60 ;
        
        hours = minutes / 60 ;
        minutes = minutes% 60 ;
        
        System.out.print(hours+":"+minutes +":" + seconds + ":");
        System.out.println(miliseconds + "ms (h:m:s) past from UNIX epoch!\n");
        
        currentSecond = seconds % 60 ;
        currentMinute = minutes % 60 ;
        currentHour = hours % 24 ;
        
        System.out.println("GMT Now " + currentHour + ":" + currentMinute + ":" + currentSecond + "\n");
        
                
        
    }
    
}
