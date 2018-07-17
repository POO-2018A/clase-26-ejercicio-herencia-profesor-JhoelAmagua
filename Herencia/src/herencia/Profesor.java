
package herencia;

public class Profesor extends Persona{
    
    String materia;

    public Profesor(String nombre, String apellido, String materia) {
        super(nombre, apellido);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
