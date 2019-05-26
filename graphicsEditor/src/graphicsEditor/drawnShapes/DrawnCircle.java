/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.drawnShapes;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author VADIM
 */
public class DrawnCircle extends Ellipse2D.Double implements Drawable {

    private Stroke stroke;
    private Color color;
    private Color fillColor;

    public DrawnCircle(Stroke stroke, Color color, Color fillColor, double x, double y, double w, double h) {
        super(x, y, w, h);
        this.stroke = stroke;
        this.color = color;
        this.fillColor = fillColor;
    }

    @Override
    public Stroke getStroke() {
        return stroke;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

}
