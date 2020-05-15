package BlackJack;

public class BarajaFrancesa extends Baraja {

    public BarajaFrancesa(){
        super();

        this.numCartas = 52;
        this.cartasPorPalo = 13;

        crearBaraja();
        super.barajar();
    }

    @Override
    public void crearBaraja() {

        this.cartas = (Carta<Palo>[]) new Carta[numCartas];
        Palo[] palos = Palo.values();

        for(int i = 0; i < palos.length ; i++){

            for(int j = 0 ; j < cartasPorPalo ; j++){

                cartas[ (( i * (cartasPorPalo)) + j) ] = new Carta(j + 1, palos[i]);

            }
        }
    }

    public boolean cartaRoja(Carta<Palo> c){

        return c.getPalo() == Palo.CORAZONES || c.getPalo() == Palo.DIAMANTES;
    }

    public boolean cartaNegra(Carta<Palo> c){

        return c.getPalo() == Palo.TREBOLES || c.getPalo() == Palo.PICAS;
    }
}
