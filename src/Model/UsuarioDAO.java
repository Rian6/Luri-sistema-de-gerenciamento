package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO extends Conexao{
            public void cadastrar (Usuario usuario) throws Exception {
        String sql = "INSERT INTO usuario (nome,login,senha) VALUES (?,?,?)";

        try {
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            p.setString(1, usuario.getNome());
            p.setString(2, usuario.getLogin());
            p.setString(3, usuario.getSenha());
            
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
    }
    public ArrayList<Usuario> select(String barra) {
        
        String sql = "SELECT * FROM usuario WHERE login = '"+barra+"';";
        try{
        
            PreparedStatement p = this.getConnetcion().prepareStatement(sql);
            ResultSet result = p.executeQuery();
      
            ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
            
            while(result.next()){
            
            Usuario usuario= new Usuario(result.getString("nome"),result.getString("login"),result.getString("senha"));
    
            usuarios.add(usuario);
            }
            p.close();
            return usuarios;
            
        }catch(Exception e){}
    
    return null;
    }
}
