package cn.bdqn.dao;

import cn.bdqn.pojo.ShopOrderItem;

public interface ShopOrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrderItem record);

    int insertSelective(ShopOrderItem record);

    ShopOrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopOrderItem record);

    int updateByPrimaryKey(ShopOrderItem record);
}