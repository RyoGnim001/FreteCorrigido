abstract class Frete {
    private double distancia;
    private double valorKm;

    public Frete(double distancia,double valorKm){
        this.distancia = distancia;
        this.valorKm = valorKm;
    }

    @Override
    public String toString(){
        return String.format(
                "Distância: %.2f km | Valor por Km: R$%.2f",
                getDistancia(), getValorKm()
        );
    }

    public double getDistancia(){
        return this.distancia;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    public double getValorKm(){
        return this.valorKm;
    }
    public void setValorKm(double valorKm){
        this.valorKm = valorKm;
    }

}
