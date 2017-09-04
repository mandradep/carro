
import java.util.logging.Logger;

public class Llanta {
private double diametro;
private String marca;
private Motor eje;

    public Llanta(double diametro, String marca) {
        this.diametro = diametro;
        this.marca = marca;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getEje() {
        return eje;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEje(Motor eje) {
        this.eje = eje;
    }
    
    
    

}
