import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class TafelLoop {
    public static void main(String[] args) {
        for (; ; ) {

            System.out.println("voer het getal van de tafel in:");
            var scanner1 = new Scanner(System.in);
            var getal = scanner1.nextInt();


            for (int i = 1; i <= 10; i++) {

                System.out.println(i + " * " + getal + "= " + getal);


            }

        }
    }
}








