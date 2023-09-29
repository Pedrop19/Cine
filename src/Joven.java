public class Joven extends Persona {

    private int numeroBono;

    public Joven(String dni, int numeroBono) {
        super(dni);
        this.numeroBono = numeroBono;
    }

    public int getNumeroBono() {
        return numeroBono;
    }

    public void setNumeroBono(int numeroBono) {
        this.numeroBono = numeroBono;
    }

    @Override
    public int pagar(){
        return 2;
    }

    @Override
    public String toString() {
        return "Joven [" + super.toString() + ", numeroBono=" + numeroBono + "]";
    }
    
    
}
