/*
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.io.ObjectOutputStream;
 import javax.swing.JFileChooser;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates



 * and open the template in the editor.
 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author mfelipe
 */
public class Producao implements Validador{

    
    public static ArrayList<Editora> editoras = new ArrayList();
    public ArrayList<Autor> autores = new ArrayList();
    public ArrayList<Entidade> entidades = new ArrayList();
    public ArrayList<TipoDivulgacao> tipoDivulgacao = new ArrayList();
    public ArrayList<TipoMaterial> tipoMaterial = new ArrayList();
    public ArrayList<LocalPublicacao> localPublicacao = new ArrayList();
    
  

    public static void main(String[] args) throws Throwable {

        // Necessário correção! pois quando o .csv é lido ele não entende caracteres especiais
        JFileChooser j = new JFileChooser();
        int valor = j.showOpenDialog(null);

        if (valor == JFileChooser.APPROVE_OPTION) {
            File file = j.getSelectedFile();

            int i = 0;
            BufferedReader myBuffer = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), "UTF-8"));
            String linha = "";
            while ((linha = myBuffer.readLine()) != null) {
                 String[] GerarObjeto = linha.split(";");
                 Editora e = new Editora(GerarObjeto[11]);
                 if(e.verifica(e.getNmEditora()) == -1) {
                	 
                	 System.out.println("Repetido");
                	 System.out.println(e.getNmEditora());
                	 System.out.println(editoras.get(2).getNmEditora());
                	 e.finalize();
                 }else {
                	 e.add(e);
                	 
                	 System.out.println("Novo");
                	 System.out.println(e.getNmEditora());
                	 System.out.println(Integer.toString(e.getCdEditora()));
                	 
                 }
                 /*
                 System.out.println(e.getCdEditora());
                 System.out.println(e.getNmEditora());
               

                    
            	for(Editora e : editoras){
                   if(e.verifica(GerarObjeto[11]) == -1 ){
                       e.finalize();
                   }
                  Editora a = new Editora(GerarObjeto[11]);
               }*/
             

        }
            for(Editora a : editoras) {
            a.getCdEditora();
            a.getNmEditora();
           	 System.out.println(a.getNmEditora());
           	 System.out.println(a.getCdEditora());
            }
           
            
    }
        		

    }

    

	@Override
	public int verifica(String a) {
		
		return 0;
	}



	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void add(Editora e) {
		// TODO Auto-generated method stub
		
	}


}
