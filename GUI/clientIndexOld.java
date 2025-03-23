//package GUI;
//
//import com.formdev.flatlaf.FlatDarkLaf;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.URL;
//
//public class clientIndexOld {
//
//    private static final Logger logger = LoggerFactory.getLogger(clientIndexOld.class);
//
//    public static Color cardColor = new Color(38,38,41);
//    public static Color MCSTBurl = new Color(0,93,255);
//
//    public static void Home() {
//        FlatDarkLaf.setup();
//        JFrame frame = new JFrame();
//        ClassLoader iconClassLoader = Thread.currentThread().getContextClassLoader();
//        URL iconUrl = iconClassLoader.getResource("/image/icon.png");
//        if (iconUrl != null) {
//            ImageIcon icon = new ImageIcon(iconUrl);
//            frame.setIconImage(icon.getImage());
//        } else {
//            logger.warn("Image null pointer exception!");
//        }
//        frame.setTitle("MCST Mixed");
//        frame.setSize(600,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//
//        CardLayout cardLayout = new CardLayout();
//        JPanel cardPanel = new JPanel();
//        cardPanel.setLayout(cardLayout);
//        cardPanel.setBounds(0,30,600,320);
//
//        JPanel menu = new JPanel();
//        menu.setBounds(0,0,600,30);
//        menu.setBackground(cardColor);
//
//        JPanel homePanel = new JPanel();
//        homePanel.setLayout(null);
//
//        JPanel quickStart = new JPanel();
//        quickStart.setBounds(10,10,100,310);
//        quickStart.setBackground(cardColor);
//        quickStart.setLayout(null);
//        JLabel quickStartLabel = new JLabel("快速开始");
//        quickStartLabel.setBounds(25,5,80,15);
//        JButton downloadJavaButton = new JButton("下载Java");
//        downloadJavaButton.setBounds(5,25,90,20);
//        downloadJavaButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            }
//        });
//        JButton downloadServerButton = new JButton("下载服务端");
//        downloadServerButton.setBounds(5,50,90,20);
//        downloadServerButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            }
//        });
//        quickStart.add(quickStartLabel);
//        quickStart.add(downloadJavaButton);
//        quickStart.add(downloadServerButton);
//
//        JPanel server = new JPanel();
//        server.setBackground(cardColor);
//        server.setBounds(120,10,455,310);
//        JLabel noServer = new JLabel("当前软件只有GUI，查看服务器的功能再等等后续更新吧");
//        server.add(noServer);
//
//        homePanel.add(quickStart);
//        homePanel.add(server);
//
//        JPanel downloadPanel = new JPanel();
//        downloadPanel.setLayout(null);
//
//        JPanel downloadPanel2 = new JPanel();
//        downloadPanel2.setBounds(10,10,100,310);
//        downloadPanel2.setBackground(cardColor);
//        JLabel downloadLabel = new JLabel("下载");
//        JButton originalServer = new JButton("原版");
//        JButton paper = new JButton("paper");
//        JButton spigot = new JButton("spigot");
//        JButton mohist = new JButton("mohist");
//        JButton forge = new JButton("forge");
//        JButton fabric = new JButton("fabric");
//        JButton downloadJava = new JButton("Java");
//
//        downloadPanel2.add(downloadLabel);
//        downloadPanel2.add(originalServer);
//        downloadPanel2.add(paper);
//        downloadPanel2.add(spigot);
//        downloadPanel2.add(mohist);
//        downloadPanel2.add(forge);
//        downloadPanel2.add(fabric);
//        downloadPanel2.add(downloadJava);
//
//        JPanel downloadCard = new JPanel();
//        downloadCard.setLayout(cardLayout);
//
//        downloadPanel.add(downloadPanel2);
//
//        JPanel aboutPanel = new JPanel();
//        aboutPanel.setLayout(null);
//
//        JPanel developerPanel = new JPanel();
//        developerPanel.setLayout(null);
//        developerPanel.setBackground(cardColor);
//        developerPanel.setBounds(10,10,565,270);
//
//        JPanel Frostcloud = new JPanel();
//        Frostcloud.setLayout(null);
//        Frostcloud.setBounds(10,10,545,40);
//        ClassLoader FrostcloudClassLoader = Thread.currentThread().getContextClassLoader();
//        URL FrostcloudImageUrl = FrostcloudClassLoader.getResource("/image/Frostcloud.png");
//        if (FrostcloudImageUrl != null) {
//            ImageIcon FrostcloudImage = new ImageIcon(FrostcloudImageUrl);
//            JLabel FrostcloudLabel = new JLabel(FrostcloudImage);
//            FrostcloudLabel.setBounds(0,0,535,40);
//            Frostcloud.add(FrostcloudLabel);
//        } else {
//            logger.warn("Image null pointer exception!");
//        }
//
//        JPanel MCKJMYC = new JPanel();
//        MCKJMYC.setLayout(null);
//        MCKJMYC.setBounds(10,60,545,40);
//        ClassLoader MCKJMYCClassLoader = Thread.currentThread().getContextClassLoader();
//        URL MCKJMYCImageUrl = MCKJMYCClassLoader.getResource("/image/MCKJMYC.png");
//        if (MCKJMYCImageUrl != null) {
//            ImageIcon MCKJMYCImage = new ImageIcon(MCKJMYCImageUrl);
//            JLabel MCKJMYCLabel = new JLabel(MCKJMYCImage);
//            MCKJMYCLabel.setBounds(0,0,545,40);
//            MCKJMYC.add(MCKJMYCLabel);
//        } else {
//            logger.warn("Image null pointer exception!");
//        }
//
//        JPanel version = new JPanel();
//        version.setLayout(null);
//        version.setBounds(10,120,545,100);
//        ClassLoader versionClassLoader = Thread.currentThread().getContextClassLoader();
//        URL versionImageUrl = versionClassLoader.getResource("/image/version.png");
//        if (versionImageUrl != null) {
//            ImageIcon versionImage = new ImageIcon(versionImageUrl);
//            JLabel versionLabel = new JLabel(versionImage);
//            versionLabel.setBounds(0,0,545,100);
//            version.add(versionLabel);
//        } else {
//            logger.warn("Image null pointer exception!");
//        }
//
//        JButton youWereFooled = new JButton("千万别点");
//        youWereFooled.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    Desktop.getDesktop().browse(new URI("https://www.bilibili.com/video/BV1GJ411x7h7"));
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                } catch (URISyntaxException ex) {
//                    throw new RuntimeException(ex);
//                }
//            }
//        });
//        youWereFooled.setBounds(10,240,545,20);
//        youWereFooled.setBackground(Color.RED);
//
//        developerPanel.add(Frostcloud);
//        developerPanel.add(MCKJMYC);
//        developerPanel.add(version);
//        developerPanel.add(youWereFooled);
//
//        aboutPanel.add(developerPanel);
//
//        cardPanel.add(homePanel,"clientIndex");
//        cardPanel.add(downloadPanel,"download");
//        cardPanel.add(aboutPanel,"about");
//
//        JLabel MCSTMixed = new JLabel("MCST Mixed");
//        JButton homeButton = new JButton("首页");
//        homeButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                cardLayout.show(cardPanel,"clientIndex");
//            }
//        });
//        JButton downloadButton = new JButton("下载");
//        downloadButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                cardLayout.show(cardPanel,"download");
//            }
//        });
//        JButton manageButton = new JButton("管理");
//        manageButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            }
//        });
//        JButton settingButton = new JButton("设置");
//        settingButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        JButton aboutButton = new JButton("关于");
//        aboutButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               cardLayout.show(cardPanel,"about");
//            }
//        });
//
//        homeButton.setBackground(MCSTBurl);
//        downloadButton.setBackground(null);
//        manageButton.setBackground(null);
//        settingButton.setBackground(null);
//        aboutButton.setBackground(null);
//
//        ActionListener buttonClickListener = new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                homeButton.setBackground(null);
//                downloadButton.setBackground(null);
//                manageButton.setBackground(null);
//                settingButton.setBackground(null);
//                aboutButton.setBackground(null);
//
//                JButton clickedButton = (JButton) e.getSource();
//                clickedButton.setBackground(MCSTBurl);
//            }
//        };
//
//        homeButton.addActionListener(buttonClickListener);
//        downloadButton.addActionListener(buttonClickListener);
//        manageButton.addActionListener(buttonClickListener);
//        settingButton.addActionListener(buttonClickListener);
//        aboutButton.addActionListener(buttonClickListener);
//
//        menu.add(MCSTMixed);
//        menu.add(homeButton);
//        menu.add(downloadButton);
//        menu.add(manageButton);
//        menu.add(settingButton);
//        menu.add(aboutButton);
//        menu.repaint();
//        menu.revalidate();
//
//        frame.add(cardPanel);
//        frame.add(menu);
//        frame.revalidate();
//        frame.repaint();
//    }
//}
