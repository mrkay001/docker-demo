package mrkay.show.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liukai
 * @date 2022/1/13 22:13
 */
@RestController
public class DockerDemoController {
    @GetMapping("/docker/test")
    public String docker(){
        return "Hello Docker !!!";
    }
}
