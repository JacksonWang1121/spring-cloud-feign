package sdibt.group.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sdibt.group.service.impl.HystrixServiceImpl;

/**
 * @author wangjisen
 * @date 2019/3/29 9:29
 */
@FeignClient(value = "service-client", fallback = HystrixServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/cloud-client", method = RequestMethod.GET)
    String showHome(@RequestParam(value = "name") String name);

}
