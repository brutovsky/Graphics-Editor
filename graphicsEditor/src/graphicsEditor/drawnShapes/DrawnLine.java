/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.drawnShapes;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author VADYM NAKYTNIAK
 */
public class DrawnLine extends Line2D.Double implements Drawable {

    private Stroke stroke;
    private Color color;
    private Color fillColor;

    public DrawnLine(Stroke stroke, Color color, double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        this.stroke = stroke;
        this.color = color;
        fillColor = color;
    }

    public DrawnLine(Stroke stroke, Color color, Point2D p1, Point2D p2) {
        super(p1, p2);
        this.stroke = stroke;
        this.color = color;
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
