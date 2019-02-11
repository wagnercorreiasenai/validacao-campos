/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaojava;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import static javafx.scene.input.KeyCode.N;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CadastroCliente extends javax.swing.JPanel {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();

        //Popula a Combo Box
        comboSexo.addItem("Masculino");
        comboSexo.addItem("Feminino");
        comboSexo.addItem("Outro");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCadastro = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        cpTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        comboSexo = new javax.swing.JComboBox<>();
        labelSexo = new javax.swing.JLabel();
        cpCpf = new javax.swing.JFormattedTextField();

        labelCadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastro.setText("Cadastro de cliente");

        labelNome.setText("Nome:");

        cpNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpNomeKeyPressed(evt);
            }
        });

        labelCpf.setText("CPF:");

        labelTelefone.setText("Telefone:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"(selecione)"}));

        labelSexo.setText("Sexo:");

        try {
            cpCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpTelefone))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCadastro)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastro)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(cpCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSexo)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpNomeKeyPressed
        System.out.println("Você digitou: " + cpNome.getText());
    }//GEN-LAST:event_cpNomeKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO adxd your handling code here:
        if (this.validarCampos()) {
            JOptionPane.showMessageDialog(null,
                    "Campos preenchidos corretamente !");
            
            JOptionPane.showMessageDialog(null, comboSexo.getSelectedItem());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private boolean validarCampos() {

        CPFValidator validator = new CPFValidator();
        try {
            validator.assertValid(cpCpf.getText());
            
            String nome = cpNome.getText();
            if (nome.trim().equals("")) {
                JOptionPane.showMessageDialog(null, 
                    "Informe o nome!");
                return false;
            } else if (comboSexo.getSelectedItem().equals("(selecione)")) {
                JOptionPane.showMessageDialog(null, 
                    "Selecine o sexo!");
                return false;
            } else {
                return true;
            }
            
            // exception lançada quando o documento é inválido
        } catch (InvalidStateException e) { 
            JOptionPane.showMessageDialog(null, 
                    "O CPF informado é inválido! ");
            return false;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JFormattedTextField cpCpf;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpTelefone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefone;
    // End of variables declaration//GEN-END:variables
}
