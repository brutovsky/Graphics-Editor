/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author VADIM
 */
public class GEFrame extends javax.swing.JFrame {
    CanvasPanel canvas;
    ToolbarPanel toolbar;
    ScrollSidePanel scrollside;

    /**
     * Creates new form GEFrame
     */
    public GEFrame() {
        initComponents();
        getContentPane().setBackground(Color.getHSBColor(204, 243, 166));
        canvas = new CanvasPanel();
        toolbar = new ToolbarPanel();
        scrollside = new ScrollSidePanel();
        JScrollPane scrollCanvas = new JScrollPane(canvas);
        /*for(int i =0;i< 100;i++){
            Label label = new Label("        ");
            canvas.add(label);
        }*/ //TEST
        
        add(scrollCanvas,BorderLayout.CENTER);
        add(toolbar,BorderLayout.PAGE_START);
        add(scrollside,BorderLayout.EAST);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphics Editor");
        setBackground(new java.awt.Color(204, 243, 166));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GEFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
