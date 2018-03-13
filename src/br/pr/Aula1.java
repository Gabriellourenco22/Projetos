package br.pr;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Gabriel on 12/03/2018.
 */
public class Aula1 {
    public static void main(String[] args) throws IOException {
        BufferedImage img= new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
        for( int y=0;  y<img.getHeight();y++){
            for(int x=0; x<img.getWidth();x++)
            {
                Color color = new Color(200,0,25);
                img.setRGB(x,y,color.getRGB());
            }
        }
        ImageIO.write(img,"png",new File("vermelho.png"));

    }
}
