package GUI.pluginsWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.clientIndex.*;

public class bar{
    public static void addTo(JFrame frame) {

        JPanel menu = new JPanel();
        menu.setBounds(0,0,600,30);
        menu.setBackground(cardColor);

        JLabel MCSTMixed = new JLabel("MCST Mixed");
        JButton homeButton = new JButton("首页");
        homeButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel,"clientIndex");
            }
        });
        JButton downloadButton = new JButton("下载");
        downloadButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel,"download");
            }
        });
        JButton manageButton = new JButton("管理");
        manageButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        JButton settingButton = new JButton("设置");
        settingButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton aboutButton = new JButton("关于");
        aboutButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel,"about");
            }
        });

        homeButton.setBackground(MCSTBurl);
        downloadButton.setBackground(null);
        manageButton.setBackground(null);
        settingButton.setBackground(null);
        aboutButton.setBackground(null);

        ActionListener buttonClickListener = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setBackground(null);
                downloadButton.setBackground(null);
                manageButton.setBackground(null);
                settingButton.setBackground(null);
                aboutButton.setBackground(null);

                JButton clickedButton = (JButton) e.getSource();
                clickedButton.setBackground(MCSTBurl);
            }
        };

        homeButton.addActionListener(buttonClickListener);
        downloadButton.addActionListener(buttonClickListener);
        manageButton.addActionListener(buttonClickListener);
        settingButton.addActionListener(buttonClickListener);
        aboutButton.addActionListener(buttonClickListener);

        menu.add(MCSTMixed);
        menu.add(homeButton);
        menu.add(downloadButton);
        menu.add(manageButton);
        menu.add(settingButton);
        menu.add(aboutButton);
        menu.repaint();
        menu.revalidate();

        frame.add(cardPanel);
        frame.add(menu);
        frame.revalidate();
        frame.repaint();
    }
}
