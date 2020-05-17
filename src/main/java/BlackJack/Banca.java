package BlackJack;

import java.util.ArrayList;
import java.util.Arrays;

public class Banca {

    public static final int saldoInicial = 2000;

    private int saldo;
    private int contador;
    private ArrayList<Carta> cartas;

    public Banca() {
        this.cartas = new ArrayList<Carta>();
        this.saldo = saldoInicial;
        this.contador = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = saldoInicial;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    /**
     * metodo que añade las cartas a la banca y suma su valor metiendo el valor en el contador
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
     * metodo para resetear la mano de la banca
     */
    public void resetMano(){
        cartas.clear();
    }

    @Override
    public String toString() {
        return "saldo=" + saldo + ", contador=" + contador;
    }
}
