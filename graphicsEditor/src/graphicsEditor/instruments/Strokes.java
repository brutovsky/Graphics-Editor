/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsEditor.instruments;

import java.awt.BasicStroke;
import java.awt.Stroke;

/**
 *
 * @author VADIM
 */
public enum Strokes {
    STROKE_10(new BasicStroke(10f)), STROKE_5(new BasicStroke(5f)), STROKE_1(new BasicStroke(1f));
    private Stroke stroke;

    Strokes(Stroke stroke) {
        this.stroke = stroke;
    }

    public Stroke getStroke() {
        return stroke;
    }

}
