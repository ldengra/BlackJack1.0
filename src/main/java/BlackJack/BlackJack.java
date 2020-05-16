package BlackJack;

public class BlackJack {

    static BarajaFrancesa b = new BarajaFrancesa();
    static Banca cpu = new Banca();
    static Jugador player = new Jugador();

    public static void nuevaPartida(){

        b.crearBaraja();
        b.barajar();
        b.mostrarBaraja();

        cpu.setSaldo();
    }
}
