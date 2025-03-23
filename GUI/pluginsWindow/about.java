package GUI.pluginsWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static GUI.clientIndex.cardColor;
import static GUI.clientIndex.logger;

public class about {
    public static JPanel addTo(){
        JPanel aboutPanel = new JPanel();
        aboutPanel.setLayout(null);

        JPanel developerPanel = new JPanel();
        developerPanel.setLayout(null);
        developerPanel.setBackground(cardColor);
        developerPanel.setBounds(10,10,565,270);

        JPanel Frostcloud = new JPanel();
        Frostcloud.setLayout(null);
        Frostcloud.setBounds(10,10,545,40);
        ClassLoader FrostcloudClassLoader = Thread.currentThread().getContextClassLoader();
        URL FrostcloudImageUrl = FrostcloudClassLoader.getResource("/image/Frostcloud.png");
        if (FrostcloudImageUrl != null) {
            ImageIcon FrostcloudImage = new ImageIcon(FrostcloudImageUrl);
            JLabel FrostcloudLabel = new JLabel(FrostcloudImage);
            FrostcloudLabel.setBounds(0,0,535,40);
            Frostcloud.add(FrostcloudLabel);
        } else {
            logger.warn("Image null pointer exception!");
        }

        JPanel MCKJMYC = new JPanel();
        MCKJMYC.setLayout(null);
        MCKJMYC.setBounds(10,60,545,40);
        ClassLoader MCKJMYCClassLoader = Thread.currentThread().getContextClassLoader();
        URL MCKJMYCImageUrl = MCKJMYCClassLoader.getResource("/image/MCKJMYC.png");
        if (MCKJMYCImageUrl != null) {
            ImageIcon MCKJMYCImage = new ImageIcon(MCKJMYCImageUrl);
            JLabel MCKJMYCLabel = new JLabel(MCKJMYCImage);
            MCKJMYCLabel.setBounds(0,0,545,40);
            MCKJMYC.add(MCKJMYCLabel);
        } else {
            logger.warn("Image null pointer exception!");
        }

        JPanel version = new JPanel();
        version.setLayout(null);
        version.setBounds(10,120,545,100);
        ClassLoader versionClassLoader = Thread.currentThread().getContextClassLoader();
        URL versionImageUrl = versionClassLoader.getResource("/image/version.png");
        if (versionImageUrl != null) {
            ImageIcon versionImage = new ImageIcon(versionImageUrl);
            JLabel versionLabel = new JLabel(versionImage);
            versionLabel.setBounds(0,0,545,100);
            version.add(versionLabel);
        } else {
            logger.warn("Image null pointer exception!");
        }

        JButton youWereFooled = new JButton("千万别点");
        youWereFooled.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.bilibili.com/video/BV1GJ411x7h7"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        youWereFooled.setBounds(10,240,545,20);
        youWereFooled.setBackground(Color.RED);

        developerPanel.add(Frostcloud);
        developerPanel.add(MCKJMYC);
        developerPanel.add(version);
        developerPanel.add(youWereFooled);

        aboutPanel.add(developerPanel);

        return aboutPanel;
    }
}
