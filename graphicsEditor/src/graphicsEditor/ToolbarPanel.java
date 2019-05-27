/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor;

import static graphicsEditor.CanvasPanel.HEIGHT;
import static graphicsEditor.CanvasPanel.WIDTH;
import static graphicsEditor.CanvasPanel.getScreenComponent;
import graphicsEditor.drawnShapes.DrawnImage;
import graphicsEditor.drawnShapes.DrawnRectangle;
import graphicsEditor.drawnShapes.DrawnText;
import graphicsEditor.instruments.Tool;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author VADIM
 */
public class ToolbarPanel extends javax.swing.JPanel {

    private GEFrame frame;

    /**
     * Creates new form ToolbarPanel
     */
    public ToolbarPanel(GEFrame frame) {
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
        java.awt.GridBagConstraints gridBagConstraints;

        insertPictureButton = new javax.swing.JButton();
        setBackgroundButton = new javax.swing.JButton();
        insertTextButton = new javax.swing.JButton();
        brushButton = new javax.swing.JButton();
        eraserButton = new javax.swing.JButton();
        pipetteButton = new javax.swing.JButton();
        shapesPanel = new javax.swing.JPanel();
        rectangleButton = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        fillCheckBox = new javax.swing.JCheckBox();
        triangleButton = new javax.swing.JButton();
        lineButton = new javax.swing.JButton();
        fillColorButton = new javax.swing.JButton();
        chooseColorButton = new javax.swing.JButton();
        strokePanel = new javax.swing.JPanel();
        strokeLabel = new javax.swing.JLabel();
        strokeSpinner = new javax.swing.JSpinner();
        showPanel = new javax.swing.JPanel();

        setForeground(new java.awt.Color(0, 150, 200));
        setMaximumSize(new java.awt.Dimension(1200, 100));
        setMinimumSize(new java.awt.Dimension(1200, 100));
        setPreferredSize(new java.awt.Dimension(1200, 100));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        insertPictureButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/insertPicture.png"))); // NOI18N
        insertPictureButton.setText("Insert pic.");
        insertPictureButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insertPictureButton.setPreferredSize(new java.awt.Dimension(100, 90));
        insertPictureButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        insertPictureButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        insertPictureButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                insertPictureButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        add(insertPictureButton, gridBagConstraints);

        setBackgroundButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.png"))); // NOI18N
        setBackgroundButton.setText("Set Background");
        setBackgroundButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setBackgroundButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        setBackgroundButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setBackgroundButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(setBackgroundButton, gridBagConstraints);

        insertTextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/insertText.png"))); // NOI18N
        insertTextButton.setText("Insert text");
        insertTextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insertTextButton.setMaximumSize(new java.awt.Dimension(120, 90));
        insertTextButton.setMinimumSize(new java.awt.Dimension(120, 90));
        insertTextButton.setPreferredSize(new java.awt.Dimension(120, 90));
        insertTextButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        insertTextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                insertTextButtonMouseReleased(evt);
            }
        });
        add(insertTextButton, new java.awt.GridBagConstraints());

        brushButton.setBackground(Color.ORANGE);
        brushButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/brush.png"))); // NOI18N
        brushButton.setText("Brush");
        brushButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brushButton.setMaximumSize(new java.awt.Dimension(100, 90));
        brushButton.setMinimumSize(new java.awt.Dimension(100, 90));
        brushButton.setPreferredSize(new java.awt.Dimension(100, 90));
        brushButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        brushButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                brushButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(brushButton, gridBagConstraints);

        eraserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eraser.png"))); // NOI18N
        eraserButton.setText("Eraser");
        eraserButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eraserButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eraserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eraserButtonMouseReleased(evt);
            }
        });
        add(eraserButton, new java.awt.GridBagConstraints());

        pipetteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pipette.png"))); // NOI18N
        pipetteButton.setText("Pipette");
        pipetteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pipetteButton.setMaximumSize(new java.awt.Dimension(100, 90));
        pipetteButton.setMinimumSize(new java.awt.Dimension(100, 90));
        pipetteButton.setPreferredSize(new java.awt.Dimension(100, 90));
        pipetteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pipetteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pipetteButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(pipetteButton, gridBagConstraints);

        shapesPanel.setBackground(new Color(150, 200, 225));
        shapesPanel.setMaximumSize(new java.awt.Dimension(150, 90));
        shapesPanel.setMinimumSize(new java.awt.Dimension(150, 90));
        shapesPanel.setPreferredSize(new java.awt.Dimension(150, 90));

        rectangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rectangle.png"))); // NOI18N
        rectangleButton.setMaximumSize(new java.awt.Dimension(40, 40));
        rectangleButton.setMinimumSize(new java.awt.Dimension(40, 40));
        rectangleButton.setPreferredSize(new java.awt.Dimension(40, 40));
        rectangleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rectangleButtonMouseReleased(evt);
            }
        });
        shapesPanel.add(rectangleButton);

        circleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circle.png"))); // NOI18N
        circleButton.setMaximumSize(new java.awt.Dimension(40, 40));
        circleButton.setMinimumSize(new java.awt.Dimension(40, 40));
        circleButton.setPreferredSize(new java.awt.Dimension(40, 40));
        shapesPanel.add(circleButton);

        fillCheckBox.setBackground(new Color(150, 200, 225));
        fillCheckBox.setText("Fill");
        fillCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fillCheckBoxStateChanged(evt);
            }
        });
        shapesPanel.add(fillCheckBox);

        triangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/triangle.png"))); // NOI18N
        triangleButton.setMaximumSize(new java.awt.Dimension(40, 40));
        triangleButton.setMinimumSize(new java.awt.Dimension(40, 40));
        triangleButton.setPreferredSize(new java.awt.Dimension(40, 40));
        shapesPanel.add(triangleButton);

        lineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        lineButton.setMaximumSize(new java.awt.Dimension(40, 40));
        lineButton.setMinimumSize(new java.awt.Dimension(40, 40));
        lineButton.setPreferredSize(new java.awt.Dimension(40, 40));
        shapesPanel.add(lineButton);

        fillColorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fillColor.png"))); // NOI18N
        fillColorButton.setMaximumSize(new java.awt.Dimension(50, 25));
        fillColorButton.setMinimumSize(new java.awt.Dimension(50, 25));
        fillColorButton.setPreferredSize(new java.awt.Dimension(50, 25));
        fillColorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fillColorButtonMouseReleased(evt);
            }
        });
        shapesPanel.add(fillColorButton);

        add(shapesPanel, new java.awt.GridBagConstraints());

        chooseColorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chooseColor.png"))); // NOI18N
        chooseColorButton.setText("Choose color");
        chooseColorButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chooseColorButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chooseColorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                chooseColorButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(chooseColorButton, gridBagConstraints);

        strokePanel.setBackground(new Color(150, 200, 225));
        strokePanel.setMaximumSize(new java.awt.Dimension(90, 90));
        strokePanel.setMinimumSize(new java.awt.Dimension(90, 90));
        strokePanel.setPreferredSize(new java.awt.Dimension(90, 90));

        strokeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stroke.png"))); // NOI18N
        strokePanel.add(strokeLabel);

        strokeSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        strokeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                strokeSpinnerStateChanged(evt);
            }
        });
        strokePanel.add(strokeSpinner);

        add(strokePanel, new java.awt.GridBagConstraints());

        showPanel.setBackground(Color.white);
        showPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        showPanel.setMaximumSize(new java.awt.Dimension(90, 90));
        showPanel.setMinimumSize(new java.awt.Dimension(90, 90));
        showPanel.setPreferredSize(new java.awt.Dimension(90, 90));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 7);
        add(showPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void brushButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brushButtonMouseReleased
        frame.getCanvas().reset();
        frame.getCanvas().setTool(Tool.BRUSH);
    }//GEN-LAST:event_brushButtonMouseReleased

    private void eraserButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraserButtonMouseReleased
        frame.getCanvas().reset();
        frame.getCanvas().setTool(Tool.ERASER);
    }//GEN-LAST:event_eraserButtonMouseReleased

    private void chooseColorButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseColorButtonMouseReleased
        frame.getCanvas().reset();
        Color color = JColorChooser.showDialog(this, "Choose brush color", frame.getCanvas().getBrushColor());
        if (color != null) {
            frame.getCanvas().setBrushColor(color);
        }
    }//GEN-LAST:event_chooseColorButtonMouseReleased

    private void pipetteButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pipetteButtonMouseReleased
        frame.getCanvas().reset();
        JPanel panel = new JPanel();
        JRadioButton button1 = new JRadioButton("Brush color");
        JRadioButton button2 = new JRadioButton("Fill color");
        JRadioButton button3 = new JRadioButton("Background color");

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        JOptionPane.showMessageDialog(null, panel, "Choose color aim", JOptionPane.DEFAULT_OPTION, new ImageIcon(System.getProperty("user.dir") + "//src//icons//chooseColorAim.png"));
        if (group.isSelected(button1.getModel())) {
            frame.getCanvas().setPipetteChoice(CanvasPanel.BRUSH_COLOR);
        } else if (group.isSelected(button2.getModel())) {
            frame.getCanvas().setPipetteChoice(CanvasPanel.FILL_COLOR);
        } else if (group.isSelected(button3.getModel())) {
            frame.getCanvas().setPipetteChoice(CanvasPanel.BACKGROUND_COLOR);
        } else {
            frame.getCanvas().setPipetteChoice(0);
            return;
        }
        frame.getCanvas().setTool(Tool.PIPETTE);
    }//GEN-LAST:event_pipetteButtonMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        frame.getCanvas().reset();
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

    private void setBackgroundButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setBackgroundButtonMouseClicked
        frame.getCanvas().reset();
        Color color = JColorChooser.showDialog(this, "Choose background color", frame.getCanvas().getBackgroundColor());
        if (color != null) {
            DrawnRectangle background = new DrawnRectangle(frame.getCanvas().getStroke(), color, color, 0, 0, CanvasPanel.WIDTH, CanvasPanel.HEIGHT);
            frame.getCanvas().setBackgroundRectangle(background);
        }
    }//GEN-LAST:event_setBackgroundButtonMouseClicked

    private void strokeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_strokeSpinnerStateChanged
        frame.getCanvas().reset();
        frame.getCanvas().setStroke(new BasicStroke((Integer) strokeSpinner.getValue()));
    }//GEN-LAST:event_strokeSpinnerStateChanged

    private void fillColorButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillColorButtonMouseReleased
        frame.getCanvas().reset();
        Color color = JColorChooser.showDialog(this, "Choose fill color", frame.getCanvas().getFillColor());
        if (color != null) {
            frame.getCanvas().setFillColor(color);
        }
    }//GEN-LAST:event_fillColorButtonMouseReleased

    private void rectangleButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangleButtonMouseReleased
        frame.getCanvas().reset();
        frame.getCanvas().setTool(Tool.SHAPE_RECTANGLE);
    }//GEN-LAST:event_rectangleButtonMouseReleased

    private void fillCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fillCheckBoxStateChanged
        frame.getCanvas().reset();
        if (fillCheckBox.isSelected()) {
            frame.getCanvas().setFillColor(frame.getCanvas().getBrushColor());
        } else {
            frame.getCanvas().setFillColor(null);
        }
    }//GEN-LAST:event_fillCheckBoxStateChanged

    private void insertPictureButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPictureButtonMouseReleased
        frame.getCanvas().reset();
        JFileChooser picChooser = new JFileChooser(System.getProperty("user.home"));
        picChooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                String fileName = f.getName().toString();
                if (fileName.endsWith(".png")) {
                    return true;
                }
                return false;
            }

            @Override
            public String getDescription() {
                return ".png";
            }
        });
        int choice = picChooser.showOpenDialog(null);
        switch (choice) {
            case JFileChooser.APPROVE_OPTION: {
                try {
                    BufferedImage image = ImageIO.read(picChooser.getSelectedFile());
                    if (image == null) {
                        throw new IOException();
                    }
                    frame.getCanvas().setImage(image, 0, 0);
                    frame.getCanvas().repaint();
                    frame.getCanvas().setTool(Tool.INSERT_PICTURE);
                    frame.getCanvas().setIsMouseOnImage(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Choose picture(file ending with .png, .jpg...)", "Invalid file chosen", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
        }
    }//GEN-LAST:event_insertPictureButtonMouseReleased

    private void insertTextButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertTextButtonMouseReleased
        frame.getCanvas().reset();
        JPanel panel = new JPanel();
        JComboBox comboBox = new JComboBox();
        Font font;
        DrawnText text;
        comboBox.addItem("Arial");
        comboBox.addItem("Comic Sans MS");
        comboBox.addItem("Courier New");
        comboBox.addItem("Georgia1");
        comboBox.addItem("Impact");
        comboBox.addItem("Lucida");
        comboBox.addItem("Palatino Linotype");
        comboBox.addItem("Tahoma");
        comboBox.addItem("Times New Roman");
        comboBox.addItem("Trebuchet MS1");
        comboBox.addItem("Verdana");
        comboBox.addItem("MS Sans Serif4");
        comboBox.addItem("MS Serif4");
        

        JRadioButton button1 = new JRadioButton("Italic");
        JRadioButton button2 = new JRadioButton("Bold");

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);

        button1.setSelected(true);
        
        JSpinner spinner = new JSpinner();
        spinner.setModel(new javax.swing.SpinnerNumberModel(12, 12, 72, 1));

        JTextField textField = new JTextField("Enter your text");
        textField.setBounds(0, 0, 80, 40);

        panel.add(comboBox);
        panel.add(button1);
        panel.add(button2);
        panel.add(spinner);
        panel.add(textField);
        panel.setLayout(new FlowLayout());
        JOptionPane.showMessageDialog(null, panel, "Choose your font", JOptionPane.DEFAULT_OPTION, null);
        if (group.isSelected(button1.getModel())) {
            font = new Font((String) comboBox.getSelectedItem(), Font.ITALIC, (Integer) spinner.getValue());
            text = new DrawnText(font, textField.getText(), frame.getCanvas().getBrushColor(), (Integer) spinner.getValue(), (Integer) spinner.getValue());
            frame.getCanvas().setText(text);
            frame.getCanvas().setTool(Tool.INSERT_TEXT);
            frame.getCanvas().repaint();
            frame.getCanvas().setIsMouseOnText(true);
        } else if (group.isSelected(button2.getModel())) {
            font = new Font((String) comboBox.getSelectedItem(), Font.BOLD, (Integer) spinner.getValue());
            text = new DrawnText(font, textField.getText(), frame.getCanvas().getBrushColor(), (Integer) spinner.getValue(), (Integer) spinner.getValue());
            frame.getCanvas().setText(text);
            frame.getCanvas().setTool(Tool.INSERT_TEXT);
            frame.getCanvas().repaint();
            frame.getCanvas().setIsMouseOnText(true);
        }
        /*
        Arial, Arial, Helvetica, sans-serif	Arial, Arial, Helvetica, sans-serif
Comic Sans MS, Comic Sans MS5, cursive	Comic Sans MS, Comic Sans MS5, cursive
Courier New, Courier New, monospace	Courier New, Courier New, monospace
Georgia1, Georgia, serif	Georgia1, Georgia, serif
Impact, Impact5, Charcoal6, sans-serif	Impact, Impact5, Charcoal6, sans-serif
Lucida Console, Monaco5, monospace	Lucida Console, Monaco5, monospace
Palatino Linotype, Book Antiqua3, Palatino, serif	Palatino Linotype, Book Antiqua3, Palatino, serif
Tahoma, Geneva, sans-serif	Tahoma, Geneva, sans-serif
Times New Roman, Times New Roman, Times, serif	Times New Roman, Times New Roman, Times, serif
Trebuchet MS1, Trebuchet MS, sans-serif	Trebuchet MS1, Trebuchet MS, sans-serif
Verdana, Verdana, Geneva, sans-serif	Verdana, Verdana, Geneva, sans-serif
Symbol, Symbol (Symbol2, Symbol2)	Symbol, Symbol (Symbol2, Symbol2)
Webdings, Webdings (Webdings2, Webdings2)	Webdings, Webdings (Webdings2, Webdings2)
Wingdings, Zapf Dingbats (Wingdings2, Zapf Dingbats2)	Wingdings, Zapf Dingbats (Wingdings2, Zapf Dingbats2)
MS Sans Serif4, Geneva, sans-serif	MS Sans Serif4, Geneva, sans-serif
MS Serif4, New York6, serif
         */
        //frame.getCanvas().setTool(Tool.PIPETTE);
    }//GEN-LAST:event_insertTextButtonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brushButton;
    private javax.swing.JButton chooseColorButton;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton eraserButton;
    private javax.swing.JCheckBox fillCheckBox;
    private javax.swing.JButton fillColorButton;
    private javax.swing.JButton insertPictureButton;
    private javax.swing.JButton insertTextButton;
    private javax.swing.JButton lineButton;
    private javax.swing.JButton pipetteButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JButton setBackgroundButton;
    private javax.swing.JPanel shapesPanel;
    private javax.swing.JPanel showPanel;
    private javax.swing.JLabel strokeLabel;
    private javax.swing.JPanel strokePanel;
    private javax.swing.JSpinner strokeSpinner;
    private javax.swing.JButton triangleButton;
    // End of variables declaration//GEN-END:variables
}
