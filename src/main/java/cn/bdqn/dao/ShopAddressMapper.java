package cn.bdqn.dao;

import cn.bdqn.pojo.ShopAddress;

public interface ShopAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopAddress record);

    int insertSelective(ShopAddress record);

    ShopAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopAddress record);

    int updateByPrimaryKey(ShopAddress record);
}