package cn.bdqn.service;

import cn.bdqn.pojo.ShopUser;

public interface ShopUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopUser record);

    int insertSelective(ShopUser record);

    ShopUser selectByPrimaryKey(Integer id);

    ShopUser selectByUserName(String name);

    ShopUser selectByPhone(String phone);

    ShopUser login(ShopUser shopUser);

    int updateByPrimaryKeySelective(ShopUser record);

    int updateByPrimaryKey(ShopUser record);
}
