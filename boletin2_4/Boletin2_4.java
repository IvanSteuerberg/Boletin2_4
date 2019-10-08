package boletin2_4;

//@author irodriguezsteuerberg

import java.util.Scanner;
 
public class Boletin2_4 {

    public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
System.out.println("Introduce a cantidade de diñeiro");
int dinero = sc.nextInt();
int billetes_100 = dinero/100;
int billetes_20 = (dinero%100)/20;
int billetes_5 = (dinero%20)/5;
int moedas_1 = (dinero%5)/1;
System.out.println(dinero+" euros son "+billetes_100+" billetes de 100 euros, "+
        billetes_20+" billetes de 20 euros, "+billetes_5+
        " billetes de 5 euros e "+moedas_1+" moedas de 1 euros");

    }
    
}
