package cn.bdqn.service.impl;

import cn.bdqn.BaseTest;
import cn.bdqn.pojo.ShopUser;
import cn.bdqn.service.ShopUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ShopUserServiceImplTest extends BaseTest {
    @Autowired
    private ShopUserService shopUserService;
    @Test
    public void insert() throws Exception {
        ShopUser su =new ShopUser("dddd","dddd","2343242@.COM","13244554455");
        int ii =shopUserService.insert(su);
        System.out.println(ii);
    }

}