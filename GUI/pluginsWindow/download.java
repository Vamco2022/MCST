package GUI.pluginsWindow;

import javax.swing.*;

import static GUI.clientIndex.cardColor;
import static GUI.clientIndex.cardLayout;

public class download {
    public static JPanel addTo(){
        JPanel downloadPanel = new JPanel();
        downloadPanel.setLayout(null);

        JPanel downloadPanel2 = new JPanel();
        downloadPanel2.setBounds(10,10,100,310);
        downloadPanel2.setBackground(cardColor);
        JLabel downloadLabel = new JLabel("下载");
        JButton originalServer = new JButton("原版");
        JButton paper = new JButton("paper");
        JButton spigot = new JButton("spigot");
        JButton mohist = new JButton("mohist");
        JButton forge = new JButton("forge");
        JButton fabric = new JButton("fabric");
        JButton downloadJava = new JButton("Java");

        downloadPanel2.add(downloadLabel);
        downloadPanel2.add(originalServer);
        downloadPanel2.add(paper);
        downloadPanel2.add(spigot);
        downloadPanel2.add(mohist);
        downloadPanel2.add(forge);
        downloadPanel2.add(fabric);
        downloadPanel2.add(downloadJava);

        JPanel downloadCard = new JPanel();
        downloadCard.setLayout(cardLayout);

        downloadPanel.add(downloadPanel2);

        return downloadPanel;
    }
}
