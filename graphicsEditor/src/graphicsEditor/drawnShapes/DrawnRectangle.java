/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.drawnShapes;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Stroke;

/**
 *
 * @author VADYM NAKYTNIAK
 */
public class DrawnRectangle extends Rectangle implements Drawable {

    private Stroke stroke;
    private Color color;
    private Color fillColor;

    public DrawnRectangle(Stroke stroke, Color color, Color fillColor, int x, int y, int width, int height) {
        super(x, y, width, height);
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
