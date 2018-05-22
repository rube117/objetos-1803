package abstraccion;

public class Conversion {

    private Grados grados;

    public float centigradosAFarenheit() {
        // Este método tiene lógica
        float resultado = grados.getCentigrados() * 1.8f + 32;
        return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

}
