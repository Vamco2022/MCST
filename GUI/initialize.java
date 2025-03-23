package GUI;

import javax.swing.*;
// import javax.swing.border.EmptyBorder;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;

import org.json.JSONObject;
import java.lang.StringBuilder;
// import java.util.Locale;
// import java.util.ResourceBundle;
// import java.util.logging.Level;

// import ch.qos.logback.classic.pattern.ClassNameOnlyAbbreviator;
// import com.formdev.flatlaf.themes.FlatMacLightLaf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                            O\ = /O
//                        ____/`---'\____
//                      .   ' \\| |// `.
//                       / \\||| : |||// \
//                     / _||||| -:- |||||- \
//                       | | \\\ - /// | |
//                     | \_| ''\---/'' | |
//                      \ .-\__ `-` ___/-. /
//                   ___`. .' /--.--\ `. . __
//                ."" '< `.___\_<|>_/___.' >'"".
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |
//                 \ \ `-. \_ __\ /__ _/ .-` / /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//
//         .............................................
//                  佛祖保佑             永无BUG
//          佛曰:
//                  写字楼里写字间，写字间里程序员；
//                  程序人员写程序，又拿程序换酒钱。
//                  酒醒只在网上坐，酒醉还来网下眠；
//                  酒醉酒醒日复日，网上网下年复年。
//                  但愿老死电脑间，不愿鞠躬老板前；
//                  奔驰宝马贵者趣，公交自行程序员。
//                  别人笑我忒疯癫，我笑自己命太贱；
//                  不见满街漂亮妹，哪个归得程序员？


public class initialize {
    private static final Logger logger = LoggerFactory.getLogger(initialize.class);
    public static void Start() {
        logger.info("Client initializing...");
        JFrame StartFrame = new JFrame("initializing...");
        StartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        StartFrame.setSize(360, 165);
        StartFrame.setLocationRelativeTo(null);
        StartFrame.setUndecorated(true);
        StartFrame.setVisible(true);

        logger.debug("Load startup picture.");
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL imageUrl = classLoader.getResource("/image/StartImage.png");
        if (imageUrl != null) {
            ImageIcon  StartImage = new ImageIcon(imageUrl);
            JLabel startImage = new JLabel(StartImage);
            StartFrame.add(startImage);
        } else {
            logger.warn("Image null pointer exception!");
        }

        StartFrame.revalidate();
        StartFrame.repaint();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        logger.debug("Check the file.");
        String MCSTFile = ".//MCST";
        File mcstfile = new File(MCSTFile);
        if (!mcstfile.exists()) {
            mcstfile.mkdirs();
        }


        try {
            if (mcstfile.createNewFile()) {
                logger.info("Unable to check the file, initialize initialization boot.");
                startClientIndex();
                StartFrame.dispose();
            } else {
                String testFilePath = "./MCST/test.json";
                File testFile = new File(testFilePath);
                if (testFile.exists()) {
                    BufferedReader reader = new BufferedReader(new FileReader(testFile));
                    String line;
                    StringBuilder content = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        content.append(line);
                    }
                    reader.close();

                    JSONObject jsonObject = new JSONObject(content.toString());
                    String testValue = jsonObject.optString("test");
                    if ("yes".equals(testValue)) {
                        logger.debug("test parameter is yes, initialize initialization boot.");
                        try {
                            startClientIndex();
                        } catch (Exception e) {
                            logger.error("Failed to initialize the initialization boot!", e);
                            error.ErrorGUI();
                        }
                    } else {
                        logger.debug("The test mode is not turned on, and it runs normally.");
                    }
                } else {
                    logger.info("test.json file does not exist, initialize main program normally.");
                }
                StartFrame.dispose();
                startClientIndex();
            }
        } catch (IOException e) {
            logger.error("Failed to create the basic information file!");
            logger.error(e.getMessage());
            error.ErrorGUI();
        }
    }

    public static void startClientIndex(){
        clientIndex.index();
    }
}
