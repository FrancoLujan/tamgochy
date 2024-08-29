
package org.example;


import java.util.Scanner;


public class Tamagochy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte op = 0;
        String decision;
        System.out.println("BIENVENDIO A MASCOTA VIRTUAL");
        System.out.print("Nombre de la mascota: ");
        String nombre = sc.nextLine();
        Mascota mascota = new Mascota(nombre);
        while (op != 5) {
            System.out.println("1- ALIMENTAR");
            System.out.println("2- ACTIVIDAD");
            System.out.println("3- DESCANSO");
            System.out.println("4- MOSTRAAR MASCOTA");
            System.out.println("5- salir");

            System.out.print("Escoge una accion:");
            op = sc.nextByte();
            System.out.println("--------------------------------");


            switch (op) {
                case 1:


                    System.out.print("comer o beber:");
                     decision = sc.next();

                    if (decision.equals("comer") || decision.equals("beber")) {
                        mascota.ingesta(decision);
                    }
                    System.out.println("'" + nombre + "'" + " " + decision);
                    break;
                case 2:
                    System.out.print("correr o saltar:");
                    decision = sc.next();

                    if (decision.equals("correr") || decision.equals("saltar")) {
                        mascota.actividad(decision);
                    }
                    System.out.println("'" + nombre + "'" + " realizo la accion de " + decision);
                    break;
                case 3:
                    System.out.print("dormir o despertar:");
                    decision = sc.next();
                    if (decision.equals("dormir") || decision.equals("despertar")) {
                        mascota.descanso(decision);
                    }
                    System.out.println("'" + nombre + "'" + " realizo la accion de " + decision);
                    break;
                case 4:
                    System.out.println(mascota.toString());
                    break;


            }



        }
        System.out.println("saliste");


    }
}
