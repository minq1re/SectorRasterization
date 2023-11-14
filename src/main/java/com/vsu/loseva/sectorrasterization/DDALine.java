package com.vsu.loseva.sectorrasterization;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DDALine {
    public static void drawLine(Canvas canvas, double x1, double y1, double x2, double y2, double radius,
                                ColorInterpolator interpolator) {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double xDif = Math.round(x2 - x1);
        double yDif = Math.round(y2 - y1);

        double maxDif = radius;

        double dX = xDif / maxDif;
        double dY = yDif / maxDif;

        for (int i = 0; i < maxDif; i++) {
            gc.setFill(interpolator.getColor(i / maxDif));
            gc.fillRect(x1, y1, 1, 1);
            x1 += dX;
            y1 += dY;
        }
    }
}
