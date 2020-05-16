package BlackJack;

public class Banca {

    public static final int saldoInicial = 2000;

    private int saldo;
    private int contador;

    public Banca() {
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

    @Override
    public String toString() {
        return "saldo=" + saldo + ", contador=" + contador;
    }
}
