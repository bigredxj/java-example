package org.jingjing.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {
    private static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    public static Properties properties = new Properties();

    static {
        try {
            // 使用InPutStream流读取properties文件
            FileInputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir") +
                    File.separator + "conf" + File.separator + "app.properties"));
            properties.load(inputStream);
        }catch (Exception e){
            logger.error("",e);
        }
    }

    public static String getProperty(String str) {
        return properties.getProperty(str);
    }
}
