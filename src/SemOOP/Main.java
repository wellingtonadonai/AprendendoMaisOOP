package SemOOP;

import ComOPP.Triagulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triagulo x, y;
        x = new Triagulo();
        y = new Triagulo();

        System.out.println("Enter the measures of triangule X");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        System.out.println("Enter the measures of triangule Y");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();


        Double areaX = x.area();

        Double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area X");
        }else {
            System.out.println("Larger area Y");
        }
        sc.close();


    }
}