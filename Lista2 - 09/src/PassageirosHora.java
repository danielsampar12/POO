
public class PassageirosHora {
	private int[][][] matriz = new int [12][30][24]; //12 meses 30 dias 24 horas
	
	//item a) método para adicionar passageiro em determinada hora
	public void adiciona(int mes, int dia, int hora) {
		mes--; // -1 para adaptar do valor natural ao índice da matriz 
		dia--; 
		matriz[mes][dia][hora]++;
	}
	
	//item b)
	public int qtPassageirosDia(int mes, int dia) {
		int total = 0;
		for(int i = 0; i < 24; i++) {
			total += matriz[mes][dia][i];
		}
		return total;
	}
	
	//item c)
	public int qtPassageirosMes(int mes) {
		int total = 0;
		for(int dia = 1; dia <= 30; dia++) {
			total += this.qtPassageirosDia(mes , dia);
		}
		return total;
	}
	
	public int mesMenorFluxo() {
		int mesMenor = 0;
		int qtdMenor = Integer.MAX_VALUE;
		
		for(int mes = 1; mes <= 12; mes++) {
			int aux = this.qtPassageirosMes(mes);
			if(aux < qtdMenor) {
				mesMenor = mes;
				qtdMenor = aux;
			}
		}
		return mesMenor;
	}
	
	//item e)
	public int[] picoTransporte() {
		int[] vetorResult = new int[2];
		int qtdMaior = 0;
		for(int m = 1; m <= 12; m++) {
			for(int d = 1; d <= 30; d++) {
				for(int h = 0; h < 24; h++) {
					if(matriz[m][d][h] > qtdMaior) {
						qtdMaior = matriz[m][d][h];
						vetorResult[0] =  d + 1;
						vetorResult[1] =  m + 1;
						vetorResult[2] =  h;
					}
					
				}
			}
		}
		return vetorResult;
	}
	
}
