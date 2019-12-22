package com.yw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yewei
 * @Date: 2019/11/1 19:16
 */
@Controller
@RequestMapping("/")
public class testController {
    @RequestMapping("index")
    public String tests(){
        return "index";
    }
}
