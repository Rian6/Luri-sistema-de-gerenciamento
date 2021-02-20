package Conexao;
import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class IconeNotificacaoWindows {
    
    PopupMenu popup;
    TrayIcon trayIcon;
        
    public void menssagem(String usuario){
    trayIcon.displayMessage("Luri - SG",usuario,TrayIcon.MessageType.INFO);
    }
    public void chamada() {       
    if (SystemTray.isSupported()) {
    SystemTray tray = SystemTray.getSystemTray();
    Image image = Toolkit.getDefaultToolkit().getImage("Tray1.png");

    popup = new PopupMenu("Menu de Opções");
    trayIcon = new TrayIcon(image, "Luri - sg", popup);
    
    MouseListener mouseListener = new MouseListener() {
        public void mouseClicked(MouseEvent e) {   
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
        public void mousePressed(MouseEvent e) { 
        }
        public void mouseReleased(MouseEvent e) {
        }
    };
    
    ActionListener exitListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Saindo...");
            JOptionPane.showMessageDialog(null,"Saindo...");
            System.exit(0);
        }
    };

    ActionListener mostramsglistener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Java 6 é uma revolução.");
        }
    };
    MenuItem mostramsg = new MenuItem("Exibir Mensagem");
    MenuItem defaultItem = new MenuItem("Sair");
    
    mostramsg.addActionListener(mostramsglistener);
    defaultItem.addActionListener(exitListener);
    
    popup.add(mostramsg);

    popup.addSeparator();

    CheckboxMenuItem cheque1 = new CheckboxMenuItem("Ativar Plugins");
    popup.add(cheque1);

    CheckboxMenuItem cheque2 = new CheckboxMenuItem("Iniciar Minimizado");
    popup.add(cheque2);

    popup.addSeparator();

    PopupMenu popup2 = new PopupMenu("SubMenu de Opções");
    MenuItem mostramsg2 = new MenuItem("Item1");
    MenuItem mostramsg3 = new MenuItem("Item2");
    MenuItem mostramsg4 = new MenuItem("Item3");

    popup2.add(mostramsg2);
    popup2.add(mostramsg3);
    popup2.add(mostramsg4);
    popup.add(popup2);
    popup.addSeparator();
    popup.add(defaultItem);

int a;
    ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            trayIcon.displayMessage("Luri - SG",
                "",
                TrayIcon.MessageType.INFO);
        }
    };
  
    trayIcon.setImageAutoSize(true);
    trayIcon.addActionListener(actionListener);
    trayIcon.addMouseListener(mouseListener);
    try {
        tray.add(trayIcon);
    } catch (AWTException e) {
        System.err.println("Erro, TrayIcon não sera adicionado.");
    }
} else {
        JOptionPane.showMessageDialog(null,"recurso ainda não esta disponível pra o seu sistema");
        }
}
}