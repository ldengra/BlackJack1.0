package BlackJack;
import java.util.Scanner;

public class BlackJack {

    static Estadisticas estadistica = new Estadisticas();
    static Scanner input = new Scanner(System.in);
    static BarajaFrancesa b = new BarajaFrancesa();
    static Banca cpu = new Banca();
    static Jugador player = new Jugador();
    static int apuestaPorDefecto = 20;
    static int opcion;
    static boolean validado;

    /**
     * Al crear una nueva partida se crea el jugador, la baraja, se baraja automaticamente, resetea la mano y añade 2
     * cartas a jugador y a la banca
     */
    public static void nuevaPartida(){

        b.crearBaraja();
        b.barajar();
        cpu.setSaldo();

        player.resetMano();
        player.anyadirCartas(b.darCartas(2));
        cpu.anyadirCartas(b.darCartas(2));
        System.out.println(player.getCartas());

        juegaJugador();
        juegaBanca();

    }

    /**
     * metodo en el que juega el usuario, si el contador de cartas es mayor de 21, directamente pierde el jugador
     * si es igual a 21, gana si o si y si es menor, da la opcion de coger carta, cada vez que coge carta se le suma a
     * su contador
     */
    public static void juegaJugador(){

        do{
            if(player.getContador()>21){
                System.out.println("Tienes "+player.getContador()+" puntos, has perdido");
                estadistica.setPuntosBanca(1);
                validado = true;
            } else if (player.getContador() == 21){
                System.out.println("Has ganado!!!");
                estadistica.setPuntosPlayer(1);
                validado = true;
            }else{
                System.out.println("Tienes "+player.getContador() + " puntos, quieres coger carta?");
                System.out.println("1. si...");
                System.out.println("2. no...");
                opcion = input.nextInt();
                input.nextLine();

                if(opcion==1){
                    player.anyadirCartas(b.darCartas(1));
                    System.out.println(player.getCartas());
                    validado = true;
                }else {
                    validado = false;
                }
            }

        } while(!validado);

    }

    public static void juegaBanca(){
        System.out.println("juega banca");
        do{
            while (cpu.getContador()<=16){
                cpu.anyadirCartas(b.darCartas(1));

                if (cpu.getContador()>=17){
                    validado=false;
                }
            }
        }while (!validado);
    }

    public static void mostrarEstadisticas(){
        System.out.println(estadistica.toString());
    }
}
