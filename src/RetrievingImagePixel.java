import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class RetrievingImagePixel {
    public static void main (String[] args){

        File imgFile = new File("C:\\Users\\Bassey Oddy\\Pictures\\Saved Pictures\\eggPic.png");
        BufferedImage inputImage = null;
        BufferedImage outputImage = null;

        try{
            inputImage = ImageIO.read(imgFile);
            outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_ARGB);

            System.out.println("Creating greyscale pixels.");
            for(int i = 0; i < inputImage.getHeight(); i++){
                for(int j = 0; j < inputImage.getWidth(); j++){
                    Color color = new Color(inputImage.getRGB(j,i));

                    int r = color.getRed();
                    int g = color.getGreen();
                    int b = color.getBlue();
                    int a = color.getAlpha();

                    //simple greyscaling
                    int gr = (r + g + b) / 3;

                    //create grayColor
                    Color greyColor = new Color(gr, gr, gr, a);
                    outputImage.setRGB(j, i, greyColor.getRGB());
                }
            }
            System.out.println("Pixel creation finnished.");

            //save image to a folder path
            System.out.println("Saving greyscale image.");
            ImageIO.write(outputImage, "png", new File("C:\\Users\\Bassey Oddy\\Desktop\\oddy Lol\\greyImage.png"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
