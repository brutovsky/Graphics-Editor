/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.drawnShapes;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Path2D;

/**
 *
 * @author VADIM
 */
public class DrawnTriangle extends Path2D.Double implements Drawable {

    private Stroke stroke;
    private Color color;
    private Color fillColor;

    public DrawnTriangle(Stroke stroke, Color color, Color fillColor, double x1, double y1, double x2, double y2, double x3, double y3) {
        this.stroke = stroke;
        this.color = color;
        this.fillColor = fillColor;
        moveTo(x1, y1);
        lineTo(x2, y2);
        lineTo(x3, y3);
        closePath();
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
