/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

/**
 *
 * @author DELL
 */
public class GPACalculation {
    
    final private double Amaj = 4.30;
    final private double A = 4.00;
    final private double Amin = 3.70;
    final private double Bmaj = 3.30;
    final private double B = 3.00;
    final private double Bmin = 2.70;
    final private double Cmaj = 2.30;
    final private double C = 2.00;
    final private double Cmin = 1.70;
    final private double Dmaj = 1.30;
    final private double D = 1.00;
    final private double Dmin = 0.70;
    final private double F = 0.00;
    
    
    public double calculateGPA(String grade){
        
        if(grade=="A+"){
            return Amaj;
        }
        else if(grade=="A"){
            return A;
        }
        else if(grade=="A-"){
            return Amin;
        }
        else if(grade=="B+"){
            return Bmaj;    
        }
        else if(grade=="B"){
            return B;
        }
        else if(grade=="B-"){
            return Bmin;
        }
        else if(grade=="C+"){
            return Cmaj;
        }
        else if(grade=="C"){
            return C;
        }
        else if(grade=="C-"){
            return Cmin;
        }
        else if(grade=="D+"){
            return Dmaj;
        }
        else if(grade=="D"){
            return D;
        }
        else if(grade=="D-"){
            return Dmin;
        }
        else 
            return F;
     }
}
