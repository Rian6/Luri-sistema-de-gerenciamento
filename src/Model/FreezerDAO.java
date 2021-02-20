package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FreezerDAO extends Conexao{
        public void cadastrar (Freezer freezer) throws Exception {
        String sql = "INSERT INTO freezer (nome,kwh,status,tempo) VALUES (?,?,?,?)";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            p.setString(1, freezer.getNome());
            p.setString(2, freezer.getKwh());
            p.setString(3, freezer.getStatus());
            p.setString(4, freezer.getTempo());
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
    }
        public ArrayList<Freezer> select() {
        
        String sql = "select * from freezer order by idfreezer";
        try{
        
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            ResultSet result = p.executeQuery();
      
            ArrayList<Freezer> freezers = new ArrayList<Freezer>();
            
            while(result.next()){
            
            Freezer freezer= new Freezer(result.getString("nome"),result.getString("kwh"),result.getString("status"),result.getString("tempo"));
    
            freezers.add(freezer);
            }
            p.close();
            return freezers;
            
        }catch(Exception e){}
    
    return null;
    }
    public void ativar(int idfreezer) {
               String sql = "UPDATE freezer SET status = 'ativo' where idfreezer="+idfreezer;
        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());
        }
    }
    public void desativar(int idfreezer) {
               String sql = "UPDATE freezer SET status = 'inativo' where idfreezer="+idfreezer;
        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());
        }
    }
        public void remover(String idfreezer) {
               String sql = "DELETE FROM freezer where nome='"+idfreezer+"'";
        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());
        }       
    }
}
