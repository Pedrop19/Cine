public class Jubilado extends Persona{

    private String idCarnePensionista;

    public Jubilado(String dni, String idCarnePensionista) {
        super(dni);
        this.idCarnePensionista = idCarnePensionista;
    }

    public String getIdCarnePensionista() {
        return idCarnePensionista;
    }

    public void setIdCarnePensionista(String idCarnePensionista) {
        this.idCarnePensionista = idCarnePensionista;
    }

    @Override
    public int pagar() {
        return 4;
    }

    @Override
    public String toString() {
        return "Jubilado [" + super.toString() + ", idCarnePensionista=" + idCarnePensionista + "]";
    }
    
    
}
