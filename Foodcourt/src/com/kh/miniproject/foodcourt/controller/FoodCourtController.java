package com.kh.miniproject.foodcourt.controller;

import java.util.ArrayList;

import com.kh.miniproject.foodcourt.model.vo.FoodCourt;

public class FoodCourtController {
	
	public ArrayList<FoodCourt> foodList = new ArrayList<FoodCourt>();
	
	public FoodCourtController() {
		foodList.add(new FoodCourt("�����", 7000));
		foodList.add(new FoodCourt("������", 3000));
		foodList.add(new FoodCourt("������", 6000));
		foodList.add(new FoodCourt("Ƣ��", 2000));
	}
	
	
	public void PrintkFood() {
		int j=1;
		for(FoodCourt i : foodList) {
			
			System.out.println(j+". "+i);
			j++;
		}
	}
}
