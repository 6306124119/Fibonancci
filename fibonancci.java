package fibonancci;

import java.util.*;

public class Fibonancci {
 static void main(String[] args) {
        System.out.print("Input angka : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int x = 0;
        int y = 1;

        for(int i = 1; i <= 10; i++)
        {
            x = x + y;
            y = x - y;
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
