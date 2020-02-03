package pemsi;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainun Zainiyah
 */
public class GenerateBilanganAcak {
    public long generateBilBulat(int digit){
        long subs=1;
        long last;

        for(int i=0;i<13-digit;i++){
            subs *= 10;
        }
        long date = (long) new Date().getTime();
        long x = date/subs;
        last = date%10;
        if(last == 0){
            last=1;
        }
        long bilBul = x*last;
        long y=bilBul;
        int n=0;
        while(y!=0){
            y/=10;
            n++;
        }
        if(n>digit){
            int kelebihan = n-digit;
            for(int i=0;i<kelebihan;i++){
                bilBul/=10;
            }
        }
        return bilBul;
    }

    public void metodeLCG(long a, long c, long m, long z0){
     long first= (a*z0+c)%m;
     boolean sama=false;
     long z = first;
     System.out.println("z0 = "+z0);
     System.out.println("z1 = "+first);
     int p=0;
        for (int i = 2; sama==false; i++) {

             z=(a*z+c)%m;
             System.out.println("z"+i+" = "+z);
             if (z==first) {
                sama=true;
                p=i;
            }
        }
       System.out.println("Periode "+p);
    }

    public void metodeLCGM(){
        System.out.println("GGUBS" +"IMSL Routine");
        this.metodeLCG((long)Math.pow(7,5), 0,(long) Math.pow(2, 31), this.generateBilBulat(4));

        System.out.println("RANDU" + "IBM Scientific Subroutine");
        this.metodeLCG((long)Math.pow(2,16)+3, 0,(long) Math.pow(2, 31), this.generateBilBulat(4));
    }

    public double generateBil01(){

        double hasil =  Math.random() ;
        return hasil;

    }
    
}


