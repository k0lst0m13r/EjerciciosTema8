public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setNombre("Carlos");
        miPersona.setEdad("54");
        miPersona.setTelefono("456321");

        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getTelefono());


    }

}
class Persona {
    private String nombre;
    private String edad;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}