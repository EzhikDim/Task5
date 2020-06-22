package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите высоту треугольника (не меньше чем 3):");
        Scanner inp = new Scanner(System.in);
        int h = inp.nextInt();
        String niz = "-", osn = "";
        for (int i = 0; i < h; i++){
            if(i == 0) {
                System.out.println("*");
                continue;
            }
            if(h - i == 1){
                for(int j = 0; j < h; j++){
                    if(j == 0 || h - j == 1) {
                        System.out.print("*");
                        continue;
                    }
                    System.out.print(niz);
                }
                break;
            }
            System.out.println("|" + osn + "\\");
            osn += " ";
        }
    }
}
