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
public class BioI_SecondSemester {
    int credit_no = 0;
    private double GPA = 0;
    final private int PML = 2;
    final private int PMLP = 1;
    final private int FS = 1;
    final private int OC = 3;
    final private int ICS = 2;
    final private int PCA = 1;
    final private int AL = 3;
    final private int AB = 2;
    final private int FP = 3;
    
    
    public BioI_SecondSemester( String iPML, String iPMLP, String iFS, String iOC, String iICS, String iPCA, String iAL, String iAB, String iFP){
        String[]subjects={iPML,iPMLP,iFS,iOC,iICS,iPCA,iAL,iAB,iFP};
        int[]credits={PML,PMLP,FS,OC,ICS,PCA,AL,AB,FP};
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
    
    
    public double calculateFSGPA(String iPML, String iPMLP, String iFS, String iOC, String iICS, String iPCA, String iAL, String iAB, String iFP){
    GPACalculation g = new GPACalculation();
    double addition = (PML*g.calculateGPA(iPML))+(PMLP*g.calculateGPA(iPMLP))+(FS*g.calculateGPA(iFS))+(OC*g.calculateGPA(iOC))+(ICS*g.calculateGPA(iICS)+(PCA*g.calculateGPA(iPCA)))+(AL*g.calculateGPA(iAL))+(AB*g.calculateGPA(iAB))+(FP*g.calculateGPA(iFP));
    return GPA = addition/credit_no;
    }
    
 
}
