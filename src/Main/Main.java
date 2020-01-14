package Main;

import Controler.MainFrame;
import Model.Image;
import View.FileImageLoader;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\gabriel_hijo\\Pictures\\Saved Pictures");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
    
}
