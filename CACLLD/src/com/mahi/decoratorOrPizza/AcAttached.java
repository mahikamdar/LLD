package com.mahi.decoratorOrPizza;

public class AcAttached extends ToppingDecorator{

	Car car;
	public AcAttached(Car car) {
		super();
		this.car = car;
	}

	@Override
	public Integer cost() {
	
		return this.car.cost()+10;
	}

}
