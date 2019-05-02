package com.redis.Listener;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;

public class redisMessageListener implements MessageListener {
    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    private RedisTemplate redisTemplate;
    @Override
    public void onMessage(Message message, byte[] bytes) {
        byte []body=message.getBody();
        String msgBody=(String)getRedisTemplate().getValueSerializer().deserialize(body);
        System.err.println(msgBody);
        byte [] channel = message.getChannel();
        String channerStr =(String)getRedisTemplate().getValueSerializer().deserialize(channel);
        System.err.println(channerStr);
        String bytesStr=new String(bytes);
        System.err.println(bytesStr);
    }
}
