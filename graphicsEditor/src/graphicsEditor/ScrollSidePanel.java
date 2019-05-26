/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor;

import static graphicsEditor.CanvasPanel.getScreenComponent;
import graphicsEditor.drawnShapes.DrawnRectangle;
import graphicsEditor.instruments.Tool;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author VADIM
 */
public class ScrollSidePanel extends javax.swing.JPanel {

    GEFrame frame;

    /**
     * Creates new form ScrollSidePanel
     */
    public ScrollSidePanel(GEFrame frame) {
        initComponents();
        setBackground(new Color(150, 200, 225));
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (frame.getCanvas().getTool() == Tool.PIPETTE) {
            Color color = new Color(getScreenComponent(this).getRGB(evt.getX(), evt.getY()));
            switch (frame.getCanvas().getPipetteChoice()) {
                case CanvasPanel.BRUSH_COLOR: {
                    frame.getCanvas().setBrushColor(color);
                    break;
                }
                case CanvasPanel.FILL_COLOR: {
                    frame.getCanvas().setFillColor(color);
                    break;
                }
                case CanvasPanel.BACKGROUND_COLOR: {
                    DrawnRectangle background = new DrawnRectangle(frame.getCanvas().getStroke(), color, color, 0, 0, CanvasPanel.WIDTH, CanvasPanel.HEIGHT);
                    frame.getCanvas().setBackgroundRectangle(background);
                    break;
                }
            }
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
