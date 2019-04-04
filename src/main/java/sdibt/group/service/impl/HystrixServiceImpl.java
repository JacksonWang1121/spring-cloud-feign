package sdibt.group.service.impl;


import org.springframework.stereotype.Component;
import sdibt.group.service.FeignService;

/**
 * @author wangjisen
 * @date 2019/3/29 16:04
 */
@Component
public class HystrixServiceImpl implements FeignService {

    @Override
    public String showHome(String name) {
        return "Sorry "+name;
    }
}
