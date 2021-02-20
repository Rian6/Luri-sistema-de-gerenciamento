package Conexao;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class AdicionarFonte {
    public void instalar(String local){    
        try {
            Font novaFonte = Font.createFont(Font.TRUETYPE_FONT, new File(local)).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(local)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
    }
}
