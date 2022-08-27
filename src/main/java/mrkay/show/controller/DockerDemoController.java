package mrkay.show.controller;

import mrkay.show.utils.ZipFileUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

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

    @GetMapping("/download")
    public void recReportExportBatch(HttpServletRequest request, HttpServletResponse response){
        File file = new File("D:\\usr\\local\\hznldata\\upFile\\other\\report\\测试文件.pdf");
        ZipFileUtils.downloadAnyFile(file,response);
    }


}
