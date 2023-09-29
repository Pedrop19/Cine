public class Persona {
    private String dni;

    public Persona(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int pagar(){
        return 5;
    }

    @Override
    public String toString() {
        return "dni=" + dni + "]";
    }

}
