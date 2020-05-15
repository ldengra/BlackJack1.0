package BlackJack;

public class BlackJack {



    public static void nuevaPartida(){
        BarajaFrancesa b = new BarajaFrancesa();

        b.crearBaraja();
        b.barajar();
        b.mostrarBaraja();
    }
}
