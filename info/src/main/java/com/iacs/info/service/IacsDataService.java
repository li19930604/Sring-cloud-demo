package com.iacs.info.service;

import com.iacs.info.FuseTreatment.DataHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author peicj
 * @Description: data服务调用接口类
 * @date 2019-06-12
 */
@Service
@FeignClient(value = "iacs-data",fallback = DataHystrix.class)//configuration：用于记录，拦截器等额外配置
public interface IacsDataService {

    @GetMapping(value = "/test/getUser")
    Object getUser();
}
