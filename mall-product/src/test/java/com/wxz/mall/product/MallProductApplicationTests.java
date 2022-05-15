package com.wxz.mall.product;

import com.wxz.mall.product.entity.AttrEntity;
import com.wxz.mall.product.service.AttrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
//首先注入一个service
    @Autowired
    AttrService attrService;
    @Test
    void contextLoads() {
        AttrEntity entity = new AttrEntity();
        entity.setAttrId(17l);
        entity.setValueSelect("中国华为");
//        entity.setAttrName("中华有位");
        attrService.save(entity);
        System.out.println("保存成功");
    }

}
