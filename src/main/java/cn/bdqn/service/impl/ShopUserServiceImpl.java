package cn.bdqn.service.impl;

import cn.bdqn.dao.ShopUserMapper;
import cn.bdqn.pojo.ShopUser;
import cn.bdqn.service.ShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
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
    public ShopUser selectByUserName(String name) {
        return shopUserMapper.selectByUserName(name);
    }

    @Override
    public ShopUser selectByPhone(String phone) {
        return shopUserMapper.selectByPhone(phone);
    }

    @Override
    public ShopUser login(ShopUser shopUser) {
        ShopUser loginUser =  shopUserMapper.selectByUserName(shopUser.getUsername());

        if (loginUser == null){
            loginUser =  shopUserMapper.selectByPhone(shopUser.getPhone());
            if (loginUser == null)return null;
        }
        if(!loginUser.getPassword().equals(shopUser.getPassword())){
            return null;
        }
        return loginUser;
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
