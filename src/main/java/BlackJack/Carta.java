package BlackJack;

public class Carta<T> {


    private int numero;
    private T palo;
    private String carta; //desde A-K

    public Carta(int numero, T palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public T getPalo() {
        return palo;
    }


    @Override
    public String toString() {

        String estado="";
        String nombreFigura ="";

        if(palo.getClass().getSimpleName().equals("Palo")){

            switch (numero){
                case 1:
                    nombreFigura="As";
                    break;
                case 11:
                    nombreFigura="Jota";
                    this.numero=10;
                    break;
                case 12:
                    nombreFigura="Reina";
                    this.numero=10;
                    break;
                case 13:
                    nombreFigura="Rey";
                    this.numero=10;
                    break;
                default:
                    nombreFigura = numero+"";
            }
            estado = nombreFigura + " de " + palo;
        }

        return estado;
    }


}
