package Controller;

import Conexao.*;
import Model.*;
import java.awt.EventQueue;
import javax.swing.*;
import java.io.*; 
import java.util.*;
import java.util.logging.*;
import view.*;

public class ControlePrincipal {
     File imagem;
             
     TelaMenu telaMenu;
     TelaInicio telaInicio;
     TelaLoginUsuario telaLoginUsuario;
     TelaVendas telaVendas;
     TelaCadastroUsuario telaCadastrarUsuario;
     TelaControleEstoque telaControleEstoque;
     TelaAtacado telaAtacado;
     TelaCadastrarAtacado telaCadastroAtacado;
     TelaPesquisarAtacado telaPesquisaAtacado; 
     TelaEditarEstoque telaEditarEstoque;
     TelaGastos telaGastos;
     TelaCarregamento telaCarregamento;
     TelaCarregamento1 telaCarregamento1;
     TelaGerarGrafico fORMParamCustoMes;
     TelaHistoricoVendas telaHistoricoVendas;
     Usuario usuario;
     TelaControleFreezers telaControleFreezers;
     int cont;
     
     AdicionarFonte fonte;
     ParametroArquivo g;
     Model m;
     
    IconeNotificacaoWindows conw;
     
    public void Iniciar(){
        fonte=new AdicionarFonte();
        fonte.instalar("Fontes/Fipps-Regular.otf");
        fonte.instalar("Fontes/slkscr.ttf");
        
        telaInicio = new TelaInicio();
        telaCarregamento = new TelaCarregamento();
        telaCarregamento1 = new TelaCarregamento1();
        telaVendas=new TelaVendas();
        telaCadastrarUsuario=new TelaCadastroUsuario();
        telaControleEstoque=new TelaControleEstoque();
        telaPesquisaAtacado=new TelaPesquisarAtacado();
        telaCadastroAtacado=new TelaCadastrarAtacado();
        telaGastos=new TelaGastos();
        telaAtacado=new TelaAtacado();
        telaControleFreezers=new TelaControleFreezers();
       
        Model m=new Model();
        usuario=new Usuario();  
        
        cont=1;
        
        try{
            telaMenu.setControler(this);
            telaMenu.setVisible(false);
        }catch(NullPointerException e){
            
            telaMenu =new TelaMenu();
            
        }
        telaInicio.setControler(this);
        telaInicio.setVisible(true);              
                  
    }
    public void chamarTelaMenu(){
          telaGastos.setVisible(false);
          telaInicio.setVisible(false);
          telaVendas.setVisible(false);
          telaCadastrarUsuario.setVisible(false);
          telaControleEstoque.setVisible(false);
          telaAtacado.setVisible(false);
          telaCadastroAtacado.setVisible(false);
          telaPesquisaAtacado.setVisible(false);
          telaCarregamento.setVisible(false);  
          telaControleFreezers.setVisible(false);
          
    if(cont==1){      
          conw=new IconeNotificacaoWindows();
          conw.chamada();
          
          cont=0;
        final ConectorLinux shell = new ConectorLinux();
         try {
             
             shell.executeCommand("notify-send --icon='src/Imagens/sair.png\' 'Luri-SG' '"+usuario.getNome()+" Entrou'");
             
         } catch (java.io.IOException ex) {
             conw.menssagem(usuario.getNome()+" Entrou");
         }
    }
          telaMenu.setControler(this);
          telaMenu.setVisible(true); 
    }
    public boolean verificarUsuarioExistente(){
        
        return m.verificarUsuarioExistente();
    }
        public boolean Login(String login,String senha){
            m=new Model();
            
            usuario.setNome(login);
            telaMenu.setNome(usuario.getNome());
            telaVendas.setNome(usuario.getNome());
            
        if(m.verificarlogin(login,senha)){
          telaInicio.setVisible(false);
          
          chamarTelaMenu();  
          
          return true;
            
          }else{          
            return false;
        }
    }
    
    public void chamarTelaVendas(){
          telaMenu.setVisible(false);
          
          telaVendas.setControler(this);
          telaVendas.setVisible(true); 
    }
    public void chamarTelaControleFreezers(){
          telaMenu.setVisible(false);
          
          telaControleFreezers.setControler(this);
          telaControleFreezers.setVisible(true); 
    }
    public void chamarTelaCadastrarUsuario(){
           telaMenu.setVisible(false);
           
           telaCadastrarUsuario.setControler(this);
           telaCadastrarUsuario.setVisible(true); 
    }
    public void chamarTelaControleEstoque(){
           telaMenu.setVisible(false);
           
           telaControleEstoque.setControler(this);
           telaControleEstoque.setVisible(true);
    }
    public void chamarTelaAtacado(){
            telaMenu.setVisible(false);
           
           telaAtacado.setControler(this);
           telaAtacado.setVisible(true);
    }
    public void chamarTelaGastos(){ 

            telaMenu.setVisible(false);
            telaGastos.setControler(this);
            telaGastos.setVisible(true);

    }
    public void chamarTelaPesquisaAtacado(){
           telaAtacado.setVisible(false);
           
           telaPesquisaAtacado.setControler(this);
           telaPesquisaAtacado.setVisible(true);
    
    }
    public void chamarTelaCadastroAtacado(){
            telaAtacado.setVisible(false);
           
           telaCadastroAtacado.setControler(this);
           telaCadastroAtacado.setVisible(true);    
    }
    public void cadastrarAtacado(String nome,String cnpj,String empresa) throws Exception{
                m.cadastrarAtacado(nome, cnpj, empresa); 
                
            }
        public void cadastrarProduto(String nome,int quantidade,String produto,String codigo) throws Exception{
                m.cadastrarProduto(nome, quantidade, produto,codigo);  
            }
    public void cadastrarUsuario(String nome,String login,String senha) throws Exception{
                m.cadastrarUsuario(nome, login, senha);
            }

    public void updateMaisProdutoQuantidade(int idpreco) {
         m.updateMais(idpreco);
    }
    public String selectReturnoIdProduto(String nome){
       
        return m.SelectRetornoIdProduto(nome);
       }
    public void removerProdVenda(int id,int qt){
    m.finalizarVenda(id, qt);
    }
    public void updateMenosProdutoQuantidade(int idpreco) {
         m.updateMenos(idpreco);
    }
    public void updateMaisProdutoQuantidadeDig(int idpreco,int dig) {
        m.updateMaisdig(idpreco,dig);
    }
    
    public void chamarTelaEditarEstoque(String nome, int quantidade, String preco,String codigo){
        telaEditarEstoque = new TelaEditarEstoque(nome,quantidade,preco,codigo);
        telaEditarEstoque.setVisible(true);
        telaEditarEstoque.setControler(this);
    }
    
    public void chamarFORMParamCustoMes(){
        fORMParamCustoMes=new TelaGerarGrafico();
        fORMParamCustoMes.setVisible(true);
        fORMParamCustoMes.setControler(this);
    }

    public void chamarTelaSairEditarEstoque() {
        telaControleEstoque.setControler(this);
        telaEditarEstoque.setVisible(false);
    }

    public void gerarGraficoCustoPorMes() throws IOException {
        ConectorWindows shellw = new ConectorWindows();
        shellw.start("python graficoCustoPorMes.py");
        JOptionPane.showMessageDialog(null,"Grafico gerado!");
    }

    public void chamarParametroArquivo(int i, String meses[], String nome) throws IOException{
        g=new ParametroArquivo();
    
    try {
        g.Escrever(i, meses,nome);
    } catch (IOException ex) {
        Logger.getLogger(TelaGerarGrafico.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void setAbrirArquivo(File imagem){
        this.imagem=imagem;
    }
     public File getAbrirArquivo(){
        return this.imagem;
    }   
    public void chamarFORMParamCustoKwh() {
        fORMParamCustoMes=new TelaGerarGrafico();
        fORMParamCustoMes.setVisible(true);
        fORMParamCustoMes.setControler(this);
    }
    public void chamarTelaHistoricoVendas(){
        telaHistoricoVendas=new TelaHistoricoVendas();
        telaHistoricoVendas.setVisible(true);
        telaHistoricoVendas.setControler(this);  
    }
    
    public void cadastrarFreezer(String status, String kwh, String nome, String tempo) throws Exception{
        m.cadastrarFreezer(status, kwh, nome, tempo);
    }
    public void removerFreezer(String id) throws Exception{
        m.removerFreezer(id);
    }
    public void ativarFreezer(int id) throws Exception{
        m.ativarFreezer(id);
    }
    public void desativarFreezer(int id) throws Exception{
        m.desativarFreezer(id);
    }
}