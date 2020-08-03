package com.kh.homework.shape.controller;

import com.kh.homework.shape.model.vo.Shape;

public class ShapeController {
	private Shape s = new Shape();
	
	public double calcPerimeter(int type, double height, double width) {
		s.setType(type);
		s.setHeight(height);	
		s.setWidth(width);
		
		return (width + height) * 2;
		
	}
	
	public double calcArea(int type, double height, double width) {
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);
		double result = 0.0;
		if(type == 3) {
			result =  (height * width) * 0.5;
		}else if(type == 4) {
			result = height * width;
		}
		
		return result;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
		s.toString();
	}
	
	@Override
	public String toString() {
		return "µµÇüÀº" + s.getType() + s.toString();
	}
	
}
