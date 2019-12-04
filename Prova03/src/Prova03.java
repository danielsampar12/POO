import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Prova03 implements Serializable {
	
	protected static ArrayList<AtletaVolei> atletasVolei= new ArrayList<>();
	protected static ArrayList<AtletaBasquete> atletasBasquete= new ArrayList<>();
	
	public static void main(String[] args) throws Throwable{
		JFileChooser j = new JFileChooser();
        int valor = j.showOpenDialog(null);
        File file = j.getSelectedFile();
        if (valor == JFileChooser.APPROVE_OPTION) {
            BufferedReader myBuffer = new BufferedReader(new InputStreamReader(
            											new FileInputStream(file), "UTF-8"));
            String linha = "";
            while ((linha = myBuffer.readLine()) != null) {
                 String[] vetor = linha.split(",");	
                 
                      for(String s : vetor) {
                    	 
                         if(vetor[0].equalsIgnoreCase("V")) {
                        	 AtletaVolei a = new AtletaVolei();
                        	 a.setNome(vetor[1]);
                        	 a.setAltura(Float.parseFloat(vetor[2]));
                        	 a.setPeso(Float.parseFloat(vetor[3]));
                        	 a.setPosicao(vetor[10]);
                        	 a.setSaque(Double.parseDouble(vetor[11]));
                        	 a.setBloqueio(Double.parseDouble(vetor[12]));
                        	 a.setAtaque(Double.parseDouble(vetor[13]));
                        	 atletasVolei.add(a);
                         }else if(vetor[0].equalsIgnoreCase("B")) {
                        	 AtletaBasquete b = new AtletaBasquete();
                        	 b.setNome(vetor[1]);
                        	 b.setAltura(Float.parseFloat(vetor[2]));
                        	 b.setPeso(Float.parseFloat(vetor[3]));
                        	 b.setPosicao(vetor[10]);
                        	 b.setPontos(Integer.parseInt(vetor[11]));
                        	 b.setRebotes(Integer.parseInt(vetor[12]));
                        	 atletasBasquete.add(b);
                         }
                     }

                 
            }
            serializar(file.getName(), file.getName() + "-new.dat");
            myBuffer.close();
        }else {
        	throw new FileNotFoundException();
        }
        	
        	
	}
	
	public static void serializar(String arqOrigem, String arqDestino) throws IOException {
/*
		ObjectOutputStream objGravar = null;
		try {
			for(AtletaVolei v : atletasVolei) {
				objGravar = new ObjectOutputStream(new FileOutputStream("teste.dat"));
				System.out.println(v);
				objGravar.writeObject(v);
				
			}
			for(AtletaBasquete b : atletasBasquete) {
				objGravar = new ObjectOutputStream(new FileOutputStream(b.getNome() + ".dat"));
				System.out.println(b);
				objGravar.writeObject(b);
			}
			objGravar.close();
		}catch (IOException ioe) {
			JOptionPane.showMessageDialog(null, "Problemas:" + ioe.getMessage());
		}*/
	
	
}
}