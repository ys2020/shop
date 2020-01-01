package cn.bdqn.dao;

import cn.bdqn.pojo.ShopUser;
import org.apache.ibatis.annotations.Param;

public interface ShopUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopUser record);

    int insertSelective(ShopUser record);

    ShopUser selectByPrimaryKey(Integer id);

    ShopUser selectByUserName(@Param("name") String name);

    ShopUser selectByPhone(@Param("phone") String phone);

    ShopUser login(ShopUser shopUser);

    int updateByPrimaryKeySelective(ShopUser record);

    int updateByPrimaryKey(ShopUser record);


}