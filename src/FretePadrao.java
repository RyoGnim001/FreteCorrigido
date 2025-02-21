public class FretePadrao extends Frete implements Fretavel{

    public FretePadrao(double distancia, double valorKm){
        super(distancia, valorKm);
    }

    @Override
    public double calcularFrete(){
        return getDistancia() * getValorKm();
    }

    @Override
    public String toString(){
        return  "[Frete Padrão] " + super.toString();
    }

}
