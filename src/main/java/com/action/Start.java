package com.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Item;
import com.dao.ItemDAO;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contextnew= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Item item=(Item)contextnew.getBean("Item");
		ItemDAO itemDAO=(ItemDAO) contextnew.getBean("ItemDAO");
		item=itemDAO.findById(9);
		System.out.println(item.getNameItem());

	}

}
