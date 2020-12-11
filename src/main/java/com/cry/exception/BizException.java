package com.cry.exception;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author cry
 * @date 2020年12月11日 11:42
 * @description 业务异常
 */
@Getter
@Setter
@Accessors(chain = true)
public class BizException extends RuntimeException{
    private int code = -1;

    public BizException(String msg){
        super(msg);
    }
}
