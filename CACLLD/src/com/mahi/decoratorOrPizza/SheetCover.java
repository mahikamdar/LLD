package com.mahi.decoratorOrPizza;

public class SheetCover extends ToppingDecorator{

	Car car;
	public SheetCover(Car car) {
		this.car =car;
	}
	@Override
	public Integer cost() {
		
		return this.car.cost()+2;
	}
	
}
