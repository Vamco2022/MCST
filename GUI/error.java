package GUI;

import com.formdev.flatlaf.FlatLightLaf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.Desktop;

public class error {
    private static final Logger logger = LoggerFactory.getLogger(error.class);
    public static void ErrorGUI() {
        FlatLightLaf.install();
        JFrame frame = new JFrame("MCST Mixed Error");
        frame.setLocationRelativeTo(null);
        frame.setSize(275,75);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel error = new JLabel("程序奔溃");

        JButton lookLog = new JButton("查看日志");
        lookLog.addActionListener(e -> {
            try {
                File logFile = new File("./MCST/log");
                if (!logFile.exists()) {
                    logger.error("Log file not found");
                }
                Desktop.getDesktop().open(logFile);
            } catch (Exception ex) {
                logger.error("Error opening log file", ex);
            }
        });
        JButton Restart = new JButton("重启");
        Restart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                initialize.Start();
            }
        });


        frame.add(lookLog);
        frame.add(Restart);
        frame.add(error);
        frame.setVisible(true);
    }
}
