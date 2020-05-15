package BlackJack;

public class Jugador {

    public static final int saldo = 100;

    private int contador;
    private int cartera; //dinero disponible

    public Jugador() {
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

    @Override
    public String toString() {
        return "contador=" + contador + ", cartera=" + cartera;
    }
}
