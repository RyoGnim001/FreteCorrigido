public class FreteExpresso extends Frete implements  Fretavel{
    private int nivelDeUrgencia;

    public FreteExpresso(double distancia, double valorKm, int nivelDeUrgencia){
        super(distancia, valorKm);
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    public int getNivelDeUrgencia(){
        return this.nivelDeUrgencia;
    }
    public void setNivelDeUrgencia(int nivelDeUrgencia){
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    @Override
    public double calcularFrete(){
        return (getDistancia() * getValorKm() + (getNivelDeUrgencia() * 20));
    }
    @Override
    public String toString(){
        return String.format(
                "[Frete Expresso] %s | Urgência: nível %d " ,
                super.toString() , getNivelDeUrgencia()
        );
    }


}
