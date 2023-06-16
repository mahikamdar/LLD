package com.mahi.decoratorOrPizza;

public class DoorProctector extends ToppingDecorator{
	
	Car car ;
	public DoorProctector(Car car) {
		
		this.car = car;
	}

	@Override
	public Integer cost() {
		
		return this.car.cost()+1;
	}

}
