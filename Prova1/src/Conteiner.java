/*Autor: Daniel Garcia Sampar
 * 
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Conteiner {


    private int cdRastreamento;
    private LocalDate dataFab;
    private double valorSeguradora;
    private double capacidadeMaxima;
    private ArrayList<VolumeDeCarga> volumes = new ArrayList<>();
    
    public Conteiner(int cdRastreamento, LocalDate data, double valorSeguradora, double capacidadeMaxima) {
    	this.setCdRastreamento(cdRastreamento);
    	this.setDataFab(data);
    	this.setValorSeguradora(valorSeguradora);
    	this.setCapacidadeMaxima(capacidadeMaxima);
    }

    public void addVolume(VolumeDeCarga v){
        if(this.getValorDisponivel() < v.getValor()){
            throw new  IllegalArgumentException("Valor ultrapassou o limite imposto pela seguradora");
        }
        if(this.getCapacidadeDisponivel() < v.getLitros()){
            throw new IllegalArgumentException("Espaço no conteiner indisponivel.");
        }
        this.volumes.add(v);
    }

    
    
    public int comparaCom(Conteiner outro){
        double valorThis = this.getCapacidadeDisponivel();
        double valorOutro = outro.getCapacidadeDisponivel();
        if(valorThis > valorOutro){
            return 1;
        }
        if(valorThis < valorOutro){
            return  -1;
        }
        if(this.getCapacidadeDisponivel() == this.getCapacidadeMaxima()
        	&& outro.getCapacidadeDisponivel() == outro.getCapacidadeMaxima()) {
        	return -1;
        }
        if(this.getCapacidadeUtilizada() == 0 && outro.getCapacidadeUtilizada() == 0) {
        	return -1;
        }
        return  0;
    }

    public double getValorDisponivel(){
        double total = 0;
        for(VolumeDeCarga v : volumes){
            total += v.getValor();
        }
        return this.valorSeguradora - total;
    }

    public double getCapacidadeDisponivel(){
        double total = 0;
        for(VolumeDeCarga v : volumes){
            total += v.getLitros();
        }
        if(total > 0 ) {
        	return (this.capacidadeMaxima*0.85) - total;
        }
        	return this.capacidadeMaxima;
    }

    public double getCapacidadeUtilizada(){
        double total = 0;
        for(VolumeDeCarga v : volumes){
            total += v.getLitros();
        }
        return total;
    }

    public int getCdRastreamento() {
        return cdRastreamento;
    }

    public void setCdRastreamento(int cdRastreamento) {
        this.cdRastreamento = cdRastreamento;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getCapacidadeMaxima(){
        return capacidadeMaxima;
    }

    public LocalDate getDataFab() {
        return dataFab;
    }

    public void setDataFab(LocalDate dataFab) {
        this.dataFab = dataFab;
    }

    public double getValorSeguradora() {
        return valorSeguradora;
    }

    public void setValorSeguradora(double valorSeguradora) {
        this.valorSeguradora = valorSeguradora;
    }



}
