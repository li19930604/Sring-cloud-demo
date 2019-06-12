package com.iacs.info.FuseTreatment;

/**
 * @author peicj
 * @Description: 熔断器处理
 * @date 2019-06-12
 */
public class FusibleCutout {

    /**
     *  默认熔断器
     * @return 服务器出错
     */
    public static Object defaultFallback(){ return "服务器出错，请联系管理员！"; }

    /**
     *  自定义熔断器
     * @return 系统繁忙
     */
    public static String fallback(){ return "系统繁忙，请稍后重试！"; }
}
