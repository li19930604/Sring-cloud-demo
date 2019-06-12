package com.iacs.info.FuseTreatment;

import com.iacs.info.service.IacsDataService;
import org.springframework.stereotype.Component;

/**
 * @author peicj
 * @Description: iacs-data接口调用熔断
 * @date 2019-06-12
 */
@Component
public class DataHystrix implements IacsDataService {

    @Override
    public Object getUser() {
        return FusibleCutout.defaultFallback();
    }
}
