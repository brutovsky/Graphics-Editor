/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.drawnShapes;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.image.BufferedImage;

/**
 *
 * @author VADIM
 */
public class DrawnImage extends BufferedImage implements Drawable {

    private BufferedImage image;
    private int x;
    private int y;

    public DrawnImage(BufferedImage image, int x, int y) {
        super(image.getWidth(), image.getHeight(), image.getType());
        this.image = image;
        this.x = x;
        this.y = y;
    }

    public DrawnImage(int width, int height, int imageType) {
        super(width, height, imageType);
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
     * @return null
     */
    @Override
    public Color getColor() {
        return null;
    }

    /**
     *
     * @return null
     */
    @Override
    public Color getFillColor() {
        return null;
    }

    public BufferedImage getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
     * @param stroke
     */
    @Override
    public void setColor(Color color) {
    }

    /**
     * EMPTY method
     *
     * @param stroke
     */
    @Override
    public void setFillColor(Color color) {
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
