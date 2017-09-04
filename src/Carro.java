

public class Carro {
    private String marca;
    private Motor m;
    private Llanta [] delantera;
    private Llanta [] trasera;

    public Carro( double potencia, String marca) {
        Motor motor=new Motor(potencia, marca);
        this.m = motor;
       
    }
    
    public void adicionarLLantasDelanteras(Llanta[] llantas){
        this.delantera=llantas;
        this.m.setEje(llantas);
    }
    
    public void adicionarLLantasTraseras(Llanta[] llantas){
        llantas[0].setEje(this.m);
        llantas[1].setEje(this.m);
        this.trasera=llantas;
        this.m.setEje(llantas);
    }
}
