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
public class BioII_SecondSemester {
     int credit_no = 0;
    private double GPA = 0;
    final private int PCP = 2;
    final private int PCPP = 1;
    final private int PD = 1;
    final private int IAC = 2;
    final private int IBC = 2;
    final private int GSO = 1;
    final private int PE = 3;
    final private int BS = 1;
    final private int NT = 1;
    final private int SE = 3;
    
    public BioII_SecondSemester(String iPCP, String iPCPP, String iPD, String iIAC, String iIBC, String iGSO, String iPE, String iBS, String iNT,String iSE){
        String[]subjects={iPCP,iPCPP,iPD,iIAC,iIBC,iGSO,iPE,iBS,iNT,iSE};
        int[]credits={PCP,PCPP,PD,IAC,IBC,GSO,PE,BS,NT,SE};
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
    
    
    public double calculateSSGPA(String iPCP, String iPCPP, String iPD, String iIAC, String iIBC, String iGSO, String iPE, String iBS, String iNT,String iSE){
    GPACalculation g = new GPACalculation();
    double addition = (PCP*g.calculateGPA(iPCP))+(PCPP*g.calculateGPA(iPCPP))+(PD*g.calculateGPA(iPD))+(IAC*g.calculateGPA(iIAC))+(IBC*g.calculateGPA(iIBC))+(GSO*g.calculateGPA(iGSO))+(PE*g.calculateGPA(iPE))+(BS*g.calculateGPA(iBS)+(NT*g.calculateGPA(iNT))+(SE*g.calculateGPA(iSE)));
    return GPA = addition/credit_no;
    }
   
}
