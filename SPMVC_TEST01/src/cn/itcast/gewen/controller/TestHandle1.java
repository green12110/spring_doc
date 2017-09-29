package cn.itcast.gewen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.gewen.pojo.Item;

public class TestHandle1  implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stube
		List<Item> ItemList = new ArrayList<Item>();
		Item item1 = new Item();
		item1.setName("lenovo");
		item1.setPrice(6000f);
		item1.setDetail("Thinkpad T456 联系笔记本");
		
		
		Item item2 = new Item();
		item2.setName("IBM");
		item2.setPrice(8500.9f);
		item2.setDetail("IBM RE2330 联系笔记本");
		ItemList.add(item1);
		ItemList.add(item2);
		
		ModelAndView mv = new ModelAndView();
		//指定视图
		mv.setViewName("/WEB-INF/jsp/itemsList.jsp");
		//为request设置Attribute
		mv.addObject("itemList",ItemList);
		return mv;
	}

}
