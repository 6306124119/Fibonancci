package fibonancci;

import java.util.*;

public class Fibonancci {
    public void fibonanci(int a){
        int x = 0;
        int y = 1;

        for(int i = a; i <= 5; i--)
        {
            x = x + y;
            y = x - y;
            System.out.print(x + " ");
        }

        System.out.println();
    }
    public static void main(String[] args){
        System.out.println();
        Fibonancci baru = new Fibonancci();
        baru.fibonanci(4);
    }
}

