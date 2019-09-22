package org.freedom.boot.service;

import java.util.Date;
import java.util.List;

import org.freedom.boot.bean.Book;
import org.freedom.boot.bean.Order;
import org.freedom.boot.bean.OrderItem;
import org.freedom.boot.dao.BookMapper;
import org.freedom.boot.dao.OrderItemMapper;
import org.freedom.boot.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderMapper orderMapper;
	
	@Autowired
	OrderItemMapper orderItemMapper;
	
	@Autowired
	BookMapper bookMapper;
	
	
	/**
	 * 创建订单
	 * @param orderList
	 * @param userId
	 * @param addressId
	 * @param remark
	 */
	public void createOrder(List<OrderItem> orderList,Integer userId,Integer addressId,String remark)
	{
	      Order order=new Order(null, new Date(), 0, userId, addressId, false, remark);
		  
	      int result = orderMapper.insertSelective(order);
			System.out.println("插入完成后返回值:" + result);
			System.out.println("自增id是:" + order.getOrderId());
			System.out.println("添加成功");

			for (OrderItem orderItem : orderList) {
				orderItemMapper.insertSelective(orderItem);

				Book book = bookMapper.selectByPrimaryKey(orderItem.getBookId());
				book.setBookCount(book.getBookCount() - orderItem.getCount());
				bookMapper.updateByPrimaryKey(book);
			}
			
			
		
	}
	
	
}
