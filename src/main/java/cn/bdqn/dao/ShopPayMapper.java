package cn.bdqn.dao;

import cn.bdqn.pojo.ShopPay;

public interface ShopPayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopPay record);

    int insertSelective(ShopPay record);

    ShopPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopPay record);

    int updateByPrimaryKey(ShopPay record);
}