package org.seckill.dao;


import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by fido on 2017/4/18.
 * 对应商品库存表的dao操作
 */
public interface SeckillDao {

    /**
     * 减库存量的操作
     *
     * @param seckillId
     * @param killTime
     * @return 对应表中被更新的记录数
     */
    int reduceNum(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据ID查找对应商品的对象
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 查询所有秒杀商品，并便于分页操作
     * 用@Param这个注解就是便于传递给mapper的时候，分清楚哪个参数对应哪个，因为java传的是形参
     *
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offet") int offet, @Param("limit") int limit);


}
