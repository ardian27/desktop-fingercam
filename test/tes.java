
import Backpropagation.Connect;
import Backpropagation.Data;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angsakumisan
 */
public class tes {
    
    DecimalFormat df = new DecimalFormat("#.#####");
    public static void main(String[] args) throws UnknownHostException, IOException {
       
       double [][] a = new double[10][5];
       double [][] b = new double[1][5];
       
        DecimalFormat df = new DecimalFormat("#.#####");
       
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]=i;
                
            }
        }
        
        
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(6);
        ints.add(7);

        Collections.sort(ints);

        int target = 4;
        int nearest = 0;

        for (int i : ints)
        {
            if (i <= target) {
                nearest = i;
            }
        }

        System.out.println(nearest);
        
        Random rand = new Random();
        double ff;
        
        float [] x = new float[5];
        
        
        
        for (int i = 0; i < x.length; i++) {
            
            x[i]=round(rand.nextFloat()*1, 1);
            System.out.println("nilai "+i+"="+x[i]);
            
        }
        
        double c = 0.02243324343243234;
        
        double xa = Double.valueOf(df.format(c));
                
        
        System.out.println(""+xa);
        System.out.println("nilai d = "+(xa*2));
        
        int iterasi=10;
        double max_error = 1;
        
      if (((iterasi < 8)) || ((iterasi<1))){
        
    }
        
        Data dt = new Data();
        
        double xx [][] = dt.getDataAsli();
        
        for (int i = 0; i < xx.length; i++) {
            for (int j = 0; j < xx[1].length; j++) {
                System.out.print("Nilai "+xx[i][j]+"\t");
            }
        }
       
    }
    
    public static float round(float d, int decimalPlace) {
    BigDecimal bd = new BigDecimal(Float.toString(d));
    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
    return bd.floatValue();
    
    
    
}
    
    
    
    public  double  roundNilai5(double x){
        double nilai = Double.valueOf(df.format(x));
        return nilai;
    }
}
