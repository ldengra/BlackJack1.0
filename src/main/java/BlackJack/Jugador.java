package BlackJack;

import java.util.ArrayList;
import java.util.Arrays;

public class Jugador {

    public static final int saldo = 100;

    private int contador;
    private int cartera; //dinero disponible
    private ArrayList<Carta> cartas;

    public Jugador() {
        this.cartas = new ArrayList<Carta>();
        this.contador = 0;
        this.cartera = saldo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getCartera() {
        return cartera;
    }

    public void setCartera(int cartera) {
        this.cartera = cartera;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    /**
     * metodo que añade las cartas del jugador y suma su valor metiendo el valor en el contador
     * @param nCartas
     */
    public void anyadirCartas(Carta[] nCartas){
        int total = 0;
        cartas.addAll(Arrays.asList(nCartas));

        for (int i = 0 ; i < cartas.size() ; i++){
            total = total + cartas.get(i).getNumero();
        }
        contador = total;
    }

    /**
     * metodo para resetear la mano del usuario
     */
    public void resetMano(){
        cartas.clear();
    }

    @Override
    public String toString() {
        return "contador=" + contador + ", cartera=" + cartera;
    }
}
