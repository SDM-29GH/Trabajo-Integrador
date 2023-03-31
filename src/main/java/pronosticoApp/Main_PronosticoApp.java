package pronosticoApp;

import pronosticoApp.entidades.Equipo;
import pronosticoApp.entidades.Partido;
import pronosticoApp.entidades.Ronda;

import java.util.ArrayList;

public class Main_PronosticoApp {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();

        equipo1.setNombre("Argentina");
        equipo1.setDescripcion("Equipo Sudamericano");
        equipo2.setNombre("Arabia Saudita");
        equipo2.setDescripcion("Equipo de Medio Oriente");

        equipo1.getNombre();
        equipo1.getDescripcion();
        equipo2.getNombre();
        equipo2.getDescripcion();

        System.out.println(equipo1.getNombre()+" vs "+equipo2.getNombre());

        System.out.println("PARTIDO");
        Partido partido1 = new Partido();

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);

        partido1.setEquipos(equipos);

        partido1.setEquipo1(equipo1);
        partido1.setGolesEquipo1(1);
        partido1.setEquipo2(equipo2);
        partido1.setGolesEquipo2(2);

        partido1.getEquipos();

        partido1.getEquipo1();
        partido1.getGolesEquipo1();
        partido1.getEquipo2();
        partido1.getGolesEquipo2();

        for (Equipo aux: equipos) {
            System.out.println(aux.getNombre());
        }
        System.out.println(partido1.getEquipos().add(equipo1) +" vs "+ partido1.getEquipos().add(equipo2));

        System.out.println("Equipo: " + partido1.getEquipo1().getNombre() + " Goles: " + partido1.getGolesEquipo1());
        System.out.println("Equipo: " + partido1.getEquipo2().getNombre() + " Goles: " + partido1.getGolesEquipo2());
        System.out.println(partido1.getEquipos().add(equipo1));

        System.out.println("RONDA");
        Ronda ronda1 = new Ronda();
        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(partido1);

        ronda1.setNro("1");
        ronda1.setPartidos(partidos);

        ronda1.getNro();
        ronda1.getPartidos().add(partido1);

        System.out.println("Ronda: " + ronda1.getNro() + " Partido: " + ronda1.getPartidos().add(partido1));
    }
}
