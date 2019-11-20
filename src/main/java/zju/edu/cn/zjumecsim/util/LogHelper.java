package zju.edu.cn.zjumecsim.util;

import zju.edu.cn.zjumecsim.config.LogTypeConfig;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: LogHelper
 * @Description: TODO
 * @Author: Zijie Liu
 * @Date: 2019-11-20 15:29
 * @Version: 1.0
 */
public class LogHelper {
    public static void write(String msg, LogTypeConfig logType) throws IOException {
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat df2 = new SimpleDateFormat("HH:mm:SS");
        String basePath = System.getProperty("user.dir") + "/logfile/";
        String logPath = basePath + df1.format(new Date()) + ".txt";
        File myPath = new File(basePath);
        Date date = new Date(System.currentTimeMillis());
        if (!myPath.exists()){//若此目录不存在，则创建之
            myPath.mkdir();
            System.out.println("创建文件夹路径为："+ basePath);
        }
        try {
            FileWriter fw = new FileWriter(logPath,true);
            String message = String.format("%s %s - %s \n",
                    logType, date.getTime(), msg);
            System.out.println(message);
            fw.write(message);
            // 关闭写文件,每次仅仅写一行数据，因为一个读文件中仅仅一个唯一的od
            fw.close();
        } catch (IOException e){
            throw new IOException("日志写入异常:" + e.toString());
        }
    }
}
