public class FreteSuperExpresso extends  FreteExpresso implements Fretavel {
    private double valorSeguro;

    public FreteSuperExpresso(double distancia, double valorKm, int nivelDeUrgencia, double valorSeguro) {
        super(distancia, valorKm, nivelDeUrgencia);
        this.valorSeguro = valorSeguro;
    }

    public double getValorSeguro() {
        return this.valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double calcularFrete() {
        return (getDistancia() * getValorKm() + (getNivelDeUrgencia() * 40) + getValorSeguro());
    }

    @Override
    public String toString() {
        return String.format(
                "[Frete Super Expresso] %s | Seguro: R$%.2f",
                super.toString(), getValorSeguro()
        );
    }
}
