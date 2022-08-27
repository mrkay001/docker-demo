package mrkay.show.jedis;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.support.json.JSONUtils;
import mrkay.show.entity.TUser;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.UnifiedJedis;
import redis.clients.jedis.json.Path;
import redis.clients.jedis.providers.PooledConnectionProvider;

import java.util.Date;
import java.util.Map;

/**
 * Jedis测试类
 *
 * @author liukai
 * @date 2022/3/3 14:08
 */
//@SpringBootTest
public class JedisTest {
    @Test
    public void test() {
        //HostAndPort config = new HostAndPort("192.168.50.130", 6379);
        //PooledConnectionProvider provider = new PooledConnectionProvider(config);
        //UnifiedJedis jedisClient = new UnifiedJedis(provider);
        //Date now = new Date();
        //TUser tUser = new TUser(1L, "testName3", "12345", now, now);
        //String json = jedisClient.jsonSet("tUser:003", Path.ROOT_PATH, tUser);
        //Map map = (Map) jedisClient.jsonGet("tUser:001");



    }
}
