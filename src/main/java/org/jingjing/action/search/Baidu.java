package org.jingjing.action.search;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jingjing.util.CommonUtil;
import org.jingjing.util.PropertiesUtil;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Baidu implements Search{
    private static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public void search() {
        try {
            String browser = PropertiesUtil.getProperty("browser");
            logger.info(browser);
            String domain = PropertiesUtil.getProperty("baidu.domain");
            String browserPath = PropertiesUtil.getProperty(browser.toLowerCase()+".path").replaceAll(" ","\" \"");
            String context = CommonUtil.getClipboardString();

            System.out.println(context);
            String cmd ="cmd /c start "+ browserPath +" "+domain+"/s?wd="+context;
            logger.info(cmd);
            Runtime.getRuntime().exec(cmd);
        }catch (Exception e){
            logger.error("",e);
        }
    }
}
