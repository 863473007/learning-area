package com.hef.store.dao;

import com.hef.store.db.OrderDao;
import com.hef.store.domain.Item;
import com.hef.store.domain.Order;
import config.RootConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.LinkedHashSet;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void shouldNotNull(){
        Assert.assertNotNull(orderDao);
    }

    @Test
    public void saveOrder(){
        Order order = new Order();
//        order.setId(1L);
        order.setCustomer("xiaoMing");
        order.setType("WEB");
        Set<Item> items =new LinkedHashSet<>();
        Item item = new Item();
//        item.setId(1L);
        item.setPrice(23.9);
        item.setProduct("apple");
        item.setQuantity(3);
        items.add(item);
        order.setItems(items);
        orderDao.saveOrder(order);
    }
}
