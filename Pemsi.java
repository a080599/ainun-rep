/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemsi;

/**
 *
 * @author Ainun Zainiyah
 */
public class Pemsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Distribusi_diskrit a= new Distribusi_diskrit();
//       
//        a.distPoissonAlg1(0.7f);
//        a.displayPoisson(1000);
        
        int [] array = {1,2,3,4,5,6,7,8};
        double [] farray = {0.1,0.2,0.3,0.01,0.02,0.05,0.11,0.21};
        for (int i = 0; i < 8; i++) {
             System.out.println(a.distEmpirik(array, farray));
        }
       
           
//        DistribusiKontinu b = new DistribusiKontinu();
//        
//        b.displayDistExpon(1000,0.3f);
    }
    

    
}
