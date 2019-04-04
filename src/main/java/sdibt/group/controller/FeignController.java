package sdibt.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sdibt.group.service.FeignService;

/**
 * @author wangjisen
 * @date 2019/3/29 9:36
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/home")
    public String showNameByHome(@RequestParam(value = "name") String name) {
        return feignService.showHome(name);
    }

}
