package aline.ufpb;
import  javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGui extends JFrame {
    public AgendaGui(){
        setTitle("Agenda de aniversario");
        setSize(400,200);
        setLocation(150,150); //localização da janela na tela
        setResizable(false);//janela não redimensionavel
        getContentPane().setBackground(Color.blue);

    }
    public static  void main(String []args){
        JFrame janela =  new AgendaGui();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
              System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
