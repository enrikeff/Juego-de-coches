
package ProyectoJava_Enrique;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class Fin extends javax.swing.JFrame{

    public Fin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 90, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 260, 30));

        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 150, 50));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 141, 51));
        jLabel2.setText(" Nombre del participante");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 260, 30));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/40.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 850, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main V1 = new Main();
        V1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean errorIngresoVacio = true;
        String nom = jTextField1.getText();
        
        if((nom.equals(""))||(nom.equals("                Tu nombre será guardado ... "))){
            errorIngresoVacio = false;
        }
        
        if(errorIngresoVacio){
            try {
                Escribir(nom);
            } catch (IOException ex) {
               System.out.println("Fallo al pasar el nombre al metodo Escribir");
            }
            jTextField1.setText("                Tu nombre será guardado ... ");
            jTextField1.setEditable(false);
        }

    }//GEN-LAST:event_jButton2ActionPerformed


   public void Escribir(String nom) throws IOException{
       String nombre;
       nombre = nom;
        
        FileWriter fw = new FileWriter("FicheroProyecto.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
			
	FileReader fr = new FileReader("FicheroProyecto.txt");
	BufferedReader br = new BufferedReader(fr);

        File ft = new File("FicheroProyectoTem.txt");
        ft.createNewFile();
        File ft2 = new File("FicheroProyecto.txt");

        FileWriter fw2 = new FileWriter(ft);
        BufferedWriter bw2 = new BufferedWriter(fw2);

        FileReader fr2 = new FileReader(ft2);
        BufferedReader br2 = new BufferedReader(fr2);
        
        String N,N2,linea,linea2;
        int Nveces,Nveces2;
        boolean sw = false;
        
        
        while((linea=br.readLine())!=null){
            
            StringTokenizer st = new StringTokenizer(linea,",");
            while(st.hasMoreTokens()){
                    N = st.nextToken();
                    Nveces = Integer.parseInt(st.nextToken());
                if(nombre.equals(N)){
//                  bw.write(nombre + "," + Nveces);
                    sw = true;
                    
                    while((linea2=br2.readLine())!=null) {
                        StringTokenizer st2 = new StringTokenizer(linea2,",");
                                while(st2.hasMoreTokens()){
                                     N2 = st2.nextToken();
                                     Nveces2 = Integer.parseInt(st2.nextToken());
                                     if(nombre.equals(N2)){   
                                         Nveces2 = Nveces + 1;
                                         bw2.write(N2 + "," + Nveces2);
                                         bw2.newLine();
                                     } else {
                                        bw2.write(linea2);
                                        bw2.newLine();
                                     }
                                }
                    }
             }
               
          }
        }
        
        if(sw==false){
            Nveces=1;
            bw.write(nombre + "," + Nveces);
            bw.newLine();
        }
        
        bw2.close();
        fr2.close();
        fw2.close();
        br2.close();
        bw.close();
        br.close();
        fr.close();
        fw.close();
        
        if(sw){
            ft2.delete();
            ft.renameTo(ft2);
        }
        
//        fw.close();
        
   }

    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
