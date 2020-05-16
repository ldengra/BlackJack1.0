package BlackJack;

import Recursos.Lib;

public abstract class Baraja<T> {

    protected Carta<T> cartas[];
    protected int posicionSiguienteCarta;
    protected int numCartas;
    protected int cartasPorPalo;


    /**
     * Crea una baraja y pone el contador de siguiente carta a 0
     */
    public Baraja(){
        this.posicionSiguienteCarta=0;
    }

    /**
     * metodo abstracto para que los hijos creen la baraja que haga falta a su manera
     */
    public abstract void crearBaraja();


    /**
     * metodo para barajar, creo un int para generar posiciones aleatorias y le doy un valor entre 0 y
     * la longitud del array de cartas. Creo una carta y voy iterando con el for para ir metiendo las cartas en orden
     * en posiciones aleatorias de la nueva baraja. Al final pongo la posicion de la siguiente carta a 0 para
     * que al barajar de nuevo, no haya AIOOB
     */
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

    /**
     * metodo para cambiar a la siguiente carta, si el numero de la siguiente carta es igual que el numero de cartas
     * totales, avisara de que no hay mas cartas, en caso contrario devuelve la carta siguiente y se suma 1 al contador
     * @return la carta siguiente del array
     */
    public Carta siguienteCarta(){

        Carta c = null;

        if(posicionSiguienteCarta == numCartas){
            System.out.println("No quedan mas cartas!!!");
        }else{
            c = cartas[posicionSiguienteCarta++];
        }

        return c;
    }

    /**
     * metodo para ver las cartas disponibles,  restamos el numero de cartas totales menos las posiciones de las cartas
     * siguientes
     * @return
     */
    public int cartasDisponibles(){
        return numCartas-posicionSiguienteCarta;
    }

    /**
     * metodo para dar carta, comprobamos que hayan cartas disponibles, se crea un array de cartas e insertamos las cartas
     * que le vamos a devolver al usuario iterando con un bucle for
     * @param numCartas numero de cartas que quieres que te devuelva
     * @return retorna un array
     */
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

    /**
     * Muestra las cartas que hay en el monton QUE YA HAN SALIDO.
     */
    public void cartasMonton(){

        if(cartasDisponibles() == numCartas){
            System.out.println("No se han sacado ninguna carta");
        }else {
            for(int i = 0 ; i < posicionSiguienteCarta ; i++){
                System.out.println(cartas[i]);
            }
        }
    }

    /**
     * muetra las cartas que quedan por salir.
     */
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
