
package ProyectoJava_Enrique;

/**
 *
 * @author Enrique
 */
public class Ventana2 extends javax.swing.JFrame {
    
    int xMon1 = 500;
    int yMon1 = 200;

    int xMon2 = 1300;
    int yMon2 = 200;
    
    int x4X41 = 900;
    int y4X41 = 200;
    
    int x4X42 = 1700;
    int y4X42 = 200;

    int xCoche = 0;
    int yCoche = 270;
    
    public Ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
        H1();H2();H3();H4();
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
                    Thread.sleep(210);
                    yMon1+=10;
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
                
                if(sw==false){
                    break;
                }
                
                while (yMon1>150) {                    
                    Thread.sleep(210);
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
                    Thread.sleep(160);
                    yMon2+=10;
                    jBMonster2.setLocation(xMon2, yMon2);
                    if((yCoche>200)&&(yCoche<360)&&(yMon2>200)&&(yMon2<360)&&(xCoche>1084)&&(xCoche<1400)){
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
                    Thread.sleep(160);
                    yMon2-=10;
                    jBMonster2.setLocation(xMon2, yMon2);
                    if((yCoche>200)&&(yCoche<360)&&(yMon2>200)&&(yMon2<360)&&(xCoche>1084)&&(xCoche<1400)){
                        Cerrar();
                        AbrirChoque();
                        sw=false;
                        break;
                    }
//                    System.out.println("xMon2->" + xMon2 + " yMon2->" + yMon2);
//                    System.out.println("xMon1->" + xMon1 + " yMon1->" + yMon1);
                }
            }while (sw) ;
        } catch (Exception e) {
            System.out.println("Error");
        }
      }
  };
      hilo2.start();
}
    
    
    public void H3(){
      Thread hilo3 = new Thread(){
        public void run() {
        try {
            boolean sw = true;
                do{                
                while (y4X41<340) {                    
                    Thread.sleep(160);
                    y4X41+=10;
                    jB4x41.setLocation(x4X41, y4X41);
                    if((yCoche>200)&&(yCoche<360)&&(y4X41>200)&&(y4X41<360)&&(xCoche>684)&&(xCoche<1000)){
                        Cerrar();
                        AbrirChoque();
                        sw=false;
                        break;
                    }
//                    System.out.println("x4X41->" + x4X41 + " y4X41->" + y4X41);
//                    System.out.println("xMon1->" + xMon1 + " yMon1->" + yMon1);   
                }
                
                if(sw==false){
                    break;
                }
                
                while (y4X41>130) {                    
                    Thread.sleep(160);
                    y4X41-=10;
                    jB4x41.setLocation(x4X41, y4X41);
                    if((yCoche>200)&&(yCoche<360)&&(y4X41>200)&&(y4X41<360)&&(xCoche>684)&&(xCoche<1000)){
                        Cerrar();
                        AbrirChoque();
                        sw=false;
                        break;
                    }
//                    System.out.println("x4X41->" + x4X41 + " y4X41->" + y4X41);
//                    System.out.println("xMon1->" + xMon1 + " yMon1->" + yMon1);
                }
            }while (sw);
        } catch (Exception e) {
            System.out.println("Error");
        }
      }
  };
      hilo3.start();
}
    
    
    public void H4(){
      Thread hilo4 = new Thread(){
        public void run() {
        try {
            Fin F = new Fin();
            boolean sw = true;
            do{                
                while (y4X42<340) {                    
                    Thread.sleep(140);
                    y4X42+=10;
                    jB4x42.setLocation(x4X42, y4X42);
                    if((yCoche>200)&&(yCoche<360)&&(y4X42>200)&&(y4X42<360)&&(xCoche>1484)&&(xCoche<1800)){
                        Cerrar();
                            if(xCoche<1665){
                                AbrirChoque();
                            }
                        sw=false;
                        break;
                    }
//                    System.out.println("xMon2->" + xMon2 + " yMon2->" + yMon2);
//                    System.out.println("xMon1->" + xMon1 + " yMon1->" + yMon1);   
                }
                
                if(sw==false){
                    break;
                }
                
                while (y4X42>130) {                    
                    Thread.sleep(140);
                    y4X42-=10;
                    jB4x42.setLocation(x4X42, y4X42);
                    if((yCoche>200)&&(yCoche<360)&&(y4X42>200)&&(y4X42<360)&&(xCoche>1484)&&(xCoche<1800)){
                        Cerrar();
                            if(xCoche<1665){
                            AbrirChoque();
                            }
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
      hilo4.start();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCoche = new javax.swing.JButton();
        jB4x41 = new javax.swing.JButton();
        jBMonster = new javax.swing.JButton();
        jBMonster2 = new javax.swing.JButton();
        jB4x42 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jBCoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 240, 110));

        jB4x41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/Imagen.gif"))); // NOI18N
        jB4x41.setContentAreaFilled(false);
        getContentPane().add(jB4x41, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 110, 110));

        jBMonster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/4.gif"))); // NOI18N
        jBMonster.setContentAreaFilled(false);
        getContentPane().add(jBMonster, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 100, 90));

        jBMonster2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/4.gif"))); // NOI18N
        jBMonster2.setContentAreaFilled(false);
        getContentPane().add(jBMonster2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 160, -1, -1));

        jB4x42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/Imagen.gif"))); // NOI18N
        jB4x42.setContentAreaFilled(false);
        getContentPane().add(jB4x42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 140, 110, 110));

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setText("        NIVEL 2");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 200, 50));

        jLabel2.setBackground(new java.awt.Color(255, 153, 51));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("    Llega al final para colarte el juego");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 20, 340, 50));

        jLabel3.setBackground(new java.awt.Color(255, 153, 51));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("   Haz click en el coche para empezar");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 340, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1890, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCocheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCocheKeyPressed
        
        if((evt.getKeyChar()=='a')||(evt.getKeyChar()=='A')){
            xCoche = xCoche - 15;
            jBCoche.setLocation(xCoche, yCoche);
            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/1.gif")));
//           System.out.println("xCoche->" + xCoche + " yCoche->" + yCoche);
        }

        if((evt.getKeyChar()=='d')||(evt.getKeyChar()=='D')){
            xCoche = xCoche + 15;
            jBCoche.setLocation(xCoche, yCoche);
            jBCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoJava_Enrique/2.gif")));
//           System.out.println("xCoche->" + xCoche + " yCoche->" + yCoche);
        }
       
        if(xCoche>1665){
            Fin VF = new Fin();
            VF.setVisible(true);
            Cerrar();  
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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB4x41;
    private javax.swing.JButton jB4x42;
    private javax.swing.JButton jBCoche;
    private javax.swing.JButton jBMonster;
    private javax.swing.JButton jBMonster2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
