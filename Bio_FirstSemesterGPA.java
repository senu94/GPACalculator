/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */

public class Bio_FirstSemesterGPA {
    int credit_no = 0;
    private double GPA ;
    final private int GCB = 2;
    final private int GCBP = 1;
    final private int PR = 1;
    final private int PS = 1;
    final private int GPC = 2;
    final private int CC = 1;
    final private int PC = 1;
    final private int EB = 2;
    final private int ES = 3;
    final private int AM = 2;
    final private int CS = 3;
    
    public Bio_FirstSemesterGPA( String iGCB, String iGCBP, String iPR, String iPS, String iGPC, String iCC, String iPC, String iEB, String iES, String iAM, String iCS){
        String[]subjects={iGCB,iGCBP,iPR,iPS,iGPC,iCC,iPC,iEB,iES,iAM,iCS};
        int[]credits={GCB,GCBP,PR,PS,GPC,CC,PC,EB,ES,AM,CS};
        for(int i=0;i<credits.length;i++){
            if(!"--".equals(subjects[i])){
                credit_no+= credits[i];
            }
        }
    /*    if(bPS==true&bCC==true){
            if(!"--".equals(iPS)|!"--".equals(iCC))
            credit_no = GCB + GCBP + PR + PS + GPC + CC + PC + EB + ES + AM + CS;
            else
            JOptionPane.showMessageDialog(null,"Grade value not selected");  
            
        }
        else if(bPS==true&bCC==false){
            if(!"--".equals(iPS))
            credit_no = GCB + GCBP + PR + GPC + PS + PC + EB + ES + AM + CS;
            else
            JOptionPane.showMessageDialog(null,"Grade value not selected");    
        }
        else if(bPS==false&bCC==true){
           if(!"--".equals(iCC)) 
           credit_no = GCB + GCBP + PR + GPC + CC + PC + EB + ES + AM + CS;
           else
           JOptionPane.showMessageDialog(null,"Grade value not selected");
        }
        else{
            if("--".equals(iGCB)|"--".equals(iGCBP)|"--".equals(iPR)|"--".equals(iGPC)|"--".equals(iPC)|"--".equals(iEB)|"--".equals(iES)|"--".equals(iAM)|"--".equals(iCS))   
            JOptionPane.showMessageDialog(null,"Grade value not selected");
            else
            credit_no = GCB + GCBP + PR + GPC + PC + EB + ES + AM + CS;
        }*/
    
    }
    
    
    public double calculateFFGPA(String iGCB, String iGCBP, String iPR, String iPS, String iGPC, String iCC, String iPC, String iEB, String iES, String iAM, String iCS){
    GPACalculation g = new GPACalculation();
    double addition = (GCB*g.calculateGPA(iGCB))+(GCBP*g.calculateGPA(iGCBP))+(PR*g.calculateGPA(iPR))+(PS*g.calculateGPA(iPS))+(GPC*g.calculateGPA(iGPC))+(CC*g.calculateGPA(iCC))+(PC*g.calculateGPA(iPC))+(EB*g.calculateGPA(iEB))+(ES*g.calculateGPA(iES))+(AM*g.calculateGPA(iAM))+(CS*g.calculateGPA(iCS));
    return GPA = addition/credit_no;
    }
    
 
    
    
}