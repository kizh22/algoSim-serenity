package GUI;


import GUI.GUI;
import GUI.graphIO.graphIO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * start.java
 *
 * Created on 14-Mar-2012, 13:04:54
 */
/**
 * @deprecated 
 * @author tab00u
 */
public class start extends javax.swing.JFrame {

    private static final long serialVersionUID = 28864l;
    Image img;

    /**
     * Creates new form start
     */
    public start() {
        initComponents();
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        cmb_AlgoType.setBackground(Color.white);
        cmb_GraphMode.setBackground(Color.white);
        cmb_ControlType.setBackground(Color.white);
        cmb_NodeType.setBackground(Color.white);
        cmb_GraphMode.setEnabled(false);
        this.setResizable(false);
        this.setLocation((screensize.width / 2) - (this.getWidth() / 2), (screensize.height / 2) - (this.getHeight() / 2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Hold = new javax.swing.JPanel();
        cmb_AlgoType = new javax.swing.JComboBox();
        cmb_ControlType = new javax.swing.JComboBox();
        lbl_AlgoType = new javax.swing.JLabel();
        lbl_InputMethod = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_GraphMode = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmb_NodeType = new javax.swing.JComboBox();
        btn_Start = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algorithm Simulator");
        img = new javax.swing.ImageIcon(getClass().getResource("/img/logo.png")).getImage();
        setIconImage(img);

        pnl_Hold.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmb_AlgoType.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Prims Algorithm", "Kruskals Algorithm", "Dijkstras Algorithm"}));
        cmb_AlgoType.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_AlgoTypeActionPerformed(evt);
            }
        });

        cmb_ControlType.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Numpad", "Voice Recog."}));
        cmb_ControlType.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ControlTypeActionPerformed(evt);
            }
        });

        lbl_AlgoType.setText("Algorithm Mode:");

        lbl_InputMethod.setText("Input Method:");

        jLabel3.setText("Graph Mode:");

        cmb_GraphMode.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Directed, Weighted Graph", "Undirected, Weighted Graph"}));
        cmb_GraphMode.setSelectedIndex(1);
        cmb_GraphMode.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_GraphModeActionPerformed(evt);
            }
        });

        jLabel1.setText("Node Type:");

        cmb_NodeType.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Automatic Size (72px)", "Recognised Size"}));
        cmb_NodeType.setSelectedIndex(1);
        cmb_NodeType.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_NodeTypeActionPerformed(evt);
            }
        });

        btn_Start.setText("Start!");
        btn_Start.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartActionPerformed(evt);
            }
        });

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Load.setText("Load");
        btn_Load.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new graphIO(img);
            }
        });

        javax.swing.GroupLayout pnl_HoldLayout = new javax.swing.GroupLayout(pnl_Hold);
        pnl_Hold.setLayout(pnl_HoldLayout);
        pnl_HoldLayout.setHorizontalGroup(
                pnl_HoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_HoldLayout.createSequentialGroup().addContainerGap().addGroup(pnl_HoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(cmb_NodeType, javax.swing.GroupLayout.Alignment.LEADING, 0, 257, Short.MAX_VALUE).addComponent(lbl_AlgoType, javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbl_InputMethod, javax.swing.GroupLayout.Alignment.LEADING).addComponent(cmb_ControlType, javax.swing.GroupLayout.Alignment.LEADING, 0, 257, Short.MAX_VALUE).addComponent(cmb_AlgoType, javax.swing.GroupLayout.Alignment.LEADING, 0, 257, Short.MAX_VALUE).addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING).addComponent(cmb_GraphMode, javax.swing.GroupLayout.Alignment.LEADING, 0, 257, Short.MAX_VALUE).addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING).addGroup(pnl_HoldLayout.createSequentialGroup().addComponent(btn_Reset).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE).addComponent(btn_Start))).addContainerGap()));
        pnl_HoldLayout.setVerticalGroup(
                pnl_HoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(pnl_HoldLayout.createSequentialGroup().addContainerGap().addComponent(lbl_AlgoType).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cmb_AlgoType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lbl_InputMethod).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cmb_ControlType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cmb_GraphMode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cmb_NodeType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnl_HoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(btn_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE).addComponent(btn_Start, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)).addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnl_Hold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnl_Hold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartActionPerformed
        // TODO add your handling code here:
        //new GUI(new Graph(), algoMode, graphmode, inputmode, ndeType, img);
    }//GEN-LAST:event_btn_StartActionPerformed

    private void cmb_AlgoTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_AlgoTypeActionPerformed
        //  0 = prims, 1 = kruskals, 2 = dijkstras
        int i = cmb_AlgoType.getSelectedIndex();
        cmb_GraphMode.setEnabled(true);
        cmb_GraphMode.setSelectedIndex(1);
        switch (i) {
            case 0:
                algoMode = GUI.algoType.prims;
                cmb_GraphMode.setEnabled(false);
                cmb_GraphMode.setSelectedIndex(1); // set the index of this to become Undirected - Weighted
                break;
            case 1:
                cmb_GraphMode.setEnabled(false);
                cmb_GraphMode.setSelectedIndex(1); // set the index of this to become Undirected - Weighted
                algoMode = GUI.algoType.kruskals;
                break;
            case 2:
                algoMode = GUI.algoType.dijkstras;
                break;
            default:
                break;
        }

    }//GEN-LAST:event_cmb_AlgoTypeActionPerformed

    private void cmb_ControlTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ControlTypeActionPerformed
        // 0 = Numpad, 1 = Voice
        int i = cmb_ControlType.getSelectedIndex();
        switch (i) {
            case 0:
                inputmode = GUI.inputType.numpad;
                break;
            case 1:
                inputmode = GUI.inputType.voice;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmb_ControlTypeActionPerformed

    private void cmb_GraphModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_GraphModeActionPerformed
        // 0 = dw, 1 = uw, 2 = duw, 3 = uuw
        int i = cmb_GraphMode.getSelectedIndex();
        switch (i) {
            case 0:
                graphmode = GUI.graphType.dw;
                break;
            case 1:
                graphmode = GUI.graphType.uw;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmb_GraphModeActionPerformed

    private void cmb_NodeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_NodeTypeActionPerformed
        // 1 = recog, 0 = std
        int i = cmb_NodeType.getSelectedIndex();
        switch (i) {
            case 0:
                ndeType = GUI.nodeType.std;
                break;
            case 1:
                ndeType = GUI.nodeType.recog;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmb_NodeTypeActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        // TODO add your handling code here:
        cmb_AlgoType.setSelectedIndex(0);
        cmb_ControlType.setSelectedIndex(0);
        cmb_GraphMode.setSelectedIndex(1);
        cmb_NodeType.setSelectedIndex(1);
    }//GEN-LAST:event_btn_ResetActionPerformed

    /**
     * @param args the command line arguments
     *
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new start().setVisible(true);
            }
        });
    }//*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn_Reset;
    private JButton btn_Start;
    private JButton btn_Load = new JButton();
    private javax.swing.JComboBox cmb_AlgoType;
    private javax.swing.JComboBox cmb_ControlType;
    private javax.swing.JComboBox cmb_GraphMode;
    private javax.swing.JComboBox cmb_NodeType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_AlgoType;
    private javax.swing.JLabel lbl_InputMethod;
    private javax.swing.JPanel pnl_Hold;
    // End of variables declaration//GEN-END:variables
    private GUI.algoType algoMode = GUI.algoType.prims;
    private GUI.nodeType ndeType = GUI.nodeType.recog;
    private GUI.graphType graphmode = GUI.graphType.uw;
    private GUI.inputType inputmode = GUI.inputType.numpad;
}
