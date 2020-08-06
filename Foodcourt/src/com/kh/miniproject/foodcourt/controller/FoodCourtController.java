package com.kh.miniproject.foodcourt.controller;

import java.util.ArrayList;

import com.kh.miniproject.foodcourt.model.vo.FoodCourt;

public class FoodCourtController {
	
	ArrayList<FoodCourt> foodList = new ArrayList<FoodCourt>();
	
	public FoodCourtController() {
		foodList.add(new FoodCourt("µ»¿Â¬Ó∞≥", 7000));
		foodList.add(new FoodCourt("∫Œ√ﬂ¿¸", 3000));
		foodList.add(new FoodCourt("ºˆ¡¶∫Ò", 6000));
		foodList.add(new FoodCourt("∆¢±Ë", 2000));
	}
	
	
//	public void PrintkFood() {
//		for(int i=0; i<foodList.size(); ++i) {
//			System.out.println(foodList[i]);
//		}
//	}
}
