package cn.bdqn.service;

import cn.bdqn.pojo.ShopUser;

public interface ShopUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopUser record);

    int insertSelective(ShopUser record);

    ShopUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopUser record);

    int updateByPrimaryKey(ShopUser record);
}
