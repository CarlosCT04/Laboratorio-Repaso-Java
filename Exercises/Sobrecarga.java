package Exercises;

public class Sobrecarga {

    String nombre;
    String materia;
    int calificacion;

    public Sobrecarga(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public String reprobar(){
        if (this.calificacion < 6)
            return ":(";
        else
            return ":)";
    }

}