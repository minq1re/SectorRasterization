package com.vsu.loseva.sectorrasterization;

import javafx.scene.paint.Color;

public class Colors implements ColorInterpolator {
    private final Color color1;
    private final Color color2;

    Colors(Color color1, Color colo2) {
        this.color1 = color1;
        this.color2 = colo2;
    }

    @Override
    public Color getColor(double t) {
        double dR = (color2.getRed() - color1.getRed());
        double dG = (color2.getGreen() - color1.getGreen());
        double dB = (color2.getBlue() - color1.getBlue());

        double red = color1.getRed() + (t * dR);
        double green = color1.getGreen() + (t * dG);
        double blue = color1.getBlue() + (t * dB);

        return Color.color(red, green, blue);
    }
}
