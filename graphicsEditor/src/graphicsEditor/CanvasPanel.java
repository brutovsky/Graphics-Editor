/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor;

import graphicsEditor.instruments.Tool;
import graphicsEditor.drawnShapes.DrawnRectangle;
import graphicsEditor.drawnShapes.DrawnTriangle;
import com.sun.webkit.ColorChooser;
import graphicsEditor.drawnShapes.Drawable;
import graphicsEditor.drawnShapes.DrawnCircle;
import graphicsEditor.drawnShapes.DrawnImage;
import graphicsEditor.drawnShapes.DrawnLine;
import graphicsEditor.drawnShapes.DrawnText;
import java.awt.AWTException;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Area;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Line;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.colorchooser.ColorChooserComponentFactory;

/**
 *
 * @author VADIM
 */
public class CanvasPanel extends JPanel {

    //GEFrame
    GEFrame frame;

    //Preferred size initially
    public static final int PREFERRED_WIDTH = 1700;
    public static final int PREFERRED_HEIGHT = 850;

    //Constants
    public static final int WIDTH = 1725;
    public static final int HEIGHT = 875;
    //Color aim for PIPETTE
    public static final int BRUSH_COLOR = 1;
    public static final int FILL_COLOR = 2;
    public static final int BACKGROUND_COLOR = 3;

    //PIPETTE choice
    private int pipetteChoice;

    //Booleans
    private boolean isMouseClicked;
    private boolean isMouseOnImage;
    private boolean isMouseOnText;

    //The list of all shapes to be drawn
    private ArrayList<Drawable> shapes;

    //The stack of the shapes in the bin
    private Stack<Drawable> bin;

    //Coordinates
    private float x1;
    private float y1;
    private float x2;
    private float y2;

    //Drawn shape
    private Drawable s;
    private DrawnImage image;
    private DrawnText text;

    //Background rectangle
    private DrawnRectangle background;

    //Colors
    private Color brushColor;
    private Color backgroundColor;
    private Color fillColor;

    //Stroke
    private Stroke stroke;

    //Tool
    private Tool tool;

    //Scale
    private float scale;

    //Varibles nitialization
    {
        tool = Tool.BRUSH;
        stroke = new BasicStroke(1f);
        scale = 1f;
        brushColor = Color.BLACK;
        backgroundColor = Color.WHITE;
        fillColor = null;
        background = new DrawnRectangle(stroke, backgroundColor, backgroundColor, 0, 0, WIDTH, HEIGHT);
        shapes = new ArrayList();
        shapes.add(background);
        bin = new Stack<>();
    }

    /**
     * Creates new form CanvasPanel
     */
    public CanvasPanel(GEFrame frame) {
        initComponents();
        this.frame = frame;
        setSize(PREFERRED_WIDTH, PREFERRED_HEIGHT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1690, 850));
        setMinimumSize(new java.awt.Dimension(1690, 850));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1690, 850));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if (isMouseClicked) {
            x2 = evt.getX() / scale;
            y2 = evt.getY() / scale;
            switch (tool) {
                case INSERT_PICTURE: {
                    image = new DrawnImage(image.getImage(), (int) x1, (int) y1);
                    break;
                }
                case INSERT_TEXT: {
                    setText(new DrawnText(text.getFont(), text.getText(), text.getColor(), (int) x1, (int) y1));
                    break;
                }
                case BRUSH: {
                    shapes.add(new DrawnLine(stroke, brushColor, x1, y1, x2, y2));
                    break;
                }
                case ERASER: {
                    shapes.add(new DrawnLine(stroke, backgroundColor, x1, y1, x2, y2));
                    break;
                }
                case PIPETTE: {

                    break;
                }
                case SHAPE_RECTANGLE: {
                    s = new DrawnRectangle(stroke, brushColor, fillColor, (int) x1, (int) y1, (int) x2 - (int) x1, (int) y2 - (int) y1);
                    repaint();
                    return;
                }
                case SHAPE_CIRCLE: {
                    s = new DrawnCircle(stroke, brushColor, fillColor, (int) x1, (int) y1, (int) x2 - (int) x1, (int) y2 - (int) y1);
                    repaint();
                    return;
                }
                case SHAPE_TRIANGLE: {
                    s = new DrawnTriangle(stroke, brushColor, fillColor, (int) x1, (int) y1, (int) x2, (int) y2, (int) x2, (int) y1);
                    repaint();
                    return;
                }
                case SHAPE_LINE: {
                    s = new DrawnLine(stroke, brushColor, (double) x1, (double) y1, (double) x2, (double) y2);
                    repaint();
                    return;
                }
                case NO_TOOL: {

                    break;
                }
            }
            repaint();
            x1 = x2;
            y1 = y2;
        }
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        isMouseClicked = true;
        x1 = evt.getX() / scale;
        y1 = evt.getY() / scale;
        switch (tool) {
            case INSERT_PICTURE: {
                isMouseOnImage = true;
                image = new DrawnImage(image.getImage(), (int) x1, (int) y1);
                break;
            }
            case INSERT_TEXT: {
                isMouseOnText = true;
                setText(new DrawnText(text.getFont(), text.getText(), text.getColor(), (int) x1, (int) y1));
                break;
            }
            case BRUSH: {
                shapes.add(new DrawnLine(stroke, brushColor, x1, y1, x1, y1));
                break;
            }
            case ERASER: {
                shapes.add(new DrawnLine(stroke, backgroundColor, x1, y1, x1, y1));
                break;
            }
            case PIPETTE: {
                if (getTool() == Tool.PIPETTE) {
                    Color color = new Color(getScreenComponent(this).getRGB(evt.getX(), evt.getY()));
                    switch (getPipetteChoice()) {
                        case CanvasPanel.BRUSH_COLOR: {
                            setBrushColor(color);
                            break;
                        }
                        case CanvasPanel.FILL_COLOR: {
                            setFillColor(color);
                            break;
                        }
                        case CanvasPanel.BACKGROUND_COLOR: {
                            DrawnRectangle background = new DrawnRectangle(frame.getCanvas().getStroke(), color, color, 0, 0, CanvasPanel.WIDTH, CanvasPanel.HEIGHT);
                            setBackgroundRectangle(background);
                            break;
                        }
                    }
                }
                break;
            }
            case SHAPE_RECTANGLE: {
                s = new DrawnRectangle(stroke, brushColor, fillColor, (int) x1, (int) y1, 5, 5);
                break;
            }
            case SHAPE_CIRCLE: {
                s = new DrawnCircle(stroke, brushColor, fillColor, (int) x1, (int) y1, 5, 5);
                break;
            }
            case SHAPE_TRIANGLE: {
                s = new DrawnTriangle(stroke, brushColor, fillColor, (int) x1, (int) y1, (int) x1 + 5, (int) y1 - 5, (int) x1 + 10, (int) y1);
                break;
            }
            case SHAPE_LINE: {
                s = new DrawnLine(stroke, brushColor, (double) x1, (double) y1, (double) x1, (double) y1);
                break;
            }
            case NO_TOOL: {

                break;
            }
        }
        repaint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        isMouseClicked = false;
        reset();
        repaint();
    }//GEN-LAST:event_formMouseReleased

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g;
        g2d.scale(scale, scale);
        g2d.setColor(brushColor);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        //DRAWING
        for (Drawable s : shapes) {
            if (s instanceof DrawnImage) {
                DrawnImage im = (DrawnImage) s;
                g2d.drawImage((BufferedImage) im.getImage(), im.getX(), im.getY(), null);
                continue;
            }
            if (s instanceof DrawnText) {
                DrawnText t = (DrawnText) s;
                Font current_font = g2d.getFont();
                g2d.setFont(t.getFont());
                g2d.setColor(t.getColor());
                g2d.drawString(t.getText(), t.getX(), t.getY());
                g2d.setColor(s.getColor());
                g2d.setFont(current_font);
                continue;
            }
            if (s.getFillColor() != null) {
                g2d.setColor(s.getFillColor());
                g2d.fill((Shape) s);
            }
            g2d.setStroke(s.getStroke());
            g2d.setColor(s.getColor());
            g2d.draw((Shape) s);
        }
        //Draw Shape s
        if (s != null) {
            if (s.getFillColor() != null) {
                g2d.setColor(s.getFillColor());
                g2d.fill((Shape) s);
            }
            g2d.setStroke(s.getStroke());
            g2d.setColor(s.getColor());
            g2d.draw((Shape) s);
        }

        if (image != null) {
            g2d.drawImage(image.getImage(), image.getX(), image.getY(), null);

        }

        if (text != null) {
            g2d.setFont(text.getFont());
            g2d.setColor(text.getColor());
            g2d.drawString(text.getText(), text.getX(), text.getY());

        }

    }

    public static BufferedImage getScreenComponent(Component component) {
        BufferedImage image = new BufferedImage(
                component.getWidth(),
                component.getHeight(),
                BufferedImage.TYPE_INT_RGB
        );
        component.paint(image.getGraphics());
        return image;
    }

    public boolean isIsMouseClicked() {
        return isMouseClicked;
    }

    public ArrayList<Drawable> getShapes() {
        return shapes;
    }

    public float getX1() {
        return x1;
    }

    public float getY1() {
        return y1;
    }

    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }

    public Drawable getS() {
        return s;
    }

    public DrawnRectangle getBackgroundRectangle() {
        return background;
    }

    public Color getBrushColor() {
        return brushColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public Tool getTool() {
        return tool;
    }

    public float getScale() {
        return scale;
    }

    public int getPipetteChoice() {
        return pipetteChoice;
    }

    public DrawnImage getImage() {
        return image;
    }

    public DrawnText getText() {
        return text;
    }

    public Stack<Drawable> getBin() {
        return bin;
    }

    public boolean isIsMouseOnImage() {
        return isMouseOnImage;
    }

    public boolean isIsMouseOnText() {
        return isMouseOnText;
    }

    public void setIsMouseClicked(boolean isMouseClicked) {
        this.isMouseClicked = isMouseClicked;
    }

    public void setShapes(ArrayList<Drawable> shapes) {
        this.shapes = shapes;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setS(Drawable s) {
        this.s = s;
    }

    public void setBackgroundRectangle(DrawnRectangle background) {
        setBackgroundColor(background.getColor());
        getShapes().set(0, background);
        this.background = background;
        repaint();
    }

    public void setBrushColor(Color brushColor) {
        this.brushColor = brushColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public void setPipetteChoice(int pipetteChoice) {
        this.pipetteChoice = pipetteChoice;
    }

    public void setImage(BufferedImage image, int x, int y) {
        this.image = new DrawnImage(image, x, y);
    }

    public void setText(DrawnText text) {
        this.text = text;
    }

    public void setIsMouseOnImage(boolean isMouseOnImage) {
        this.isMouseOnImage = isMouseOnImage;
    }

    public void setIsMouseOnText(boolean isMouseOnText) {
        this.isMouseOnText = isMouseOnText;
    }

    public void setBin(Stack<Drawable> bin) {
        this.bin = bin;
    }

    public void reset() {
        if (isMouseOnImage) {
            isMouseOnImage = false;
            setTool(Tool.NO_TOOL);
            shapes.add(image);
            image = null;
        }
        if (isMouseOnText) {
            isMouseOnText = false;
            setTool(Tool.NO_TOOL);
            shapes.add(text);
            text = null;
        }
        if (s != null) {
            shapes.add(s);
            s = null;
        }
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
