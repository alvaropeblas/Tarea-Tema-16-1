/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea.tema.pkg16.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDAC
 */
public class EditorDeArchivo extends javax.swing.JFrame {

    private String ruta = null;

    /**
     * Creates new form EditorDeArchivo
     */
    public EditorDeArchivo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPanelPrincipal = new javax.swing.JPanel();
        lResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfTextoArchivo = new javax.swing.JTextArea();
        lNombreArchivo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAbrirArchivo = new javax.swing.JMenuItem();
        jmGuadarArchivo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmContarPalabras = new javax.swing.JMenuItem();
        jmContarCaracteres = new javax.swing.JMenuItem();
        jmContarLineas = new javax.swing.JMenuItem();
        jmContarVocales = new javax.swing.JMenuItem();
        jmContarConsonantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfTextoArchivo.setColumns(20);
        tfTextoArchivo.setRows(5);
        jScrollPane1.setViewportView(tfTextoArchivo);

        javax.swing.GroupLayout pPanelPrincipalLayout = new javax.swing.GroupLayout(pPanelPrincipal);
        pPanelPrincipal.setLayout(pPanelPrincipalLayout);
        pPanelPrincipalLayout.setHorizontalGroup(
            pPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNombreArchivo)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        pPanelPrincipalLayout.setVerticalGroup(
            pPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNombreArchivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jmAbrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmAbrirArchivo.setText("Cargar archivo");
        jmAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAbrirArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(jmAbrirArchivo);

        jmGuadarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmGuadarArchivo.setText("Guardar archivo");
        jmGuadarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuadarArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(jmGuadarArchivo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jmContarPalabras.setText("Contar palabras");
        jmContarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContarPalabrasActionPerformed(evt);
            }
        });
        jMenu2.add(jmContarPalabras);

        jmContarCaracteres.setText("Contar caracteres");
        jmContarCaracteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContarCaracteresActionPerformed(evt);
            }
        });
        jMenu2.add(jmContarCaracteres);

        jmContarLineas.setText("Contar lineas");
        jmContarLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContarLineasActionPerformed(evt);
            }
        });
        jMenu2.add(jmContarLineas);

        jmContarVocales.setText("Contar vocales");
        jmContarVocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContarVocalesActionPerformed(evt);
            }
        });
        jMenu2.add(jmContarVocales);

        jmContarConsonantes.setText("Contar consonantes");
        jmContarConsonantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContarConsonantesActionPerformed(evt);
            }
        });
        jMenu2.add(jmContarConsonantes);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Método que se ejecuta al hacer clic en el botón "Abrir Archivo" y muestra
     * un cuadro de diálogo para seleccionar un archivo.
     *
     * @param evt Objeto ActionEvent que se genera cuando se hace clic en el
     * botón "Abrir Archivo".
     * @return void
     */
    private void jmAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAbrirArchivoActionPerformed
        JFileChooser file = new JFileChooser();
        int resultado = file.showOpenDialog(null);
        ruta = null;
        if (resultado == JFileChooser.APPROVE_OPTION) {
            ruta = file.getSelectedFile().getAbsolutePath();
        }
        // Fichero del que queremos leer
        File fichero = new File(ruta);
        Scanner s = null;

        try {
            // Leemos el contenido del fichero

            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                tfTextoArchivo.setText(linea);
            }
            lNombreArchivo.setText(ruta);
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }//GEN-LAST:event_jmAbrirArchivoActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Guardar Archivo" y
     * guarda el contenido del campo de texto en un archivo seleccionado
     * previamente.
     *
     * @param evt Objeto ActionEvent que se genera cuando se hace clic en el
     * botón "Guardar Archivo".
     * @return void
     */
    private void jmGuadarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuadarArchivoActionPerformed
        String contenido = tfTextoArchivo.getText();

        FileWriter fichero = null;
        try {

            fichero = new FileWriter(ruta);

            // Escribimos linea a linea en el fichero
            fichero.write(contenido);

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }//GEN-LAST:event_jmGuadarArchivoActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Contar Palabras" y
     * cuenta el número de palabras en el contenido del campo de texto.
     *
     * @param evt Objeto ActionEvent que se genera cuando se hace clic en el
     * botón "Contar Palabras".
     * @return void
     */
    private void jmContarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContarPalabrasActionPerformed
        String linea = tfTextoArchivo.getText();
        lResultado.setText("Total de palabras: " + Integer.toString(linea.split("\\s+|\n").length));
    }//GEN-LAST:event_jmContarPalabrasActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Contar Caracteres" y
     * cuenta el número de caracteres en el contenido del campo de texto.
     *
     * @param evt Objeto ActionEvent que se genera cuando se hace clic en el
     * botón "Contar Caracteres".
     * @return void
     *
     */
    private void jmContarCaracteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContarCaracteresActionPerformed
        String texto = tfTextoArchivo.getText();
        long res = texto.chars().filter(ch -> ch != ' ').count();

        lResultado.setText("El numero total de caracteres es: " + Long.toString(res));

    }//GEN-LAST:event_jmContarCaracteresActionPerformed

    /**
     * Método que se ejecuta al hacer clic en el botón "Contar Lineas" y cuenta
     * el número de líneas en el contenido del campo de texto.
     *
     * @param evt Objeto ActionEvent que se genera cuando se hace clic en el
     * botón "Contar Lineas".
     * @return void
     */
    private void jmContarLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContarLineasActionPerformed
        String texto = tfTextoArchivo.getText();
        long res = 0;

        res = res + texto.lines().count();

        lResultado.setText("El numero total de lineas es: " + Long.toString(res));
    }//GEN-LAST:event_jmContarLineasActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Contar Vocales" y cuenta
     * el número de vocales en el contenido del campo de texto.
     *
     * @param evt Objeto ActionEvent que se genera cuando se hace clic en el
     * botón "Contar Vocales".
     * @return void
     */
    private void jmContarVocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContarVocalesActionPerformed
        String text = tfTextoArchivo.getText();
        lResultado.setText("El numero total de vocales es: " + Integer.toString(contarVocales(text)));
    }//GEN-LAST:event_jmContarVocalesActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Contar Consonantes" y
     * cuenta el número de consonantes en el contenido del campo de texto.
     *
     * @param Objeto ActionEvent que se genera cuando se hace clic en el botón
     * "Contar Consonantes".
     * @return void
     */
    private void jmContarConsonantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContarConsonantesActionPerformed
        String text = tfTextoArchivo.getText();

        lResultado.setText("El numero total de consonantes es: " + Integer.toString(contarConsonantes(text)));
    }//GEN-LAST:event_jmContarConsonantesActionPerformed

    /**
     * Método estático que cuenta el número de vocales en una cadena de texto.
     *
     * @param s Cadena de texto a analizar.
     * @return int Número total de vocales en la cadena de texto.
     */
    public static int contarVocales(String s) {
        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Método estático que cuenta el número de consonantes en una cadena de
     * texto.
     *
     * @param s Cadena de texto a analizar.
     * @return int Número total de consonantes en la cadena de texto.
     */
    public static int contarConsonantes(String s) {
        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c != 'A') && (c != 'a') && (c != 'E') && (c != 'e') && (c != 'I') && (c != 'i')
                    && (c != 'O') && (c != 'o') && (c != 'U') && (c != 'u') && (c != ' ')) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditorDeArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorDeArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorDeArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorDeArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorDeArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmAbrirArchivo;
    private javax.swing.JMenuItem jmContarCaracteres;
    private javax.swing.JMenuItem jmContarConsonantes;
    private javax.swing.JMenuItem jmContarLineas;
    private javax.swing.JMenuItem jmContarPalabras;
    private javax.swing.JMenuItem jmContarVocales;
    private javax.swing.JMenuItem jmGuadarArchivo;
    private javax.swing.JLabel lNombreArchivo;
    private javax.swing.JLabel lResultado;
    private javax.swing.JPanel pPanelPrincipal;
    private javax.swing.JTextArea tfTextoArchivo;
    // End of variables declaration//GEN-END:variables
}
