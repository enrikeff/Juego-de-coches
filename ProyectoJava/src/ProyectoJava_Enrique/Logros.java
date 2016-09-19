
package ProyectoJava_Enrique;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Enrique
 */
public class Logros extends javax.swing.JFrame {

    public Logros() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            Lectura();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel1.setText(" LOGROS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/logros.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 170));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel3.setText("DE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, 30));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel4.setText("PARTICIPANTES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 190, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel5.setText("              HAN SUPERADO LOS DOS TRAMOS");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 380, 40));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel6.setText("     CORREDOR");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 130, 30));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel7.setText("      Nº VECES");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 130, 30));

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 110, 40));

        jScrollPane1.setViewportView(jList1);
        jList1.getAccessibleContext().setAccessibleParent(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 130, 200));

        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 130, 200));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        Main P = new Main();
        P.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Lectura() throws IOException{
        FileReader fr = new FileReader("FicheroProyecto.txt");
	BufferedReader br = new BufferedReader(fr);
        ArrayList<String> A = new ArrayList<String>();
        ArrayList<String> N = new ArrayList<String>();
               
        String nombre,linea;
        int Nveces;
                
            while((linea=br.readLine())!= null){
                StringTokenizer st = new StringTokenizer(linea,",");
                    while(st.hasMoreTokens()){
                        nombre = st.nextToken();
                        Nveces = Integer.parseInt(st.nextToken());
//                        System.out.println("Nombre: " + nombre + " veces: " + Nveces);
                        A.add("    " + nombre );
                        N.add("          " + Nveces );

                    }
            }

    DefaultListModel<String> listModel = new DefaultListModel<String>();
    DefaultListModel<String> listModel2 = new DefaultListModel<String>();
    
    for(int i=0; i<A.size(); i++) {
            listModel.add(i, A.get(i));
    }
    for(int i=0; i<N.size(); i++) {
            listModel2.add(i, N.get(i));
    }

    jList1.setModel(listModel);
    jList2.setModel(listModel2);


        br.close();
        fr.close();
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
