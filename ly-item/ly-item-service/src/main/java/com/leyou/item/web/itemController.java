package com.leyou.item.web;

import com.leyou.common.advice.exception.LyException;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.item.pojo.Item;
import com.leyou.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShangyiChen
 * @date 2020/3/23 11:34
 **/

@RestController
@RequestMapping("item")
public class itemController {
    @Autowired
    private ItemService itemService;
    @PostMapping
    public ResponseEntity<Item> saveItem(Item item){
        //校验价格
        if(item.getPrice() == null || item.getPrice() < 0L){
            throw new LyException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
        item = itemService.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }
}
