package org.seckill.exception;

import org.seckill.dto.SeckillExecution;

/**
 * 秒杀关闭异常（时间到了或者库存没了）
 * Created by fido on 2017/4/20.
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
