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
class DistribusiDiskrit {
   GenerateBilanganAcak test= new GenerateBilanganAcak();
    DistribusiKontinu test1= new DistribusiKontinu();

    public int DistUniformDiskrit(double min, double max){
        double a=min;
        double b=max;
        double u=test.generateBil01();
        int x=(int) ((int)a+(b-a+1)*u);
        return x;
    }

    public int DistBinomAlg1(double p, int n) throws InterruptedException{
        int x=0, i=1;
        while(i<=n){
            double u=test.generateBil01();
            if(u<p){
                x++;
            }
            i++;
            Thread.sleep(10);
        }
        return x;
    }

    public void displayBilanganUniform(int jumlah) throws InterruptedException{
        for (int i = 0; i < jumlah; i++) {
            System.out.println("x"+(i+1)+" = "+this.DistUniformDiskrit(2, 10));
            Thread.sleep(10);
        }
    }

    public void displayBilanganBinom(int jumlah) throws InterruptedException{
        for (int i = 0; i < jumlah; i++) {
            System.out.println("x"+(i+1)+" = "+this.DistBinomAlg1(0.6, 20));
            Thread.sleep(10);
        }
    }

    public void displayPoisson(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(this.distPoissonAlg1(6));

        }
    }


    public float distPoissonAlg1(float lambda){
        int x=0;
        float w=0;
        float y;
        int terus=0;
        do{
            y=test1.distExpon(1/lambda);
            w=w+y;
            if(w<1){
                x=x+1;
            }else
                terus=1;
        }
        while(terus==0);
        return x;
    }

    public int distEmpirik(int x[], double fx[]){

        double Fx[] = new double[8];
        int n=8;
        for(int j=0;j<n;j++){
            if(j==0){
                Fx[j]=fx[j];
            }else{
                Fx[j]=Fx[j-1]+fx[j];

            }
        }
        double u = test.generateBil01();
        int i=0;
        while(u>Fx[i]){
            i++;
        }
        return x[i];
    }

    
}
