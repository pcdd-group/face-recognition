package com.example.facerecognition.controller;

import com.example.facerecognition.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pc
 * 2022-04-06 10:19:37
 */
@Slf4j
@RestController
public class MainController {

    @PostMapping("/face")
    public R<Object> face(@RequestBody Object data) {
        log.info("客户端传来的 data：{}", data);

        // TODO 调用人脸识别 API

        return R.ok(data);
    }

}
