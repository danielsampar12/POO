
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Marcel
 */
public class Exercicio03 {
    public static void main(String[] args){
    	// ler o valor da chave
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Qual a chave da criptografia? Valor inteiro (0-255):"));
        
        // selecionar o arquivo de leitura
        JFileChooser jfc = new JFileChooser();
        int returnVal = jfc.showOpenDialog(null);
        // testando se o usuário clicou em Abrir/OK
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            try {
            	// gerar o novo nome
                String novoNome = file.getAbsolutePath().toString();
                int ponto = novoNome.lastIndexOf('.');
                if (ponto == -1) { // não há ponto na String
                	ponto = novoNome.length();
                }
                novoNome = novoNome.substring(0, ponto)+"-saida"+novoNome.substring(ponto);
                System.out.println("Será gerado o arquivo "+novoNome);
                
                // abrir o arquivo de entrada e de saída
                FileReader entrada = new FileReader(file);
                FileWriter saida = new FileWriter(novoNome);
                // poderia ter usado BufferedReader e BufferedWriter para otimizar a leitura/gravação.
                // Apenas daria mais velocidade. O código a seguir continuaria o mesmo.
                
                // leitura, criptografia e gravação do conteúdo
                int lido = entrada.read();
                int criptografado;
                while (lido != -1) {   // -1 indica fim de arquivo
                    criptografado = converte(lido,chave);
                    System.out.println((char)lido + " - "+lido+ " -> "+(char)criptografado + " - "+criptografado);
                    saida.write(criptografado);
                    lido = entrada.read();
                }
                // fechar os arquivos
                entrada.close();
                saida.close();
            } catch (FileNotFoundException fnfe){
                System.out.println("Arquivo de entrada não encontrado");
            } catch (IOException ex) {
              System.out.println("Erro na leitura do arquivo "+file.getAbsolutePath());
            }
        } else {
            System.out.println("Usuário cancelou a operação.");
        }

    }
    public static int converte(int recebido,int chave){
        /*if (recebido+chave > 255){
            return recebido+chave-256;
        }
        else{
            return recebido+chave;
        } */
        // mais elegante:
        return ((recebido + chave) % 256);
    }
    
}
