package com.vsu.loseva.sectorrasterization;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class RasterizationController {
    @FXML
    AnchorPane anchorPane;
    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {
        anchorPane.prefWidthProperty().addListener((ov, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue()));
        anchorPane.prefHeightProperty().addListener((ov, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue()));

        Color color1 = Color.RED;
        Color color2 = Color.YELLOW;
        Colors colors = new Colors(color1, color2);

        SectorDraw.draw(canvas, -50, 0, 100, -45, 90, colors);
        SectorDraw.draw(canvas, 200, 0, 100, -135, 90, colors);
        SectorDraw.draw(canvas, 400, -100, 100, 45, 90, colors);
        SectorDraw.draw(canvas, 350, -100, 100, 135, 90, colors);
        SectorDraw.draw(canvas, 550, -50, 100, 0, 1, colors);

        SectorDraw.draw(canvas, 50, 150, 100, -90, 180, colors);
        SectorDraw.draw(canvas, 300, 50, 100, 90, 180, colors);
        SectorDraw.draw(canvas, 550, 150, 100, 0, 360, colors);
    }
}