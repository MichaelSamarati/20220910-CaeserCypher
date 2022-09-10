package pkg20220910_caesercypher;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class GUI extends javax.swing.JFrame {
    
    ButtonGroup directionRadioGroup;
    ArrayList<Character> cs;
    ArrayList<Character> cl;
    
    public GUI() {
        
        

        
        initComponents();
        
        
        mainPanel.putClientProperty(FlatClientProperties.STYLE, "arc: 20");
        
        
        directionRadioGroup = new ButtonGroup();
        directionRadioGroup.add(forwardsDirectionRadioButton);
        directionRadioGroup.add(backwardsDirectionRadioButton);
        
        clear();
        
        cs = new ArrayList<>();
        insertCharacters(cs, "abcdefghijklmnopqrstuvwxyz");
        cl = new ArrayList<>();
        insertCharacters(cl, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        
        
//        ImageIcon icon = new ImageIcon("icon.png");
//        setIconImage(icon.getImage());
        setTitle("Caeser Cypher");
        setResizable(false);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputField = new javax.swing.JTextArea();
        forwardsDirectionRadioButton = new javax.swing.JRadioButton();
        backwardsDirectionRadioButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputField = new javax.swing.JTextArea();
        encryptButton = new javax.swing.JButton();
        offsetField = new javax.swing.JTextField();
        decryptButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputField.setColumns(20);
        inputField.setRows(5);
        jScrollPane1.setViewportView(inputField);

        forwardsDirectionRadioButton.setText("Forwards");

        backwardsDirectionRadioButton.setText("Backwards");

        outputField.setColumns(20);
        outputField.setRows(5);
        jScrollPane2.setViewportView(outputField);

        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(offsetField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forwardsDirectionRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backwardsDirectionRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offsetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forwardsDirectionRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backwardsDirectionRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear(){
        inputField.setText("");
        offsetField.setText("");
        outputField.setText("");
        offsetField.setText("3");
        forwardsDirectionRadioButton.setSelected(true);
    }
    
    private void insertCharacters(ArrayList<Character> arr, String s) {
        for (int k = 0; k <s.length(); k++) {
            arr.add(s.charAt(k));
        }
    }
    
    private char newCharacter(char c, int offset, boolean isForwards, ArrayList<Character> arr) {
        int size = arr.size();
        for (int k = 0; k <size; k++) {
            if (arr.get(k) == c) {
                int tmpOffset = isForwards?offset:-offset;
                return arr.get((k+size+tmpOffset)%size);
            }
        }
        return c;
    }

    private void perform(boolean isEncrypt){
        try{
            String in = inputField.getText();
            int offset = Integer.parseInt(offsetField.getText());
            boolean isForwards = forwardsDirectionRadioButton.isSelected();
            if(!isEncrypt){
                isForwards = !isForwards;
            }
            String out = "";
            for(int i = 0; i<in.length(); i++){
                char c = in.charAt(i);
                if(cs.contains(c)){
                    c = newCharacter(c, offset, isForwards, cs);
                }else if(cl.contains(c)){
                    c = newCharacter(c, offset, isForwards, cl);
                }       
                out += String.valueOf(c);
            }
            outputField.setText(out);
        }catch(Exception e){
            outputField.setText("Error occured!");
        }
    }
    
    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        perform(true);
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        perform(false);
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton backwardsDirectionRadioButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JRadioButton forwardsDirectionRadioButton;
    private javax.swing.JTextArea inputField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField offsetField;
    private javax.swing.JTextArea outputField;
    // End of variables declaration//GEN-END:variables
}
