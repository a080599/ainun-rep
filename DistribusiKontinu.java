package pemsi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainun Zainiyah
 */
public class DistribusiKontinu {
    GenerateBilanganAcak test= new GenerateBilanganAcak();
    
    public float distExpon(float teta){
        float u=(float)test.generateBil01();
        float x=(-teta)*(float)Math.log(u);
        return x;
    }

    public void displayDistExpon(int jumlah, float teta){
        for (int i = 0; i < jumlah; i++) {
            System.out.println(+this.distExpon(teta));
        }
    }
}


