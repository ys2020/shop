package cn.bdqn.dao;

import cn.bdqn.pojo.ShopCategory;

public interface ShopCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopCategory record);

    int insertSelective(ShopCategory record);

    ShopCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopCategory record);

    int updateByPrimaryKey(ShopCategory record);
}