package Practica8;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Torneo torneo = new Torneo(

            Captura.String("Nombre del torneo"),
                Captura.String("Region"),
                Captura.Entero("Cantidad de equipos participantes"),
                Captura.Entero("Cantidad de partidos jugados"),
                Captura.Entero("Cantidad de partidos por jugar"));

        System.out.println("\nInformacion sobre el torneo");
        System.out.println("Nombre del torno: " + torneo.getNombre());
        System.out.println("Region del torneo: " + torneo.getRegion());
        System.out.println("Numero de equipos participantes del torneo: " + torneo.getnumPart());
        System.out.println("Partidos jugados del torneo: " + torneo.getPartidosJugados());
        System.out.println("Partidos pendientes del torneo: " + torneo.getPartidosPendientes());

        System.out.println("\nInformacion sobre los equipos");
        for(int i=0; i<torneo.getnumPart(); i++){
            System.out.println("Equipo del equipo: " + torneo.getNombreEquipo(i));
            System.out.println("Division del equipo: " + torneo.getDivision(i));
            System.out.println("Puntos anotados del equipo: " + torneo.getPuntosEquipos(i));
            System.out.println("Cantidad de jugadores del equipo: " + torneo.getNumeroJugadores(i));
            System.out.println("Jugadores:");

            for(int j=0; j<torneo.getnumPart(); j++){
                System.out.println("Nombre del jugador: " + torneo.getNombreJugador(i, j));
                System.out.println("Numero del jugador: "+ torneo.getNumeroUniforme(i, j));
            }
            System.out.println("\n");
        }

        

        
    
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
