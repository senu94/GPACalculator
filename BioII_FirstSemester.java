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
public class BioII_FirstSemester {
     int credit_no = 0;
    private double GPA = 0;
    final private int MB = 1;
    final private int MBRD = 1;
    final private int BS = 2;
    final private int MMBP = 1;
    final private int PCII = 2;
    final private int ICP = 3;
    final private int AF = 3;
    final private int EM = 3;
    final private int NS = 3;
    final private int IT = 3;
    
    
    public BioII_FirstSemester(String iMB, String iMBRD, String iBS, String iMMBP, String iPCII, String iICP, String iAF, String iEM,String iNS,String iIT){
        String[]subjects={iMB,iMBRD,iBS,iMMBP,iPCII,iICP,iAF,iEM,iNS,iIT};
        int[]credits={MB,MBRD,BS,MMBP,PCII,ICP,AF,EM,NS,IT};
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
    
    
    public double calculateSFGPA(String iMB, String iMBRD, String iBS, String iMMBP, String iPCII, String iICP, String iAF, String iEM,String iNS,String iIT){
    GPACalculation g = new GPACalculation();
    double addition = (MB*g.calculateGPA(iMB))+(MBRD*g.calculateGPA(iMBRD))+(BS*g.calculateGPA(iBS))+(MMBP*g.calculateGPA(iMMBP))+(PCII*g.calculateGPA(iPCII))+(ICP*g.calculateGPA(iICP))+(AF*g.calculateGPA(iAF))+(EM*g.calculateGPA(iEM))+(NS*g.calculateGPA(iNS))+(IT*g.calculateGPA(iIT));
    return GPA = addition/credit_no;
    }
   
}
