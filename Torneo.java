package Practica8;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Torneo {
    private String nombre;
    private String region;
    private int partidosJugados;
    private int  partidosPendientes;
    private int numPart;
    private Map<Integer, Equipo> equipo;

    public Torneo(String nombre, String region, int numeroEquiposParticipantes, int partidosJugados, int partidosPendientes){
        this.equipo = new HashMap<>();

        this.setNombre(nombre);
        this.setRegion(region);
        this.setnumPart(numeroEquiposParticipantes);
        this.setPartidosJugados(partidosJugados);
        this.setPartidosPendientes(partidosPendientes);


        this.agregarEquipos();
    }

    private void agregarEquipos(){
        for(int i=0; i<this.getnumPart(); i++){
            System.out.println("Ingreso de informacion sobre Equipo");
            Equipo equipo = new Equipo(

                    CapturaDeE.capturarString("Nombre de equipo"),
                    CapturaDeE.capturarString("Division"),
                    CapturaDeE.capturarString("Entrenador"),
                    CapturaDeE.capturarEntero("Torneos participados"),
                    CapturaDeE.capturarEntero("Torneos ganados"),
                    CapturaDeE.capturarEntero("Torneos perdidos"),
                    CapturaDeE.capturarEntero("Cantidad de jugadores en equipo"),
                    i);

            this.equipo.put(i, equipo);
        }
    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }
    private void setRegion(String region) {
        this.region = region;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }
    private void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }
    private void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

    public int getnumPart() {
        return numPart;
    }
    private void setnumPart(int numPart) {
        this.numPart = numPart;
    }

    public int getNumeroJugadores(int team){
        return this.equipo.get(team).getJugadoresRegistrados();
    }

    public String getNombreJugador(int team, int player){
        return this.equipo.get(team).getNombreJugador(player);
    }

    public int getNumeroUniforme(int team, int player){
        return this.equipo.get(team).getNumeroUniforme(player);
    }

    public String getNombreEquipo(int team){
        return this.equipo.get(team).getnombreequipo();
    }

    public int getPuntosAnotados(int team){
        return this.equipo.get(team).puntosAnotados();
    }

    public String getDivision(int team){
        return this.equipo.get(team).getDivision();
    }

    public int getPuntosEquipos(int team){
        return this.equipo.get(team).puntosAnotados();
    }


    public class CapturaDeE {
        public static String capturarString(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.next());
        }
    
        public static int capturarEntero(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.nextInt());
        }
    
        public static float capturarFloat(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.nextFloat());
        }
    }

}
