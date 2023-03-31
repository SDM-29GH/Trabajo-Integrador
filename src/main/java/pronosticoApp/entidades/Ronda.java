package pronosticoApp.entidades;

import java.util.ArrayList;

public class Ronda {
    private String nro;
    //private Partido[] partidos1;
    private ArrayList<Partido> partidos = new ArrayList<>();

    public Ronda() {
    }

    public Ronda(String nro, ArrayList<Partido> partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void puntos(){

    }
}
