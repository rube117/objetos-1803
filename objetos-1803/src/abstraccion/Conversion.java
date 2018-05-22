package abstraccion;

public class Conversion {

    // Conversión de grados Centígrados a Farenheit
    
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
    
    // Conversión de Metros a Pies

    private Distancia distancia;

    public float metrosApies() {
        // Este método tiene lógica
        float resultado = distancia.getMetros() * 3.2808f;
        return resultado;
    }

    public Distancia getDistancia() {
        return distancia;
    }

    public void setDistancia(Distancia distancia) {
        this.distancia = distancia;
    }
}
