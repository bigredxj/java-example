package org.jingjing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jingjing.util.CommonUtil;

public class Ping {
    private static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public void ping(){
        try {
            String ip = CommonUtil.getClipboardString();
            String cmd = "cmd /c start cmd.exe /k   ping " + ip;
            logger.info(cmd);
            Process process = Runtime.getRuntime().exec(cmd);

        }catch (Exception e){
            logger.error("",e);
        }
    }
}
