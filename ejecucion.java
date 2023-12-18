public class AppEstudiantePersona {

    public static void main (String[] args) {

        Estudiante e = new Estudiante (nombre: "Luis Garcia", edad: 20);
        Persona p = new Persona( nombre: "Marta Gomez", edad:20);

        System.out.printIn(p.getNombre());
        System.out.printIn(e.getNombre() + " ; " + e.getCreditos() + " creditos");
    }
}