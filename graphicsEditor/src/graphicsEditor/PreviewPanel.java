/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor;

import graphicsEditor.drawnShapes.DrawnCircle;
import graphicsEditor.drawnShapes.DrawnLine;
import graphicsEditor.drawnShapes.DrawnRectangle;
import graphicsEditor.drawnShapes.DrawnTriangle;
import graphicsEditor.instruments.Tool;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**Panel for previewing all tools
 *
 * @author VADYM NAKYTNIAK
 */
public class PreviewPanel extends javax.swing.JPanel {

    Tool tool;
    Stroke stroke;
    Color color;
    Color fillColor;

    /**
     * Creates new form PreviewPanel
     *
     * @param tool
     * @param stroke
     * @param color
     * @param fillColor
     */
    public PreviewPanel(Tool tool, Stroke stroke, Color color, Color fillColor) {
        initComponents();
        this.tool = tool;
        this.stroke = stroke;
        this.color = color;
        this.fillColor = fillColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(stroke);
        g2d.setColor(color);
        switch (tool) {
            case INSERT_PICTURE: {
                BufferedImage image;
                try {
                    image = (ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\icons\\insertPicture.png")));
                    g2d.drawImage(image, 5, 10, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Image insertPicture.png is not found", "Image is not foun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }

            case INSERT_TEXT: {
                BufferedImage image;
                try {
                    image = (ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\icons\\insertText.png")));
                    g2d.drawImage(image, 0, 20, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Image insertText.png is not found", "Image is not foun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
            case BRUSH: {
                g2d.draw(new DrawnLine(stroke, color, 40, 45, 55, 45));
                break;
            }
            case ERASER: {
                BufferedImage image;
                try {
                    image = (ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\icons\\eraser.png")));
                    g2d.drawImage(image, 10, 20, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Image eraser.png is not found", "Image is not foun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
            case PIPETTE: {
                BufferedImage image;
                try {
                    image = (ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\icons\\pipette.png")));
                    g2d.drawImage(image, 20, 10, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Image pipette.png is not found", "Image is not foun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
            case SHAPE_RECTANGLE: {
                DrawnRectangle rect = new DrawnRectangle(stroke, color, fillColor, 20, 20, 50, 50);
                if (fillColor != null) {
                    g2d.setColor(fillColor);
                    g2d.fill(rect);
                }
                g2d.setColor(color);
                g2d.draw(rect);
                break;
            }
            case SHAPE_CIRCLE: {
                DrawnCircle rect = new DrawnCircle(stroke, color, fillColor, 20, 20, 50, 50);
                if (fillColor != null) {
                    g2d.setColor(fillColor);
                    g2d.fill(rect);
                }
                g2d.setColor(color);
                g2d.draw(rect);
                break;
            }
            case SHAPE_TRIANGLE: {
                DrawnTriangle rect = new DrawnTriangle(stroke, color, fillColor, 20, 70, 45, 20, 70, 70);
                if (fillColor != null) {
                    g2d.setColor(fillColor);
                    g2d.fill(rect);
                }
                g2d.setColor(color);
                g2d.draw(rect);
                break;
            }
            case SHAPE_LINE: {
                DrawnLine rect = new DrawnLine(stroke, color, 20, 20, 70, 70);
                g2d.draw(rect);
                break;
            }
            case NO_TOOL: {
                break;
            }
            case CUT_OUT:{
                DrawnRectangle rect = new DrawnRectangle(new BasicStroke(1f), Color.red, null, 20, 20, 50, 50);
                g2d.setColor(rect.getColor());
                g2d.draw(rect);
                break;
            }
        }
    }

    public Tool getTool() {
        return tool;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public Color getColor() {
        return color;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public void update(Tool tool, Stroke stroke, Color color, Color fillColor) {
        this.tool = tool;
        this.stroke = stroke;
        this.color = color;
        this.fillColor = fillColor;
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(90, 90));
        setMinimumSize(new java.awt.Dimension(90, 90));
        setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
