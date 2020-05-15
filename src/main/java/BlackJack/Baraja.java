package BlackJack;

import Recursos.Lib;

public abstract class Baraja<T> {

    protected Carta<T> cartas[];
    protected int posicionSiguienteCarta;
    protected int numCartas;
    protected int cartasPorPalo;



    public Baraja(){
        this.posicionSiguienteCarta=0;
    }

    public abstract void crearBaraja();



    public void barajar(){

        int poscionAleatoria = 0;
        Carta c,aux;

        for (int i = 0 ; i < cartas.length ; i++){
            poscionAleatoria = Lib.aleatorio(0, numCartas-1);
            c = cartas[i];
            cartas[i] = cartas[poscionAleatoria];
            cartas[poscionAleatoria] = c;
        }

        this.posicionSiguienteCarta = 0;

    }

    public Carta siguienteCarta(){

        Carta c = null;

        if(posicionSiguienteCarta == numCartas){
            System.out.println("No quedan mas cartas!!!");
        }else{
            c = cartas[posicionSiguienteCarta++];
        }

        return c;
    }

    public int cartasDisponibles(){
        return numCartas-posicionSiguienteCarta;
    }

    public Carta[] darCartas(int numCartas){

        if(numCartas > cartasDisponibles()){
            System.out.println("No se pueden dar mas cartas de las que hay");
        }else{
            if (cartasDisponibles() < numCartas){
                System.out.println("No hay suficientes cartas que mostrar");
            }else {
                Carta[] cartasDar = new Carta[numCartas];
                for (int i =0 ; i < cartasDar.length ; i++){
                    cartasDar[i]=siguienteCarta();
                }
                return cartasDar;
            }
        }
        return null;
    }

    public void cartasMonton(){

        if(cartasDisponibles() == numCartas){
            System.out.println("No se han sacado ninguna carta");
        }else {
            for(int i = 0 ; i < posicionSiguienteCarta ; i++){
                System.out.println(cartas[i]);
            }
        }
    }

    public void mostrarBaraja() {

        if (cartasDisponibles() == 0) {
            System.out.println("Ya se han mostrado todas");
        } else {
            for (int i = posicionSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i]);
            }

        }
    }
}
