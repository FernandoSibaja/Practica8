package Practica8;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Equipo {
    private String nombreequipo;
    private String division;
    private String entrenador;
    private int torneosPart;
    private int torneosGanados;
    private int torneosPerdidos;
    private int cantidadjug;
    private int numeEquipo;
    public Map<Integer, jugador> jugador2;



    public Equipo(String nombreequipo, String division, String entrenador, int torneosPart, int torneosGanados, int torneosPerdidos, int cantidadjug, int numeEquipo){
        
        this.setnombreequipo(nombreequipo);
        this.setDivision(division);
        this.setEntrenador(entrenador);
        this.settorneosPart(torneosPart);
        this.setTorneosGanados(torneosGanados);
        this.setTorneosPerdidos(torneosPerdidos);
        this.setcantidadjug(cantidadjug);
        this.setnumeEquipo(numeEquipo);
        this.jugador2 = new HashMap<>();
        this.agregarJ();
    }
   

    public String getnombreequipo(){
        return nombreequipo;
    }
    private void setnombreequipo(String nombreequipo){
        this.nombreequipo = nombreequipo;
    }

    public String getDivision(){
        return division;
    }
    private void setDivision(String division){
        this.division = division;
    }

    public String getEntrenador(){
        return entrenador;
    }
    private void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }

    public int gettorneosPart(){
        return torneosPart;
    }
    private void settorneosPart(int torneosPart){
        this.torneosPart = torneosPart;
    }

    public int getTorneosGanados(){
        return torneosGanados;
    }
    private void setTorneosGanados(int torneosGanados){
        this.torneosGanados = torneosGanados;
    }

    public int getTorneosPerdidos(){
        return torneosPerdidos;
    }
    private void setTorneosPerdidos(int torneosPerdidos){
        this.torneosPerdidos = torneosPerdidos;
    }

    public int getcantidadjug(){
        return cantidadjug;
    }
    private void setcantidadjug(int cantidadjug){
        this.cantidadjug = cantidadjug;
    }

    public int getnumeEquipo(){
        return numeEquipo;
    }
    private void setnumeEquipo(int numeEquipo){
        this.numeEquipo = numeEquipo;
    }

    public int getJugadoresRegistrados(){
        return jugador2.size();
    }

    public String getNombreJugador(int jugador){
        return jugador2.get(jugador).getNombre();
    }
    public int getNumeroUniforme(int jugador){
        return jugador2.get(jugador).getNumeroUniforme();
    }

    private void agregarJ(){
        System.out.println("Captura de informacion sobre jugadores");
        for(int i=0; i<this.getcantidadjug(); i++){
            System.out.printf("\nJugador #%d", i+1);
            jugador player = new jugador(this.validarNumeroUniforme(i,
            Captura.Entero("Ingresa numero de uniforme")),
                    Captura.String("Ingresa nombre"),
                    Captura.Entero("Sus Puntos anotados"),
                    Captura.String("Su Posicion"),
                    Captura.Float("Su Estatura"));
            this.jugador2.put(i, player);
        }
    }

    public int validarNumeroUniforme(int player, int numeroDeUniforme){
        if(this.jugador2.isEmpty()){
            return numeroDeUniforme;
        }
        else{
            for(int i=0; i<this.getJugadoresRegistrados();i++){
                if(numeroDeUniforme==this.jugador2.get(i).getNumeroUniforme()){
                    numeroDeUniforme=Captura.Entero("no es valido. Ingresar otro numero");
                }
            }
        }
        return numeroDeUniforme;
    }

    public int puntosAnotados(){
        int puntosTotales=0, jugReg;
        jugReg = this.getJugadoresRegistrados();

        for (int i=0; i<jugReg; i++){
            puntosTotales += this.jugador2.get(i).getpuntosA();
        }
        return puntosTotales;
    }

    public class Captura {
        public static String String(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.next());
        }
    
        public static int Entero(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.nextInt());
        }
    
        public static float Float(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.nextFloat());
        }
    }





}
