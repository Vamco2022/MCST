package GUI;

import GUI.pluginsWindow.about;
import GUI.pluginsWindow.bar;
import GUI.pluginsWindow.download;
import GUI.pluginsWindow.home;
import com.formdev.flatlaf.FlatDarkLaf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

import static GUI.clientIndex.cardLayout;

public class clientIndex {
    public static final Logger logger = LoggerFactory.getLogger(clientIndex.class);

    public static Color cardColor = new Color(48,48,41);
    public static Color MCSTBurl = new Color(0,93,255);

    public static CardLayout cardLayout = new CardLayout();
    public static JPanel cardPanel = new JPanel();

    public static void index(){

        JPanel menu = new JPanel();

        FlatDarkLaf.setup();
        JFrame frame = new JFrame();
        ClassLoader iconClassLoader = Thread.currentThread().getContextClassLoader();
        URL iconUrl = iconClassLoader.getResource("/image/icon.png");
        if (iconUrl != null) {
            ImageIcon icon = new ImageIcon(iconUrl);
            frame.setIconImage(icon.getImage());
        } else {
            logger.warn("Image null pointer exception!");
        }

        //init base frame
        frame.setTitle("MCST Mixed");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        cardPanel.setLayout(cardLayout);
        cardPanel.setBounds(0,30,600,320);
        menu.setBounds(0,0,600,30);
        menu.setBackground(cardColor);

        cardPanel.setLayout(cardLayout);
        cardPanel.setBounds(0,30,600,320);

        //add plugins
        cardPanel.add(home.addTo(),"clientIndex");
        cardPanel.add(download.addTo(),"download");
        cardPanel.add(about.addTo(),"about");

        bar.addTo(frame);
    }
}
