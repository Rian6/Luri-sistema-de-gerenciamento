package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutoDAO extends Conexao{
    public void cadastrar (Produto produto) throws Exception {
        String sql = "INSERT INTO produto (nome,quantidade,preco,codigo) VALUES (?,?,?,?)";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            p.setString(1, produto.getNome());
            p.setInt(2, produto.getQuantidade());
            p.setString(3, produto.getPreco());
            p.setString(4, produto.getCodigo());
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
    }
        public void updateMais (int idproduto) throws Exception {
        String sql = "UPDATE produto SET quantidade = (select quantidade from produto  WHERE idproduto = "+idproduto+")+1 where idproduto="+idproduto+";";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
    }
    public void finalizarVenda (int idproduto,int removqt) throws Exception {
        String sql = "UPDATE produto SET quantidade = (select quantidade from produto  WHERE idproduto = "+idproduto+")-"+removqt+" where idproduto="+idproduto+";";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
    }
          public void updateMenos (int idproduto) throws Exception {
        String sql = "UPDATE produto SET quantidade = (select quantidade from produto  WHERE idproduto = "+idproduto+")-1 where idproduto="+idproduto+";";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
    }
    public String selectRetornoIdProduto(String nome) {
        
        String sql = "SELECT * FROM produto WHERE nome ='"+nome+"';";
        try{
        
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            ResultSet result = p.executeQuery();
      
            String id = null;
            
            while(result.next()){
            
            id= result.getString("idproduto");
            
            }
            p.close();
            return id;
            
        }catch(Exception e){}
        return null;
    }
    public ArrayList<Produto> select() {
        
        String sql = "select * from produto order by idproduto";
        try{
        
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            ResultSet result = p.executeQuery();
      
            ArrayList<Produto> produtos = new ArrayList<Produto>();
            
            while(result.next()){
            
            Produto produto= new Produto(result.getString("nome"),result.getInt("quantidade"),result.getString("preco"),result.getString("codigo"));
    
            produtos.add(produto);
            }
            p.close();
            return produtos;
            
        }catch(Exception e){}
    
    return null;
    }
     public ArrayList<Produto> select2() {
        
        String sql = "SELECT produto FROM produto";
        try{
        
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            ResultSet result = p.executeQuery();
      
            ArrayList<Produto> produtos = new ArrayList<Produto>();
            
            while(result.next()){
            
            Produto produto= new Produto(result.getString("nome"),result.getInt("quantidade"),result.getString("preco"),result.getString("codigo"));
    
            produtos.add(produto);
            }
            p.close();
            return produtos;
            
        }catch(Exception e){}
    
    return null;
    }
 

    void updateMaisDig(int idpreco,int dig) {
               String sql = "UPDATE produto SET quantidade = "+dig+" where idproduto="+idpreco+";";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
    }
    public ArrayList<Produto> select3(String barra) {
        
        String sql = "SELECT * FROM produto WHERE nome = '"+barra+"';";
        try{
        
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            ResultSet result = p.executeQuery();
      
            ArrayList<Produto> produtos = new ArrayList<Produto>();
            
            while(result.next()){
            
            Produto produto= new Produto(result.getString("nome"),result.getInt("quantidade"),result.getString("preco"),result.getString("codigo"));
    
            produtos.add(produto);
            }
            p.close();
            return produtos;
            
        }catch(Exception e){}
    
    return null;
    }
}

