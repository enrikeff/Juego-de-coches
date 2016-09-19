
package ProyectoJava_Enrique;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Enriqueddd
 */
public class Ventana extends javax.swing.JFrame{ 
    
    int xMon1 = 500;
    int yMon1 = 200;

    int xMon2 = 1000;
    int yMon2 = 200;

    int xCoche = 0;
    int yCoche = 270;

    // xMonster 500        yMonster 150 - 360 
    // xMonster2 1000      yMonster2 150 - 360
    // xCoche 15 - 1545    yCoche 270
    
    
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null); 
        H1();H2();
    }
    
    public void Cerrar(){
        this.dispose();
    }
    
    public void AbrirChoque(){
        Choque VC = new Choque();
        VC.setVisible(true);
    }
    
  public void H1(){
      Thread hilo1 = new Thread(){
        public void run() {
        try {
            boolean sw = true;
            do{                
                while (yMon1<360) {                    
                    Thread.sleep(200);
                    yMon1+=10;
                    jBMonster.setLocation(xMon1, yMon1);
                    if((yCoche>200)&&(yCoche<360)&&(yMon1>200)&&(yMon1<360)&&(xCoche>284)&&(xCoche<600)){      
                        Cerrar();
                        AbrirChoque();
                        sw=false;
                        break;
                    }

//                    System.out.println("xMon2->" + xMon2 + " yMon2->" + yMon2);
//                    System.out.println("xModn1->" + xMon1 + " yMon1->" + yMon1);   
                }
                
                if(sw==false){
                    break;
                }
                
                while (yMon1>150) {                    
                    Thread.sleep(200);
                    yMon1-=10;
                    jBMonster.setLocation(xMon1, yMon1);
                    if((yCoche>200)&&(yCoche<360)&&(yMon1>200)&&(yMon1<360)&&(xCoche>284)&&(xCoche<600)){
                          Cerrar();
                          AbrirChoque();
                          sw=false;
                          break;
                    }
//                    System.out.println("xMon2->" + xMon2 + " yMon2->" + yMon2);
//                    System.out.println("xMon1->" + xMon1 + " yMon1->" + yMon1);
                }    
            }while (sw);
        } catch (Exception e) {
            System.out.println("Error");
        }
      }
  };
      hilo1.start();
 }
  
  
    public void H2(){
      Thread hilo2 = new Thread(){
        public void run() {
        try {
            boolean sw = true;
                do{                
                while (yMon2<360) {                    
                    Thread.sleep(150);
                    yMon2+=10;
                    jBMonster2.setLocation(xMon2, yMon2);
                    if((yCoche>200)&&(yCoche<360)&&(yMon2>200)&&(yMon2<360)&&(xCoche>784)&&(xCoche<1100)){
                        Cerrar();
                        AbrirChoque();
                        sw=false;
                        break;
                    }
//                    System.out.println("xMon2->" + xMon2 + " yMon2->" + yMon2);
//                    System.out.println("xMon1->" + xMon1 + " yMon1->" + yMon1);   
                }
               
                if(sw==false){
                    break;
                }
                
                while (yMon2>150) {                    
                    Thread.sleep(150);
                    yMon2-=10;
                    jBMonster2.setLocation(xMon2, yMon2);
                    if((yCoche>200)&&(yCoche<360)&&(yMon2>200)&&(yMon2<360)&&(xCoche>784)&&(xCoche<1100)){
                        Cerrar();
                        AbrirChoque();
                        sw=false;
                        break;
                    }
//                    System.out.println("xMon2->" + xMon2 + " yMon2->" + yMon2);
//                    System.out.println("xMon1->" + xMon1 + " yMon1->" + yMon1);
                }
            } while (sw); 
        } catch (Exception e) {
            System.out.println("Error");
        }
      }
  };
      hilo2.start();
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBMonster = new javax.swing.JButton();
        jBMonster2 = new javax.swing.JButton();
        jBCoche = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBMonster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/4.gif"))); // NOI18N
        jBMonster.setContentAreaFilled(false);
        getContentPane().add(jBMonster, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 100, 90));

        jBMonster2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/4.gif"))); // NOI18N
        jBMonster2.setContentAreaFilled(false);
        getContentPane().add(jBMonster2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, 100, 90));

        jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/3.png"))); // NOI18N
        jBCoche.setContentAreaFilled(false);
        jBCoche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCocheKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBCocheKeyReleased(evt);
            }
        });
        getContentPane().add(jBCoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 240, 120));

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setText("   NIVEL 1");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 140, 50));

        jLabel3.setBackground(new java.awt.Color(255, 153, 51));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("   Pulsa A y D para moverte ");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 250, 50));

        jLabel2.setBackground(new java.awt.Color(255, 153, 51));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("   Haz click en el coche para empezar");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 340, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCocheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCocheKeyPressed
   
        if((evt.getKeyChar()=='a')||(evt.getKeyChar()=='A')){
            xCoche = xCoche - 15;
            jBCoche.setLocation(xCoche, yCoche);
            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/1.gif")));
          //System.out.println("xCoche->" + xCoche + " yCoche->" + yCoche);
        }

        if((evt.getKeyChar()=='d')||(evt.getKeyChar()=='D')){
            xCoche = xCoche + 15;
            jBCoche.setLocation(xCoche, yCoche);
            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/2.gif")));
          //System.out.println("xCoche->" + xCoche + " yCoche->" + yCoche);
        }
        
        if(xCoche>1320){
            Ventana2 V2 = new Ventana2();
            V2.setVisible(true);
            this.dispose();
        }
        
        if(xCoche<15){
            xCoche=0;
            yCoche=270;
            jBCoche.setLocation(xCoche, yCoche);
            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/3.png"))); 
        }
               
    }//GEN-LAST:event_jBCocheKeyPressed

    private void jBCocheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCocheKeyReleased
        if((evt.getKeyChar()=='a')||(evt.getKeyChar()=='d')){
            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/3.png")));
        }
         
    }//GEN-LAST:event_jBCocheKeyReleased


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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCoche;
    private javax.swing.JButton jBMonster;
    private javax.swing.JButton jBMonster2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables




}

       // int derecha = jBCoche.getX();
//        int izquierda = jBCoche.getY();
//     
//        if(evt.getKeyChar()=='w'){
//            izquierda = izquierda - 5;
//            jBCoche.setLocation(derecha, izquierda);
//            //jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJ/1p.png")));
//        }
//
//        if(evt.getKeyChar()=='s'){
//            izquierda = izquierda + 5;
//            jBCoche.setLocation(derecha, izquierda); 
//            //jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJ/1p.png")));
//        }
//        
//        if(evt.getKeyChar()=='a'){
//            derecha = derecha - 5;
//            jBCoche.setLocation(derecha, izquierda);
//            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJ/1_i.png")));
//        }
//
//        if(evt.getKeyChar()=='d'){
//            derecha = derecha + 5;
//            jBCoche.setLocation(derecha, izquierda);
//            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJ/1_d.png")));
//                    
//        }

//        int x,y;
//        x = MiCoche.CoordX();
//        y = MiCoche.CoordY();
//        
//        String Direc="";
//        switch(evt.getKeyCode()){
//            case KeyEvent.VK_LEFT:
//                x = x - 10;
//                Direc="/ProyectoJ/1_i.png";
//                break;
//            case KeyEvent.VK_RIGHT:
//                x = x + 10;
//                Direc="/ProyectoJ/1_d.png";
//                break;         
//            case KeyEvent.VK_UP:
//                y = y - 10;
//                Direc="/ProyectoJ/1.png";
//                break;
//            case KeyEvent.VK_DOWN:
//                y = y + 10;
//                Direc="/ProyectoJ/1.png";
//                break;
//        }
//       
//        MiCoche.Dibujar_Coche(jPanel1.getGraphics(), x, y, Direc);
//
