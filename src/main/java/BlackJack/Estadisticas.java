package BlackJack;

public class Estadisticas {
    private int puntosPlayer;
    private int puntosBanca;

    public Estadisticas() {
        this.puntosPlayer = 0;
        this.puntosBanca = 0;
    }

    public int getPuntosPlayer() {
        return puntosPlayer;
    }

    public void setPuntosPlayer(int puntosPlayer) {
        this.puntosPlayer = puntosPlayer;
    }

    public int getPuntosBanca() {
        return puntosBanca;
    }

    public void setPuntosBanca(int puntosBanca) {
        this.puntosBanca = puntosBanca;
    }

    @Override
    public String toString() {
        return "----------------------------"+'\n'+
                "|  PLAYER    |    CPU      |"+'\n'+
                "----------------------------"+'\n'+
                "|   "+this.puntosPlayer+ "        |     "+this.puntosBanca+"       |"+'\n'+
                "----------------------------";
    }
}
