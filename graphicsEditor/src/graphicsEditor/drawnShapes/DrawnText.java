/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.drawnShapes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;

/**
 *
 * @author VADYM NAKYTNIAK
 */
public class DrawnText implements Drawable {

    private Font font;
    private String text;
    private Color color;
    private int x;
    private int y;

    public DrawnText(Font font, String text, Color color, int x, int y) {
        this.font = font;
        this.text = text;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return null
     */
    @Override
    public Stroke getStroke() {
        return null;
    }

    /**
     *
     * @return color
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     *
     * @return color
     */
    @Override
    public Color getFillColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Font getFont() {
        return font;
    }

    public String getText() {
        return text;
    }

    /**
     * EMPTY method
     *
     * @param stroke
     */
    @Override
    public void setStroke(Stroke stroke) {
    }

    /**
     * EMPTY method
     *
     * @param color
     */
    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *
     *
     * @param color
     */
    @Override
    public void setFillColor(Color color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setText(String text) {
        this.text = text;
    }

}
