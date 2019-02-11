package validacaojava;

import com.sun.glass.events.DndEvent;
import javax.swing.JFrame;

public class ValidacaoJava {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de cliente");
        CadastroCliente painelCadastro = new CadastroCliente();
        
        frame.setSize(500, 500);
        frame.add(painelCadastro);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}