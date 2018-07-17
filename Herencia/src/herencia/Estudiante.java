
package herencia;

import java.util.ArrayList;

public class Estudiante extends Persona{
   String materia;
    ArrayList<Materia> materias;
    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
        this.materia = materia;
        this.materias = new ArrayList();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

}

