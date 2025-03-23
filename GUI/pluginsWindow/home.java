package GUI.pluginsWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static GUI.clientIndex.cardColor;

public class home {
    public static JPanel addTo(){
        JPanel homePanel = new JPanel();
        homePanel.setLayout(null);

        JPanel quickStart = new JPanel();
        quickStart.setBounds(10,10,100,310);
        quickStart.setBackground(cardColor);
        quickStart.setLayout(null);
        JLabel quickStartLabel = new JLabel("快速开始");
        quickStartLabel.setBounds(25,5,80,15);
        JButton downloadJavaButton = new JButton("下载Java");
        downloadJavaButton.setBounds(5,25,90,20);
        downloadJavaButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        JButton downloadServerButton = new JButton("下载服务端");
        downloadServerButton.setBounds(5,50,90,20);
        downloadServerButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        quickStart.add(quickStartLabel);
        quickStart.add(downloadJavaButton);
        quickStart.add(downloadServerButton);

        JPanel server = new JPanel();
        server.setBackground(cardColor);
        server.setBounds(120,10,455,310);
        JLabel noServer = new JLabel("当前软件只有GUI，查看服务器的功能再等等后续更新吧");
        server.add(noServer);

        homePanel.add(quickStart);
        homePanel.add(server);

        return homePanel;
    }
}
