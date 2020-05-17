package BlackJack;

import java.util.Scanner;
public class Main {

    static Scanner input = new Scanner(System.in);
    static boolean validado;

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        do{
            opcion = mostrarMenu();
            switch (opcion){
                case 1:
                    BlackJack.nuevaPartida();
                    break;
                case 2:
                    mostrarEstadisticas();
                case 0:
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    public static int mostrarMenu(){
        int opcion = -1;

        do{
            try {
                System.out.println("***********************");
                System.out.println("*****  BLACKJACK  *****");
                System.out.println("***********************");
                System.out.println("1. Nueva Partida...");
                System.out.println("2. Mostrar Estadísticas...");
                System.out.println("--------------------------------");
                System.out.println("0. Salir...");
                opcion = Integer.parseInt(input.nextLine());
                if(opcion >= 0 && opcion <= 2){
                    validado = true;
                } else{
                    validado = false;
                    System.err.println("Opcion Incorrecta");
                }
            } catch (NumberFormatException nfe){
                validado = false;
                System.err.println("Introduce solo numeros!");
            }
        } while (!validado);

        return opcion;
    }

    public static void mostrarEstadisticas(){
        BlackJack.mostrarEstadisticas();
    }

}
