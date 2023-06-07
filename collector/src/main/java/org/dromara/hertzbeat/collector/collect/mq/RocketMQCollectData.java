package org.dromara.hertzbeat.collector.collect.mq;

import lombok.Data;

import java.util.List;

/**
 * rocketmq采集数据实体类
 *
 * @author ceilzcx
 * @since 5/6/2023
 */
@Data
public class RocketMQCollectData {

    private List<ClusterBrokerData> clusterBrokerDataList;

    private List<ConsumerInfo> consumerInfoList;

    @Data
    public static class ClusterBrokerData {

        private Long brokerId;

        private String address;

        private String version;

        private double producerMessageTPS;

        private double consumerMessageTPS;

        private long yesterdayProduceCount;

        private long todayProduceCount;

        private long yesterdayConsumeCount;

        private long todayConsumeCount;
    }

    @Data
    public static class ConsumerInfo {

        private String consumerGroup;

        private int clientQuantity;

        private String messageModel;

        private String consumeType;

        private double consumeTps;

        private long diffTotal;
    }
}
