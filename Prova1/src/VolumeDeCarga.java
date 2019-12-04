/*Autor: Daniel Garcia Sampar
 * 
 */

public class VolumeDeCarga {

    private double altura;
    private double largura;
    private double profundidade;
    private double valor;
    private int numeroId;
    

    public double getLitros(){
        return (this.getAltura()*this.getLargura()*this.getProfundidade())*1000;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0){
            throw new IllegalArgumentException("Dimensão incorreta. Altura não pode ser negativa.");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 0){
            throw new IllegalArgumentException("Dimensão incorreta. Largura não pode ser negativa.");
        }
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        if(profundidade < 0){
            throw new IllegalArgumentException("Dimensão incorreta. Profundidade não pode ser negativa.");
        }
        this.profundidade = profundidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor < 0){
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.valor = valor;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        if(numeroId < 0){
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        this.numeroId = numeroId;
    }
}
