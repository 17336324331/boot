package com.cry.constant;

/**
 * @author cry
 * @date 2020年12月11日 11:57
 * @description
 */
public interface ErrorMessages {

    //通用正常 success
    int CODE_SUCCESS = 0;
    //默认内容
    String MSG_SUCCESS = "success !!";

    //通用异常 system error
    int CODE_ERR_COMMON = -1;
    //默认内容
    String MSG_ERR_COMMON = "system error !!";

    //通用异常 data not found
    int CODE_ERR_NOT_FOUND = -2;
    //默认内容
    String MSG_ERR_NOT_FOUND  = "data not found !!";

    //通用异常 data not found
    int CODE_ERR_AUTH = -3;

    //通用异常 data not found
    int CODE_ERR_TIMED_OUT = -4;
    //默认内容
    String MSG_ERR_TIMED_OUT = "请求超时，请稍后重试 !";
}
