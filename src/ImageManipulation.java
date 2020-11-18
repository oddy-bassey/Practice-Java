import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageManipulation {

    public static void main(String[] args){
        int width = 640;
        int height = 320;

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        File file = null;

        System.out.println("image deneration started!");

        for (int y=0; y < height; y++){
            for(int x=0; x < width; x++){

                int a = (int) (Math.random()*256);
                int r = (int) (Math.random()*256);
                int g = (int) (Math.random()*256);
                int b = (int) (Math.random()*256);

                if(x<5) {
                    System.out.println("a: " + a + " r: " + r + " g: " + g + " b: " + b);
                    System.out.println();
                }

                int p = (a<<24) | (r<<16) | (g<<8) | b;
                bufferedImage. setRGB(x, y, p);
            }
        }
        System.out.println("image generation stopped!");

        try {
            System.out.println("executing");
            file = new File("C:\\Users\\Bassey Oddy\\Desktop\\oddy Lol\\output.png");
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
