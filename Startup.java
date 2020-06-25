/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;
import startup.Bio_FirstSemesterGPA;

/**
 *
 * @author DELL
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=8, b=7, c=1;
        a&=3;
        b=b|4;
        c^=3;
        
        System.out.println("a= "+a+"b= "+b+"c= "+c);
        
        System.out.println("a>>2 "+(a>>2));
        System.out.println("b<<1= "+(b<<1));
        
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        
        
        
}
}