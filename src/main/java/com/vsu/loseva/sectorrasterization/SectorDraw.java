package com.vsu.loseva.sectorrasterization;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class SectorDraw {
    public static void draw(Canvas canvas, double x, double y, int radius, double anglePoint,
                            double angleSector, Colors colors) {
        double x0 = x + radius;
        double y0 = y + radius;
        double xEnd;
        double yEnd;

        double angleHalf = angleSector / 2;
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double j = Math.min(10.0 / radius, 1.0);

        for (double i = 0; i < angleHalf; i = i + j) {
            xEnd = x0 + (radius * Math.cos((anglePoint + i) * 0.0175));
            yEnd = y0 + (radius * Math.sin((anglePoint + i) * 0.0175));
            DDALine.drawLine(canvas, x0, y0, xEnd, yEnd, radius, colors);

            xEnd = x0 + (radius * Math.cos((anglePoint - i) * 0.0175));
            yEnd = y0 + (radius * Math.sin((anglePoint - i) * 0.0175));
            DDALine.drawLine(canvas, x0, y0, xEnd, yEnd, radius, colors);
        }
    }
}
