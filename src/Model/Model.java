
package Model;

import Conexao.ConectorLinux;
import Controller.ControlePrincipal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Model {
    ControlePrincipal c;
        
   /* public void cadastradoMSG(){
        final Conector shell = new Conector();
             try {
                shell.executeCommand("notify-send --icon='src/Imagens/sair.png\' 'Luri-SG' 'Cadastro efetuado com sucesso!'");
                    } catch (IOException ex) {
                    }
    }*/
    public boolean verificarlogin(String login, String senha) {
              c=new ControlePrincipal();
        
            String barra;
            String loginv="admin";
            String senhav="admin123";
            String nomev;
            int contv;  
        try{
            
          int i=0;
          UsuarioDAO usuarioDAO=new UsuarioDAO();
                while(i < usuarioDAO.select(login).size()) {

                    loginv =usuarioDAO.select(login).get(i).getLogin();
                    senhav =usuarioDAO.select(login).get(i).getSenha();
                    i++;
                }
                      }catch(NullPointerException e){
            }
              
        if (loginv.equals(login) && senhav.equals(senha)){
            return true;
        }else{
            return false;
        }
    }
        public void cadastrarAtacado(String nome,String cnpj,String empresa){
            try{
            AtacadoDAO atacadoDAO=new AtacadoDAO();

            Atacado atacado =new Atacado(nome,cnpj,empresa);
                atacadoDAO.cadastrar(atacado);
       //                 cadastradoMSG();
                JOptionPane.showMessageDialog(null,"Atacado: "+nome+" Cadastrado com sucesso!\n\n\nCNPJ: "+cnpj+"\nNome da empresa: "+empresa);         
              c = new ControlePrincipal();
                c.chamarTelaMenu();
            }catch(Exception e){
               
            }
        }
        public void cadastrarProduto(String nome,int quantidade,String preco,String codigo){
            try{
            ProdutoDAO produtoDAO=new ProdutoDAO();

            Produto produto =new Produto(nome,quantidade,preco,codigo);
                produtoDAO.cadastrar(produto);
         //       cadastradoMSG();
                JOptionPane.showMessageDialog(null,"Produto: "+nome+" Cadastrado com sucesso!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar");
            }
        }
        public void updateMais(int idquant){
            try{
            ProdutoDAO produtoDAO=new ProdutoDAO();

            Produto produto =new Produto();
                produtoDAO.updateMais(idquant);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar");
            }
        }
        public void finalizarVenda(int idquant,int removqt){
                    try{
            ProdutoDAO produtoDAO=new ProdutoDAO();

            Produto produto =new Produto();
                produtoDAO.finalizarVenda(idquant,removqt);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar");
            }
        
        }
        public String SelectRetornoIdProduto(String nome){
        
        ProdutoDAO p=new ProdutoDAO();
        return p.selectRetornoIdProduto(nome);
        }
        public void updateMenos(int idquant){
            try{
            ProdutoDAO produtoDAO=new ProdutoDAO();

            Produto produto =new Produto();
                produtoDAO.updateMenos(idquant);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar");
            }
        }
       public boolean verificarUsuarioExistente(){
       return true;
       }
        public void cadastrarUsuario(String nome,String login,String senha) throws Exception{
            try{
            UsuarioDAO usuarioDAO=new UsuarioDAO();

            Usuario usuario =new Usuario(nome,login,senha);
                usuarioDAO.cadastrar(usuario);
                
           //      cadastradoMSG();
                JOptionPane.showMessageDialog(null,"Usuario: "+nome+" Cadastrado com sucesso!\n\n\nLogin: "+login);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Usuario: "+nome+" Erro ao Cadastrar Usuario!");
            }
                c.chamarTelaMenu();
            }

    public void updateMaisdig(int idpreco,int dig) {
                            try{
            ProdutoDAO produtoDAO=new ProdutoDAO();

            Produto produto =new Produto();
                produtoDAO.updateMaisDig(idpreco,dig);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar");
            }
        }
    
    public void cadastrarFreezer(String status, String kwh, String nome, String tempo) throws Exception{
        FreezerDAO f=new FreezerDAO();
        Freezer freezer =new Freezer(status,kwh,nome,tempo);
        f.cadastrar(freezer);  
    }
    public void removerFreezer(String id) throws Exception{
        FreezerDAO f=new FreezerDAO();
        f.remover(id);  
    }
    public void ativarFreezer(int id) throws Exception{
        FreezerDAO f=new FreezerDAO();
        f.ativar(id);  
    }
    public void desativarFreezer(int id) throws Exception{
        FreezerDAO f=new FreezerDAO();
        f.desativar(id);  
    }
}
    

