package com.study.demo.bootconsumer.listener;

import com.alibaba.fastjson.JSONObject;
import com.study.demo.bootconsumer.domain.dto.UserDTO;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "test", consumerGroup = "consumerGroup1")
public class TestMqListener implements RocketMQListener<MessageExt> {
    @Override
    public void onMessage(MessageExt messageExt) {
        System.out.println(new String(messageExt.getBody()));
        UserDTO dto = JSONObject.parseObject(new String(messageExt.getBody()), UserDTO.class);
        System.out.println(dto.getUserId()+"  :   "+dto.getUserName());
        System.out.println("消息 :" + messageExt.getBody() + "  消息id：" + messageExt.getMsgId());
    }
}
