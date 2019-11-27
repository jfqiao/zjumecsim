package zju.edu.cn.zjumecsim.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Request
 * @Description:
 *  对移动设备发起的请求的抽象，移动设备请求经过一个处理链路
 *  m -> s1 -> s2 -> s3 -> s2 -> s1 -> m,
 *  前面一段为请求链路，后面一段为响应链路，通过direction属性指明请求方向
 *  在edge server中响应SimEvent时，需要根据Request的方向选择发送消息的SimEntity。
 * @Author: jfqiao, Zijie Liu
 * @Date: 2019-11-23 16:26
 * @Version: 1.0
 */
@Data
public class Request {

    /**
     * 请求链路方向
     */
    public static final int REQUEST_DIRECTION = 1;

    /**
     * 响应链路方向，响应链路直接从requestLinks取出实例返回即可。
      */

    public static final int RESPONSE_DIRECTION = 2;

    /**
     * 请求id
     */
    private int reqId;

    private int sourceDeviceId;

    private int appId;

    /**
     * 发送请求的时间
     */
    private double emitTime;

    /**
     * 得到响应的时间
     */
    private double rcvTime;

    /**
     * request需要被处理的service的id
     */
    private String curServiceName;

    /**
     * 当前request的size
     */
    private double curInputSize;

    private List<Double> delays;

    private double putInQueueTime;

    /**
     * 一个请求走过的所有机器名称
     */
    private LinkedList<String> requestLinks;


    public Request(int reqId, int appId, int sourceDeviceId) {
        setReqId(reqId);
        setAppId(appId);
        setSourceDeviceId(sourceDeviceId);
        requestLinks = new LinkedList<>();
        delays = new ArrayList<>();
    }

    public void addLink(String name) {
        requestLinks.add(name);
    }
}
