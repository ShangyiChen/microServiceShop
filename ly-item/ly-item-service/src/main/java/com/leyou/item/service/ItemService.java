package com.leyou.item.service;

import com.leyou.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author ShangyiChen
 * @date 2020/3/23 11:32
 **/
@Service
public class ItemService {
    public Item saveItem(Item item){
        //商品新增
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
