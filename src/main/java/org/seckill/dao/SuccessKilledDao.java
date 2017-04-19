package org.seckill.dao;


import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by fido on 2017/4/18.
 * 对应秒杀明细表的dao操作
 */
public interface SuccessKilledDao {

    /**
     * 插入秒杀明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据商品ID查询秒杀明细记录
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}

