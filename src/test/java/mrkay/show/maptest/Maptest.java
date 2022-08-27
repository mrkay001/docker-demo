package mrkay.show.maptest;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liukai
 * @date 2022/4/15 11:04
 */
public class Maptest {
    @Test
    public void test(){
        //Student student = new Student("张三", "123");
        //Map<String, Student> map = new HashMap<>();
        //map.put("student", student);
        //String string = map.toString();
        //System.out.println(string);

        //JSON json = JSONUtil.parse(map);
        //String jsonStr = JSONUtil.toJsonStr(json);
        //System.out.println(jsonStr);

        BigDecimal a = new BigDecimal(0.1);
        System.out.println(a); // 0.1000000000000000055511151231257827021181583404541015625

        BigDecimal b = new BigDecimal("0.1");
        System.out.println(b); // 0.1


    }
}
