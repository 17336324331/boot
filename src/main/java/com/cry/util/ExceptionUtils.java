package com.cry.util;

import cn.hutool.core.util.StrUtil;
import com.cry.constant.ErrorMessages;
import com.cry.exception.BizException;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author cry
 * @date 2020年12月11日 11:42
 * @description 异常处理工具类
 */
@Slf4j
public class ExceptionUtils {

    @Setter
    @Getter
    private static Function<Integer,String> fun;

    public static void notNull(Object obj,String msg){
        if (Objects.isNull(obj)) {
            throwEx(msg);
        }
    }

    public static void notNull(Object obj,String msg,Object... objs){
        if (Objects.isNull(obj)) {
            throwEx(StrUtil.format(msg,objs));
        }
    }

    public static void throwEx(){
        throwEx("System error!!");
    }
    public static void throwEx(String msg){
        log.error("Exception in program execution , cause:{}",msg);
        throw new BizException(msg);
    }

    public static void throwEx(int code){
        log.error("Exception in program execution , code:{}",code);
        if(Objects.isNull(fun)) {
            throw new BizException(ErrorMessages.MSG_ERR_COMMON).setCode(code);
        }
        throw new BizException(fun.apply(code)).setCode(code);
    }

    public static void throwEx(int code,String msg){
        log.error("Exception in program execution , code:{} ,cause:{}",code,msg);
        throw new BizException(msg).setCode(code);
    }
}
