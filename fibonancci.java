package fibonancci;

import java.util.*;

public class Fibonancci {
    public void fibonanci(int a){
        int x = 0;
        int y = 1;
        int jumlah =0;
        for(int i = 1; i <= 10; i++)
        {
            x = x + y;
            y = x - y;
            jumlah = jumlah+x;
        }

        System.out.println(jumlah);
    }
    public static void main(String[] args){
        System.out.println();
        Fibonancci baru = new Fibonancci();
        baru.fibonanci(4);
    }
}

