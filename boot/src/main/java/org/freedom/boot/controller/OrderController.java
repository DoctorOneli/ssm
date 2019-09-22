package org.freedom.boot.controller;

import java.util.List;

import org.freedom.boot.bean.Msg;
import org.freedom.boot.bean.OrderItem;
import org.freedom.boot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	/**
	 * 创建订单请求
	 * @param order
	 * @param user_id
	 * @param address_id
	 * @param remark
	 * @return
	 */
	@PostMapping("/order")
	public Msg createOrder(@RequestBody List<OrderItem> order, Integer user_id, Integer address_id, String remark) {

		orderService.createOrder(order, user_id, address_id, remark);
		return Msg.success();
	}

}
