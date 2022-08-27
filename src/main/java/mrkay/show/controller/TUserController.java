package mrkay.show.controller;


import cn.hutool.core.collection.ConcurrentHashSet;
import mrkay.show.entity.TUser;
import mrkay.show.service.TUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * (TUser)表控制层
 *
 * @author liukai
 * @since 2022-01-15 13:36:10
 */
@RestController
@RequestMapping("tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    @GetMapping("/all")
    public String listAllUser(){
        List<TUser> list = tUserService.list();
        return list.toString();
    }
    @GetMapping("/{id}")
    public String listAllUser(@PathVariable("id") String id){
        return "您输入的参数为:[" + id + "]";
    }

}

