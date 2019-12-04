import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ClimaDoDia {

	private LocalDate data;
	private String ventoDirecao;
	private int ventoVelocidade;
	private int indicePluviometrico;
	private double temperatura;
	
	
	public ClimaDoDia(LocalDate data, String ventoDirecao, int ventoVelocidade, int indicePluviometrico, double temperatura) {
		this.data = data;
		this.ventoDirecao = ventoDirecao;
		this.ventoVelocidade = ventoVelocidade;
		this.indicePluviometrico = indicePluviometrico;
		this.temperatura = temperatura;
	}

	public void chamarScanner() {
		
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getVentoDirecao() {
		return ventoDirecao;
	}
	public void setVentoDirecao(String ventoDirecao) {
		if(ventoDirecao == null || ventoDirecao.isEmpty()) {
			throw new IllegalArgumentException("Direção inválida.");
		}
		this.ventoDirecao = ventoDirecao;
	}
	public int getVentoVelocidade() {
		return ventoVelocidade;
	}
	public void setVentoVelocidade(int ventoVelocidade) {
		this.ventoVelocidade = ventoVelocidade;
	}
	public int getIndicePluviometrico() {
		return indicePluviometrico;
	}
	public void setIndicePluviometrico(int indicePluviometrico) {
		if(indicePluviometrico <= 0) {
			throw new IllegalArgumentException("índice inválido.");
		}
		this.indicePluviometrico = indicePluviometrico;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
}
