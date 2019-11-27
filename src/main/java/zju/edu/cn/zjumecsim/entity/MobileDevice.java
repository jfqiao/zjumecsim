package zju.edu.cn.zjumecsim.entity;

import lombok.Data;
import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;
import org.cloudbus.cloudsim.distributions.ContinuousDistribution;
import zju.edu.cn.zjumecsim.scheduler.local.RequestLocalScheduler;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: Request
 * @Description:移动设备的表示类。
 * @Author: jfqiao, Zijie Liu
 * @Date: 2019-11-23 16:26
 * @Version: 1.0
 */

@Data
public class MobileDevice extends SimEntity {

    public MobileDevice(String name) {
        super(name);
    }

    /**
     * 记录设备所有的发出去的请求，可以不用记录，视具体情况看是否需要该参数
     */
    private List<Request> requests;

    /**
     * 通过id查询每个request
     */
    private Map<Integer, Request> requestMap;

    /**
     * 每个request的长度
     */
    private long reqSize;

    /**
     * 设备发出请求的间隔时间
     */
    private ContinuousDistribution distribution;

    /**
     * 设备所请求的应用id
     */
    private int appId;


    /**
     * app第一个app service名称
     */
    private String appFirstServiceName;

    /**
     * 平均请求时延
     */
    private double avgLantency;

    /**
     * 调度器
     */
    private RequestLocalScheduler scheduler;

    /**
     * 停止发送请求
     */
    private boolean stopSendReq;

    /**
     * 接入边缘服务器id
     */
    private int accessEdgeServerId;

    /**
     * 接收到回复的请求数量
     */
    private int reqCnt;

    @Override
    public void startEntity() {
        
    }

    @Override
    public void processEvent(SimEvent simEvent) {

    }

    @Override
    public void shutdownEntity() {

    }
}
