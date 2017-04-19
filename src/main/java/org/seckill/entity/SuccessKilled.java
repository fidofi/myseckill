package org.seckill.entity;

import java.util.Date;

/**
 * Created by fido on 2017/4/18.
 * 商品秒杀成功明细表
 */
public class SuccessKilled {
    private long seckillId;//被秒杀的商品id
    private long userPhone;//秒杀用户的电话号码
    private Date killTime;//秒杀时间
    private short state;//秒杀状态
    private Seckill seckill;//秒杀商品的信息

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getPhone() {
        return userPhone;
    }

    public void setPhone(long phone) {
        this.userPhone = phone;
    }

    public Date getCreateTime() {
        return killTime;
    }

    public void setCreateTime(Date createTime) {
        this.killTime = createTime;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "SuccessKilled [seckillId=" + seckillId + ", phone=" + userPhone
                + ", killTime=" + killTime + ", state=" + state + ", seckill="
                + seckill + "]";
    }


}
