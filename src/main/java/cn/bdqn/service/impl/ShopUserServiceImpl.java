package cn.bdqn.service.impl;

import cn.bdqn.dao.ShopUserMapper;
import cn.bdqn.service.ShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopUserServiceImpl implements ShopUserService {
    @Autowired
    private ShopUserMapper shopUserMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return shopUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShopUser record) {
        return shopUserMapper.insert(record);
    }

    @Override
    public int insertSelective(ShopUser record) {
        return shopUserMapper.insertSelective(record);
    }

    @Override
    public ShopUser selectByPrimaryKey(Integer id) {
        return shopUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopUser record) {
        return shopUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopUser record) {
        return shopUserMapper.updateByPrimaryKey(record);
    }
}
