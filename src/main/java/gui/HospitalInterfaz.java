/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import clases.*;


/**
 *
 * @author Keloc
 */
public class HospitalInterfaz extends javax.swing.JFrame {
    
    private Usuario currUser;
    private Principal principalP;
    private CitasPanel citasP;
    private ExpedientesPanel expedientesP;
    private EmergenciasPanel emergenciasP;
    private PacientesPanel pacientesP;

    private Image principalImage = new ImageIcon("src/main/resources/principalImg.png").getImage();
    private Image prestamoImage = new ImageIcon("src/main/resources/prestamoImg.png").getImage();
    private Image devolucionImage = new ImageIcon("src/main/resources/devolucionImg.png").getImage();
    private Image miembrosImage = new ImageIcon("src/main/resources/miembrosImg.png").getImage();
    private Image catalogoImage = new ImageIcon("src/main/resources/catalogoImg.png").getImage();
    private Image logsImage = new ImageIcon("src/main/resources/logsImg.png").getImage();
    private Image logoImage = new ImageIcon("src/main/resources/alejandria.jpg").getImage();
    
    private LoginPanel inicioSesion = new LoginPanel(this);
    public HospitalInterfaz() {
        initComponents();
        initStyles();
        
        ContentChange.changePanel(contentP, inicioSesion);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        citasBtn = new javax.swing.JButton();
        expedientesBtn = new javax.swing.JButton();
        emergenciasBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        principalBtn = new javax.swing.JButton();
        pacientesBtn = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menuOpciones = new javax.swing.JPanel();
        contenedorOpt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraP = new javax.swing.JPanel();
        textoL1 = new javax.swing.JLabel();
        contentP = new javax.swing.JPanel();
        textoL = new javax.swing.JLabel();

        citasBtn.setBackground(new java.awt.Color(189, 238, 252));
        citasBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        citasBtn.setForeground(new java.awt.Color(88, 135, 237));
        citasBtn.setText("Citas");
        citasBtn.setMaximumSize(new java.awt.Dimension(300, 150));
        citasBtn.setMinimumSize(new java.awt.Dimension(175, 75));
        citasBtn.setPreferredSize(new java.awt.Dimension(185, 75));
        citasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citasBtnMouseClicked(evt);
            }
        });

        expedientesBtn.setBackground(new java.awt.Color(189, 238, 252));
        expedientesBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        expedientesBtn.setForeground(new java.awt.Color(88, 135, 237));
        expedientesBtn.setText("Expedientes");
        expedientesBtn.setMaximumSize(new java.awt.Dimension(300, 150));
        expedientesBtn.setMinimumSize(new java.awt.Dimension(175, 75));
        expedientesBtn.setPreferredSize(new java.awt.Dimension(185, 75));
        expedientesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expedientesBtnMouseClicked(evt);
            }
        });

        emergenciasBtn.setBackground(new java.awt.Color(189, 238, 252));
        emergenciasBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        emergenciasBtn.setForeground(new java.awt.Color(88, 135, 237));
        emergenciasBtn.setText("Emergencias");
        emergenciasBtn.setMaximumSize(new java.awt.Dimension(300, 150));
        emergenciasBtn.setMinimumSize(new java.awt.Dimension(175, 75));
        emergenciasBtn.setPreferredSize(new java.awt.Dimension(185, 75));
        emergenciasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emergenciasBtnMouseClicked(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(189, 238, 252));
        salirBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(88, 135, 237));
        salirBtn.setText("Salir");
        salirBtn.setMaximumSize(new java.awt.Dimension(300, 150));
        salirBtn.setMinimumSize(new java.awt.Dimension(175, 75));
        salirBtn.setPreferredSize(new java.awt.Dimension(185, 75));
        salirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBtnMouseClicked(evt);
            }
        });

        principalBtn.setBackground(new java.awt.Color(189, 238, 252));
        principalBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        principalBtn.setForeground(new java.awt.Color(88, 135, 237));
        principalBtn.setText("Principal");
        principalBtn.setMaximumSize(new java.awt.Dimension(300, 150));
        principalBtn.setMinimumSize(new java.awt.Dimension(175, 75));
        principalBtn.setPreferredSize(new java.awt.Dimension(185, 75));
        principalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalBtnMouseClicked(evt);
            }
        });

        pacientesBtn.setBackground(new java.awt.Color(189, 238, 252));
        pacientesBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        pacientesBtn.setForeground(new java.awt.Color(88, 135, 237));
        pacientesBtn.setText("Pacientes");
        pacientesBtn.setMaximumSize(new java.awt.Dimension(300, 150));
        pacientesBtn.setMinimumSize(new java.awt.Dimension(150, 75));
        pacientesBtn.setPreferredSize(new java.awt.Dimension(185, 75));
        pacientesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacientesBtnMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(800, 500));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));
        menuPanel.setMinimumSize(new java.awt.Dimension(175, 500));
        menuPanel.setPreferredSize(new java.awt.Dimension(187, 500));

        menuOpciones.setBackground(new java.awt.Color(122, 218, 245));
        menuOpciones.setPreferredSize(new java.awt.Dimension(175, 500));

        contenedorOpt.setBackground(new java.awt.Color(189, 238, 252));
        contenedorOpt.setMaximumSize(new java.awt.Dimension(350, 600));
        contenedorOpt.setMinimumSize(new java.awt.Dimension(175, 300));
        contenedorOpt.setPreferredSize(new java.awt.Dimension(185, 300));
        contenedorOpt.setLayout(new javax.swing.BoxLayout(contenedorOpt, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout menuOpcionesLayout = new javax.swing.GroupLayout(menuOpciones);
        menuOpciones.setLayout(menuOpcionesLayout);
        menuOpcionesLayout.setHorizontalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorOpt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuOpcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuOpcionesLayout.setVerticalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorOpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        barraP.setBackground(new java.awt.Color(122, 218, 245));

        textoL1.setBackground(new java.awt.Color(88, 135, 237));
        textoL1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        textoL1.setForeground(new java.awt.Color(88, 135, 237));
        textoL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoL1.setText("MEDBAY SOFTWARE");

        javax.swing.GroupLayout barraPLayout = new javax.swing.GroupLayout(barraP);
        barraP.setLayout(barraPLayout);
        barraPLayout.setHorizontalGroup(
            barraPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoL1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        barraPLayout.setVerticalGroup(
            barraPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(textoL1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        contentP.setBackground(new java.awt.Color(255, 255, 255));
        contentP.setMinimumSize(new java.awt.Dimension(0, 0));
        contentP.setPreferredSize(new java.awt.Dimension(605, 360));
        contentP.setLayout(new java.awt.BorderLayout());

        textoL.setBackground(new java.awt.Color(88, 135, 237));
        textoL.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        textoL.setForeground(new java.awt.Color(88, 135, 237));
        textoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoL.setText("Simplificando procesos, salvando vidas");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentP, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoL, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(barraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(textoL)
                .addGap(18, 18, 18)
                .addComponent(barraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentP, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void citasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasBtnMouseClicked
        ContentChange.changePanel(contentP, citasP);
    }//GEN-LAST:event_citasBtnMouseClicked

    private void expedientesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expedientesBtnMouseClicked
        ContentChange.changePanel(contentP, expedientesP);
    }//GEN-LAST:event_expedientesBtnMouseClicked

    private void emergenciasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergenciasBtnMouseClicked
        ContentChange.changePanel(contentP, emergenciasP);
    }//GEN-LAST:event_emergenciasBtnMouseClicked

    private void principalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalBtnMouseClicked
        ContentChange.changePanel(contentP, principalP);
    }//GEN-LAST:event_principalBtnMouseClicked

    private void salirBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirBtnMouseClicked

    private void pacientesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacientesBtnMouseClicked
        ContentChange.changePanel(contentP, pacientesP);
    }//GEN-LAST:event_pacientesBtnMouseClicked
   

    private ImageIcon resizeImage(Image image, JLabel label){
        ImageIcon img = new ImageIcon(image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        return img;
    }
    
    private void initStyles(){
        textoL.putClientProperty( "FlatLaf.styleClass",  "h4");
        textoL.setFont(textoL.getFont().deriveFont(Font.ITALIC));
    }
    
    public void initContent(){
        this.principalP = new Principal(currUser.getRol());
        ContentChange.changePanel(contentP, principalP);
        contenedorOpt.add(principalBtn);
        switch(currUser.getRol()){
            case "MEDICO":
                this.expedientesP = new ExpedientesPanel(this);
                contenedorOpt.add(expedientesBtn);
                break;
            case "RECEPCIONISTA":
                this.citasP = new CitasPanel(this);
                this.emergenciasP = new EmergenciasPanel();
                contenedorOpt.add(citasBtn);
                contenedorOpt.add(emergenciasBtn);
                break;
            case "RECEPCIONISTA PERSONAL":
                this.citasP = new CitasPanel(this);
                this.emergenciasP = new EmergenciasPanel();
                this.pacientesP = new PacientesPanel(this);
                contenedorOpt.add(citasBtn);
                contenedorOpt.add(emergenciasBtn);
                contenedorOpt.add(pacientesBtn);
                break;
            default:
                break;
        }
        contenedorOpt.add(salirBtn);
    }

    public Usuario getCurrUser() {
        return currUser;
    }

    public void setCurrUser(Usuario usuario) {
        this.currUser = usuario;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraP;
    private javax.swing.JPanel bg;
    private javax.swing.JButton citasBtn;
    private javax.swing.JPanel contenedorOpt;
    private javax.swing.JPanel contentP;
    private javax.swing.JButton emergenciasBtn;
    private javax.swing.JButton expedientesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton pacientesBtn;
    private javax.swing.JButton principalBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel textoL;
    private javax.swing.JLabel textoL1;
    // End of variables declaration//GEN-END:variables
}