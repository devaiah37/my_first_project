package com.nagra;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.alcibiade.asciiart.coord.TextBoxSize;
import org.alcibiade.asciiart.image.rasterize.ShapeRasterizer;
import org.alcibiade.asciiart.raster.ExtensibleCharacterRaster;
import org.alcibiade.asciiart.raster.Raster;
import org.alcibiade.asciiart.raster.RasterContext;
import org.alcibiade.asciiart.widget.PictureWidget;
import org.alcibiade.asciiart.widget.TextWidget;

public class MyApp{
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World! Hi this is Dev");

        BufferedImage flowerImage = null;

        ClassLoader classLoader = MyApp.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("images/inst.jpg");
        try {
            BufferedImage image = ImageIO.read(resourceAsStream);
            TextWidget widget = new PictureWidget(new TextBoxSize(80, 30),
                    image, new ShapeRasterizer());
            Raster raster = new ExtensibleCharacterRaster();

            widget.render(new RasterContext(raster));
            System.out.println(raster.toString()); // print the ASCII art to console

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}