package Conexao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
public class ParametroArquivo {
    
    public void Escrever(int tam, String coisas[],String nome) throws IOException {
    FileWriter arq = new FileWriter(nome+".bin");
    PrintWriter gravarArq = new PrintWriter(arq);

    for(int i=0;i<tam;i++){
    gravarArq.printf(coisas[i]+"\n");
    }
    
    arq.close();
  }
    public String lerTudo(String nomeArquivo){
        
    String nome = nomeArquivo;
     String contArq = "";
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine();
     
      for (int i=0;linha != null;i++) {
        contArq = contArq+linha+"<br>";
        linha = lerArq.readLine();
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
        
  return contArq;
    }
    public String[] ler(String nomeArquivo, int tam){
        String contArq[] = new String[tam];
    String nome = nomeArquivo;
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine();
      
      for (int i=0;linha != null;i++) {
        contArq[i]=linha;
        linha = lerArq.readLine();
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
  return contArq;
    }
    public void escreverSemApagar(String nome,String conteudo[]){
    try(FileWriter fw = new FileWriter(nome, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    for(int i=0;i<conteudo.length;i++){
    if(i<2){
        out.print(conteudo[i]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        }else{
        out.print(conteudo[i]);
    } 
    }
    out.println();
} catch (IOException e) {
    // exceção
}
    }
    
  public String lerTudoSemQuebrarLinha(String nomeArquivo){
        
    String nome = nomeArquivo;
     String contArq = "";
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine();
     
      for (int i=0;linha != null;i++) {
        contArq = contArq+linha;
        linha = lerArq.readLine();
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
        
  return contArq;
    }
}
