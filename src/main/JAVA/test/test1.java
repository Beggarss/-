package test;

import com.model.User;
import org.apache.ibatis.cache.decorators.SynchronizedCache;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;

public class test1 {
    public static void main(String args[]) {
        String s1 = "Hello";

        String s2 = new String("Hello");
        System.out.println( s1 == s2);
    }
}
class SingleTon{
    private static final SingleTon instance = new SingleTon();
    private SingleTon(){}
    public SingleTon getInstance(){
        return instance;
    }
}
class SingleTon1{
    private volatile static  SingleTon1 instance =null;
    private SingleTon1(){}
    public SingleTon1 getInstance(){
        if(instance==null){
            synchronized(SingleTon1.class){
                instance = new SingleTon1();
            }
        }
        return  instance;
    }
}

