package com.company;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double n1, n2;
        System.out.println("Informe dois valore:");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        if(n1 > n2){
            System.out.println("N1 maior");

        }else {
            System.out.println("N2 maior");
        }
    }
}
