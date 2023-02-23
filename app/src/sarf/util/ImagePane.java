package sarf.util;

import javax.swing.JPanel;
import java.awt.*;
import java.net.*;



public class ImagePane extends JPanel {
    protected Image image;

    public ImagePane() {
    }

    public ImagePane(String file) {

        setImage(getToolkit().getImage(file));
    }

    public ImagePane(URL url) {
        setImage(getToolkit().getImage(url));
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(image, 0);
        try {
            mt.waitForAll();
        }
        catch (InterruptedException ep) {}
        //setPreferredSize(new Dimension(image.getWidth(this),image.getHeight(this)));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, getX(), getY(), getWidth(), getHeight(), this);
    }

}
