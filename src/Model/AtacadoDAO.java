package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AtacadoDAO extends Conexao{
        public void cadastrar (Atacado atacado) throws Exception {
        String sql = "INSERT INTO atacado (nome,cnpj,empresa) VALUES (?,?,?)";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            p.setString(1, atacado.getNome());
            p.setString(2, atacado.getCnpj());
            p.setString(3, atacado.getEmpresa());
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }

    }
     public ArrayList<Atacado> select(String barra) {
        
        String sql = "SELECT * FROM atacado WHERE nome like '%"+barra+"%';";
        try{
        
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            ResultSet result = p.executeQuery();
      
            ArrayList<Atacado> atacados = new ArrayList<Atacado>();
            
            while(result.next()){
            
            Atacado atacado= new Atacado(result.getString("nome"),result.getString("cnpj"),result.getString("empresa"));
            
            atacados.add(atacado);
            
            }
            p.close();
            return atacados;
            
        }catch(Exception e){}
    
    return null;
    }

}
