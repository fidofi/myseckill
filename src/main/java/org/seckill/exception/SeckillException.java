package org.seckill.exception;

/**
 * 秒杀相关的业务异常
 * Created by fido on 2017/4/20.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
