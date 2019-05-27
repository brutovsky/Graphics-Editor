/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.drawnShapes;

import java.awt.Color;
import java.awt.Stroke;

/**
 * Interface for all objects to be drawn
 * @author VADYM NAKYTNIAK
 */
public interface Drawable {
    Stroke getStroke();
    Color getColor();
    Color getFillColor();
    void setStroke(Stroke stroke);
    void setColor(Color color);
    void setFillColor(Color color);
}
