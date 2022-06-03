package Practica8;

public class jugador {
    private int numeroUni;
    private int puntosA;
    private String nombre;
    private String posicion;
    private float estatura;

    public jugador(int numeroUni, String nombre, int puntosA, String posicion, float estatura){
        this.setnumeroUni(numeroUni);
        this.setNombre(nombre);
        this.setpuntosA(puntosA);
        this.setPosicion(posicion);
        this.setEstatura(estatura);
    }

    private void setnumeroUni(int numeroUni) {
        this.numeroUni = numeroUni;
    }
    public int getNumeroUniforme() {
        return numeroUni;
    }

    private void setpuntosA(int puntosA) {
        this.puntosA = puntosA;
    }
    public int getpuntosA() {
        return puntosA;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    private void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getPosicion() {
        return posicion;
    }

    private void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public float getEstatura() {
        return estatura;
    }
}
