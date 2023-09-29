import java.util.Arrays;

public class Sala {
    private String tituloPelicula;
    private Persona[][] asientos;

    private int ocupadas;
    private int recaudacion;

    public Sala(String tituloPelicula, int fila, int butacasPorfila, int ocupadas, int recaudacion) {
        this.tituloPelicula = tituloPelicula;
        this.asientos = new Persona[fila][butacasPorfila];
        this.ocupadas = ocupadas;
        this.recaudacion = recaudacion;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public Persona[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Persona[][] asientos) {
        this.asientos = asientos;
    }

    public int getOcupadas() {
        return ocupadas;
    }

    public void setOcupadas(int ocupadas) {
        this.ocupadas = ocupadas;
    }

    public int getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(int recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "Sala [tituloPelicula=" + tituloPelicula + ", asientos=" + Arrays.toString(asientos) + ", ocupadas="
                + ocupadas + ", recaudacion=" + recaudacion + "]";
    }

    public void asignarAsientos(Persona p) {
        boolean sentado = false;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if (asientos[i][j] == null && !sentado && ocupadas != (asientos.length * asientos[0].length)) {
                    asientos[i][j] = p;
                    sentado = true;
                    ocupadas++;
                    recaudacion += p.pagar();
                    System.out.println("Asiento asignado correctamente");
                } else if (ocupadas == (asientos.length * asientos[0].length))
                    System.out.println("La sala esta llena");
            }
        }
    }

    public void vaciarSala() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                asientos[i][j] = null;
            }
        }
    }
}
